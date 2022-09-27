public class SistemasNumericos {
    public static void main(String[] args) {

        int decimalNumber = 500;
        System.out.println("decimalNumber = " + decimalNumber);

        System.out.println("binary number of " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));
        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber displayed as  decimal = " + binaryNumber);

        System.out.println("octal number of " + decimalNumber + " = " + Integer.toOctalString(binaryNumber));
        int octalNumber = 0764;
        System.out.println("octalNumber displayed as decimal = " + octalNumber);

        System.out.println("hexadecimal number of " + decimalNumber + " = " + Integer.toHexString(decimalNumber));
        int hexNumber = 0x1f4;
        System.out.println("hexNumber displayed as decimal number = " + hexNumber);
    }
}
