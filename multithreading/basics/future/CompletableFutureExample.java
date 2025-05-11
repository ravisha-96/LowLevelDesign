package multithreading.basics.future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//Completable future is advanced version of Future with chaining capability
// supplyAsync
// thenApply
// thenCompose
// thenAccept
// thenCombine

public class CompletableFutureExample {
    public static void main(String[] args) {

        // Completable future without executors
        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
            return "ravi";
        }).thenApply((String firstName) -> {
            return firstName + " Shankar";
        }).thenApply((String firstMiddleName) -> {
            return firstMiddleName + " Kumar";
        });
        try {
            System.out.println(asyncTask1.get()); // blocking vall
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // completable future with executors
        ExecutorService executor = new ThreadPoolExecutor(
                2,
                5,
                1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
            return "ravi";
        }, executor).thenApply((String firstName) -> {
            return firstName + " Shankar";
        }).thenApply((String firstMiddleName) -> {
            return firstMiddleName + " prasad";
        });
        try {
            System.out.println(asyncTask2.get()); // blocking vall
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //compose
        //Next async operation depends on the previous async operation
        CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "I am";
        }, executor).thenCompose((String val) -> {
            return CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return val + " Anthony";
            });
        });


        try {
            System.out.println(asyncTask3.get()); // blocking vall
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        //thenAccept
        //Used in the end stage of the chaining
        //It does not return anything
        CompletableFuture<Void> asyncTask4 = CompletableFuture.supplyAsync(() -> {
            return "ravi";
        }, executor).thenApply((String firstName) -> {
            return firstName + " Shankar";
        }).thenAccept((String firstMiddleName) -> {
            System.out.println(firstMiddleName + " kumar gupta");
        });

        try {
            System.out.println(asyncTask4.get()); // blocking vall, it will return null
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



        //combine
        CompletableFuture<String> combinedTask = asyncTask2.thenCombine(asyncTask2, (String val1, String val2) -> {
            return val1 + " " + val2;
        }).thenApplyAsync((String combinedVal) -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return "In ApplyAsnc : " + "final Val: " + "My names are: " + combinedVal;
        });

        try {
            System.out.println(combinedTask.get()); // blocking vall, it will return null
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
