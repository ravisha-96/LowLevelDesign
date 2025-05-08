import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Website website = new Website(10);

        //Create multiple threads
        //Let us create 100 threads

        for(int i = 0; i < 10; i++) {
            Thread t = new Thread (
                () -> {
                    // System.out.println("thread ");
                    //Generate a random number between 1 and 1000
                    for(int k = 0; k < 10; k++) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(10);
                        website.getWebpage(randomNumber).incrementVisitCount();
                        System.out.println(randomNumber + " " + website.getWebpage(randomNumber).getHitCount());
                    }
                }
            );
            t.start();
        }
    }
}


