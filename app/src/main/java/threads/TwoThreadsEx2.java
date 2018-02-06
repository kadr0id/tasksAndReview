package threads;



public class TwoThreadsEx2 extends Thread {
    private String number;

    public TwoThreadsEx2(String number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " thread");
    }



    public void startTwoThreads(){
        TwoThreadsEx2 first = new TwoThreadsEx2("first");
        TwoThreadsEx2 second = new TwoThreadsEx2("second");
        first.start();
        try {
            first.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        second.start();
    }
}
