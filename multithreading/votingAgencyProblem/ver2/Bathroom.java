package multithreading.votingAgencyProblem.ver2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Bathroom {
    private static final int MAX_ALLOWED = 3;
    public static final String REPUBLICAN = "republican";
    public static final String DEMOCRATES = "democrates";
    ReentrantLock lock;
    Condition demoQueue;
    Condition repQueue;
    int membersInBathroom = 0;
    String currParty;
    int doneDemocrates = 0;
    int doneRepublicans = 0;
    int waitingDemocrats = 0;
    int waitingRepublicans = 0;
    Bathroom() {
        this.lock = new ReentrantLock();
        this.demoQueue = lock.newCondition();
        this.repQueue = lock.newCondition();
        this.currParty = null;
    }

    void enterBathroom(String party) {
        lock.lock();
        try {
            if (party.equals(DEMOCRATES)) waitingDemocrats++;
            else waitingRepublicans++;

            while((currParty != null && !currParty.equals(party)) || membersInBathroom == MAX_ALLOWED) {
                System.out.printf("[%s-%s] BLOCKED. Bathroom has %d from %s%n", party, Thread.currentThread().getName(), membersInBathroom, currParty);
            
                if(party.equals(DEMOCRATES)) {
                    demoQueue.await();
                } else {
                    repQueue.await();
                }
                
            }
            currParty = party;
            membersInBathroom++;
            System.out.printf("[%s-%s] ENTERED. Members in bathroom: %d  Party: %s%n", party, Thread.currentThread().getName(), membersInBathroom, currParty);
            
        } catch(InterruptedException ex) {

        } finally {
            if (party.equals(DEMOCRATES)) waitingDemocrats--;
            else waitingRepublicans--;
            lock.unlock();
        }
    }

    void leaveBathroom(String party) {
        lock.lock();
        try{
            membersInBathroom--;
            if(party.equals(REPUBLICAN)) {
                doneRepublicans++;
            } else {
                doneDemocrates++;
            }
            System.out.printf("[%s-%s] LEFT. Remaining: %d%n", party, Thread.currentThread().getName(), membersInBathroom);
            if(membersInBathroom == 0) {
                if(currParty.equals(DEMOCRATES) && waitingDemocrats > 0) {
                    currParty = REPUBLICAN;
                } else if(currParty.equals(REPUBLICAN) && waitingRepublicans > 0){
                    currParty = DEMOCRATES;
                } else {
                    currParty = null;
                }
                demoQueue.signalAll();
                repQueue.signalAll();
            } else {
                if(party.equals(DEMOCRATES)) {
                    if(doneDemocrates - doneRepublicans < 5 || waitingRepublicans == 0) {
                        demoQueue.signal();
                    }
                } else {
                    if(doneRepublicans - doneDemocrates < 5 || waitingDemocrats == 0) {
                        repQueue.signal();
                    }
                    
                }
            }
            
        } finally {
            lock.unlock();
        }
    }
}