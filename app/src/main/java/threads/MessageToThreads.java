package threads;


public class MessageToThreads extends Thread {
    private String massage;
    private static String comeBack;

    public MessageToThreads(String massage){
        this.massage = massage;
    }

    public void comeBack(){
        synchronized (this){
            comeBack = massage;
        }
    }

    @Override
    public void run(){
        while (true){
            comeBack();
        }
    }


    public void startThreadrs(){
        MessageToThreads firstThread = new MessageToThreads("first");
        MessageToThreads secondThread = new MessageToThreads("second");
        firstThread.start();
        secondThread.start();
        System.out.println(comeBack);
    }
}
