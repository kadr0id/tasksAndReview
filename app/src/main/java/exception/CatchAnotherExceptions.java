package exception;


public class CatchAnotherExceptions {
    public void myExcept() throws AnotherExceprion {
        int result;

        try {
            result = getValue(5, 7);
        } catch (IllegalArgumentException arg){
            throw new AnotherExceprion(arg);
        }
        System.out.println(result);
    }
    public static int getValue(int one, int two) {
        if (one > two) throw new IllegalArgumentException(one + " is bigger then " + two);
        return one;
    }


}