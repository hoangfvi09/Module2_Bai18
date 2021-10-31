package BT2;

public class EvenNumber extends Thread {

    private String threadName;

    EvenNumber() {
        threadName = "Even numbers generator";
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(threadName + ", Number " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
