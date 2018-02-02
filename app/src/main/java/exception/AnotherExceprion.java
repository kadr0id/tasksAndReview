package exception;


public class AnotherExceprion extends Exception{
    public AnotherExceprion(Throwable e){
        initCause(e);
    }



}
