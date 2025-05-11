package multithreading.basics.future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SubmitUseCasesExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
            2,
            5,
            1,
            TimeUnit.HOURS,
            new ArrayBlockingQueue<>(10),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

        //Usecase1 -> Runnable
        Future<?> futureObj1 = poolExecutor.submit(() -> {
            System.out.println("Task1 with runnable");
        });

        try{
            Object obj = futureObj1.get();
            System.out.println("Task1 completed " + obj.equals(null));
        } catch(Exception e) {

        }

        //Usecase2 -> Runnable with return object
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObj2 = poolExecutor.submit(() -> {
            output.add(new Random().nextInt(100));
            output.add(new Random().nextInt(100));
            output.add(new Random().nextInt(100));
            System.out.println("Task2 with Runnable and return object");
        }, output);

        try{
            List<Integer> output2 = futureObj2.get();
            System.out.println(output2);
        } catch(Exception e) {

        }

        //Usecase3 -> Callable

        Future<List<Integer>> futureObj3 = poolExecutor.submit(() -> {
            List<Integer> lst = List.of(12, 32, 45, 23);
            return lst;
        });

        try {
            List<Integer> returnedList = futureObj3.get();
            System.out.println("Task 3 callable returned value " + returnedList);
        } catch(Exception e) {

        }

        poolExecutor.shutdown();
    }
}
