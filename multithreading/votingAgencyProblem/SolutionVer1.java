package multithreading.votingAgencyProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;


// This solution is not providing the fair access and allowing one party to uriniate
// then only the second party urinates
public class SolutionVer1 {
    private static final String REPUBILCAN = "republican";
    private static final String DEMOCRATE = "democrate";
    private Semaphore repSem;
    private Semaphore demSem;
    private AtomicInteger repWaitCount;
    private AtomicInteger demWaitCount;
    private AtomicInteger repDoneCount;
    private AtomicInteger demDoneCount;
    SolutionVer1() {
        repSem = new Semaphore(3);
        demSem = new Semaphore(3);
        repWaitCount = new AtomicInteger(0);
        demWaitCount = new AtomicInteger(0);
        repDoneCount = new AtomicInteger(0);
        demDoneCount = new AtomicInteger(0);
    }

    private void useToilet(String candType) {
        if(candType.equals(REPUBILCAN)) {
            repWaitCount.incrementAndGet();
            while(demSem.availablePermits() < 3 || (demDoneCount.get() + 3 < repDoneCount.get())) {

            }
            try {
                repSem.acquire();
                repWaitCount.decrementAndGet();
                Thread.sleep(1000); //urinate
                System.out.println(Thread.currentThread().getName() + "urinated");
                repDoneCount.incrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                repSem.release();
            }
        } else {
            demWaitCount.incrementAndGet();
            while(repSem.availablePermits() < 3 || (repDoneCount.get() + 5 < demDoneCount.get())) {

            }
            try {
                demSem.acquire();
                demWaitCount.decrementAndGet();
                Thread.sleep(1000); //urinate
                System.out.println(Thread.currentThread().getName() + "urinated");
                demDoneCount.incrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                demSem.release();
            }
        }
        System.out.println("Demo count: " + demDoneCount + "   Rep Count:   " + repDoneCount);
    }

    public static void main(String[] args) {
        SolutionVer1 sol = new SolutionVer1();
        List<Thread> demThreads = new ArrayList<>();
        List<Thread> repThreads = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            Thread demThread = new Thread(() -> {
                sol.useToilet(DEMOCRATE);
            }, "democrate" + i);
            Thread repThread = new Thread(() -> {
                sol.useToilet(REPUBILCAN);
            }, "republican" + i);
            // demThread.start();
            repThread.start();
            demThread.start();
        }

        for(Thread t : demThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for(Thread t : repThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


//How to ensure the fair access
// Let's have 2 variable demoVotedCount, repVotedCount
// if demoVatedCount > repVotedCount + 5 and republicans are in waiting queue, we will not allow democrates
// Same we will for repr