package exception;

public class SpecialException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public SpecialException(String message, int num) {

        super(message);
        number = num;
    }

}
