package threads;


public class TwoThreads implements Runnable {
    private String number;

    public TwoThreads(String number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " thread");
    }

    public void startTwoThreads(){
        TwoThreads first = new TwoThreads("first");
        Thread firstThread = new Thread(first);
        firstThread.start();

        TwoThreads second = new TwoThreads("second");
        Thread secondThread = new Thread(second);
        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secondThread.start();
    }

}
