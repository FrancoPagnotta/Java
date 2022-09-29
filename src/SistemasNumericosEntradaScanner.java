import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        //String numberStr = scanner.nextLine();

        int decimalNumber = 0;

        try {
            //decimalNumber = Integer.parseInt(numberStr);
            decimalNumber = scanner.nextInt();
        } catch (Exception error) {
            System.out.println("Please, only numerics values");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);
        String binaryNumberResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        String octalNumberResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        String hexadecimalNumberResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        String message = binaryNumberResult;
        message += "\n" + octalNumberResult;
        message += "\n" + hexadecimalNumberResult;

        System.out.println(message);
    }
}
