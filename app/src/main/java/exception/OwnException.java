package exception;


public class OwnException {
    public static int getOperation(int num) throws SpecialException {

        int result = 1;
        if (num < 1) throw new SpecialException("The number can not be less than 1", num);

        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }

    public void myException() {
        try {
            int result = OwnException.getOperation(6);
            System.out.println(result);
        } catch (SpecialException ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }

}
