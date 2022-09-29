import javax.lang.model.SourceVersion;
import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numberStr = JOptionPane.showInputDialog("Enter an integer number");
        int decimalNumber = 0;

        try {
            decimalNumber = Integer.parseInt(numberStr);
        } catch (NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Please, only numerics values");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryNumberResult = "binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println("binary number = " + binaryNumberResult);

        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber displayed as  decimal = " + binaryNumber);

        String octalNumberResult = "octal number of " + decimalNumber + " = " + Integer.toOctalString(binaryNumber);
        System.out.println("octal number = " + octalNumberResult);

        int octalNumber = 0764;
        System.out.println("octalNumber displayed as decimal = " + octalNumber);

        String hexadecimalNumberResult = "hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println("hexadecimal number = " + hexadecimalNumberResult);

        int hexNumber = 0x1f4;
        System.out.println("hexNumber displayed as decimal number = " + hexNumber);

        String message = binaryNumberResult;
        message += "\n" + octalNumberResult;
        message += "\n" + hexadecimalNumberResult;

        JOptionPane.showMessageDialog(null, message);
    }
}
