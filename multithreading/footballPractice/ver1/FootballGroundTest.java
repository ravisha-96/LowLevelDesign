package multithreading.footballPractice.ver1;

import java.util.ArrayList;
import java.util.List;


public class FootballGroundTest {
    public static void main(String[] args) {
        FootballGround ground = new FootballGround();
        List<Thread> teamAThreads = new ArrayList<>();
        List<Thread> teamBThreads = new ArrayList<>();
        //Create 15 threads of team A
        for(int i = 0; i < 15; i++) {
            Thread t = new Thread(createTask(FootballGround.TEAM_A, ground), FootballGround.TEAM_A + i);
            t.start();
            teamAThreads.add(t);
        }

        for(int i = 0; i < 20; i++) {
            Thread t = new Thread(createTask(FootballGround.TEAM_B, ground), FootballGround.TEAM_B + i);
            t.start();
            teamBThreads.add(t);
        }

        for(Thread t : teamAThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(Thread t : teamBThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static Runnable createTask(String team, FootballGround footballGround)  {
        return () -> {
            try{
                footballGround.enterGround(team);
                Thread.sleep(3000);
                footballGround.leaveGround(team);
            } catch(InterruptedException ex) {

            }
        };
    }
}
