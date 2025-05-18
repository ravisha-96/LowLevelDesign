package multithreading.footballPractice.ver2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class FootballGroundVer2Test {
    public static void main(String[] args) {
        FootballGroundVer2 ground = new FootballGroundVer2();
        List<Thread> teamAThreads = new ArrayList<>();
        List<Thread> teamBThreads = new ArrayList<>();
        //Create 15 threads of team A
        for(int i = 0; i < 15; i++) {
            Thread t = new Thread(createTask(FootballGroundVer2.TEAM_A, ground), FootballGroundVer2.TEAM_A + i);
            t.start();
            teamAThreads.add(t);
        }
        System.out.println(LocalDateTime.now());

        for(int i = 0; i < 20; i++) {
            Thread t = new Thread(createTask(FootballGroundVer2.TEAM_B, ground), FootballGroundVer2.TEAM_B + i);
            t.start();
            teamBThreads.add(t);
            try {
                if(i < 16) {
                    Thread.sleep(300);
                } else {
                    Thread.sleep(2000);
                }
                
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(LocalDateTime.now() + " " + (i + 1) + " threads of teamB created");
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

    private static Runnable createTask(String team, FootballGroundVer2 footballGround)  {
        return () -> {
            try{
                footballGround.enterGround(team);
                //New line added here in comparison to ver1
                //A player can play at max for 5 secs
                // LocalDateTime starDateTime = LocalDateTime.now();
                // LocalDateTime endDateTime = starDateTime.plusSeconds(5);
                // && endDateTime.isAfter(LocalDateTime.now())
                while (footballGround.currTeam.equals(team)) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + " playing");
                }
                footballGround.leaveGround(team);
            } catch(InterruptedException ex) {

            }
        };
    }
}
