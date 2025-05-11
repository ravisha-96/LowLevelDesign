package multithreading.basics.executors;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class WorkStealingPoolExecutor {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool(); //Imp
        Future<Integer> futureObj = forkJoinPool.submit(new ComputeSumTask(0, 1000000000)); //Imp
        try{
            System.out.println(futureObj.get());
        } catch (Exception ex) {

        }
        //RecursiveAction can be used in cases where we don't want any result to be returned
        //Ex. - Sorting a large array, where each small part will be sorted on a separate core
    }
}

class ComputeSumTask extends RecursiveTask<Integer> {
    int start;
    int end;

    ComputeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    protected Integer compute() {
        if(end - start <= 4) {
            int totalSum = 0;
            for(int i = start; i <= end; i++) {
                totalSum += i;
            }
            return totalSum;
        }
        //split the task
        int mid = (start  + end)/2; 
        ComputeSumTask leftSubTask = new ComputeSumTask(start, mid);
        ComputeSumTask rightSubTask = new ComputeSumTask(mid + 1, end);

        //Fork the subtask for parrallel execution
        leftSubTask.fork();
        rightSubTask.fork();

        //combine the results of the task
        int leftResult = leftSubTask.join();
        int rightResult = rightSubTask.join();
        
        return leftResult + rightResult;
    }
}

// class ComputeSumAction extends RecursiveAction {
//     int start;
//     int end;


//     ComputeSumAction(int start, int end) {
//         this.start = start;
//         this.end = end;
//     }

//     @Override
//     protected void compute() {
//         if(end - start <= 4) {
//             int totalSum = 0;
//             for(int i = start; i <= end; i++) {
//                 totalSum += i;
//             }
//         }
//         //split the task
//         int mid = (start  + end)/2; 
//         ComputeSumTask leftSubTask = new ComputeSumTask(start, mid);
//         ComputeSumTask rightSubTask = new ComputeSumTask(mid + 1, end);

//         //Fork the subtask for parrallel execution
//         leftSubTask.fork();
//         rightSubTask.fork();

//         //combine the results of the task
//         int leftResult = leftSubTask.join();
//         int rightResult = rightSubTask.join();
        
//         System.out.println(start + " " + end + " " +totalSum);;
//     }

// }
