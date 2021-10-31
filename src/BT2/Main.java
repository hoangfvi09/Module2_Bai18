package BT2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenNumber evenNumber = new EvenNumber();
        OddNumber oddNumber = new OddNumber();
        evenNumber.start();
        evenNumber.join();
        oddNumber.start();

    }
}
