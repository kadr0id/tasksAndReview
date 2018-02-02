package exception;


import java.util.Scanner;

public class TwoExceptions {

    public void ArithmeticAndOutOfBond() {
        int[] numbers = {-1, 0, 1};
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            numbers[a] = 4 / a;
            System.out.println(numbers[a]);
        } catch (ArithmeticException ar) {
            ar.printStackTrace();
            System.out.println("Exception: " + ar);
        } catch (ArrayIndexOutOfBoundsException oob) {
            oob.printStackTrace();
            System.out.println("Exception: " + oob);
        } finally {
            for (int i=0; i<numbers.length; i++){
                System.out.println(numbers[i]);
            }
        }
    }
}

