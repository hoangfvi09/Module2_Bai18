package TH3;

public class Main {

    public static void main(String args[]) throws InterruptedException {
        Count count = new Count();
        while(count.getMyThread().isAlive())
        {
            System.out.println("Main thread will be alive till the child thread is live");
                            Thread.sleep(1500);
        }
        System.out.println("Main thread run is over" );
    }
}
