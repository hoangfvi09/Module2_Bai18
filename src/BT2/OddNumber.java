package BT2;

public class OddNumber extends Thread {

    private String threadName;

    OddNumber() {
        threadName = "Odd numbers generator";
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);

        for (int i = 1; i < 10; i += 2) {
            System.out.println(threadName + ", Number " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
