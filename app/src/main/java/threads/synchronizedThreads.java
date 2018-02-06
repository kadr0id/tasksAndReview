package threads;


public class synchronizedThreads {
    String first = "first";
    String second = "second";

    public void change(){

        synchronized (this) {
            String s = first;
            first = second;
            second = s;
        }
    }

    public synchronized void change2(){
        String s = first;
        first = second;
        second = s;
    }

}
