package multithreading.footballPractice.ver1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class FootballGround {
    public static final int MAX_ALLOWED_PLAYER = 10;
    public static final String TEAM_A = "teamA";
    public static final String TEAM_B = "teamB";
    ReentrantLock lock;
    Condition teamAQueue;
    Condition teamBQueue;
    int currPlayerInGround;
    int waitingPlayerTeamA;
    int waitingPlayerTeamB;
    String currTeam;

    FootballGround() {
        lock = new ReentrantLock();
        currPlayerInGround = 0;
        waitingPlayerTeamA = 0;
        waitingPlayerTeamB = 0;
        teamAQueue = lock.newCondition();
        teamBQueue = lock.newCondition();
        currTeam = null;
    }

    public void enterGround(String playerTeam) {
        lock.lock();
        try{
            if(playerTeam.equals(TEAM_A)) {
                waitingPlayerTeamA++;
            } else {
                waitingPlayerTeamB++;
            }
            while((currTeam != null && !playerTeam.equals(currTeam)) || currPlayerInGround == MAX_ALLOWED_PLAYER) {
                System.out.println(Thread.currentThread().getName() + " Waiting as ground has " + currPlayerInGround + " players of team " + currTeam);
                if(playerTeam.equals(TEAM_A)) {
                    teamAQueue.await();
                } else {
                    teamBQueue.await();
                }
            }
            currTeam = playerTeam;
            currPlayerInGround++;
        } catch(Exception ex) {

        } finally {
            if(playerTeam.equals(TEAM_A)) {
                waitingPlayerTeamA--;
            } else {
                waitingPlayerTeamB--;
            }
            lock.unlock();
        }
    }

    public void leaveGround(String playerTeam) {
        lock.lock();
        try {
            currPlayerInGround--;
            if(currPlayerInGround == 0) {
                //Give chance to the other team
                if(currTeam.equals(TEAM_A) && waitingPlayerTeamB > 0) {
                    currTeam = TEAM_B;
                    teamBQueue.signalAll();
                } else if(currTeam.equals(TEAM_B) && waitingPlayerTeamA > 0){
                    currTeam = TEAM_A;
                    teamAQueue.signalAll();
                } else {
                    currTeam = null;
                    teamAQueue.signalAll();
                    teamBQueue.signalAll();
                }
            } else {
                if(playerTeam.equals(TEAM_A)) {
                    teamAQueue.signal();
                }
                if(playerTeam.equals(TEAM_B)) {
                    teamBQueue.signal();
                }
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + "left the ground");
            lock.unlock();
        }
    }
}

//We will need to provide some variables while doing thread.sleep, so that all threads execute leaveground and leave