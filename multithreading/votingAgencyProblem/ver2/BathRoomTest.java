package multithreading.votingAgencyProblem.ver2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BathRoomTest {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        Bathroom bathroom = new Bathroom();
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Thread t1 = new Thread(createTask(Bathroom.DEMOCRATES, bathroom));
            Thread t2 = new Thread(createTask(Bathroom.REPUBLICAN, bathroom));
            t1.start();
            t2.start();
            threads.add(t1);
            threads.add(t2);
        }

        for(Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(LocalTime.now());
    }

    private static Runnable createTask(String party, Bathroom bathroom) {
        return () -> {
            try {
                bathroom.enterBathroom(party);
                Thread.sleep(1000); //using bathroom
                bathroom.leaveBathroom(party);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            
        };
    }
}
