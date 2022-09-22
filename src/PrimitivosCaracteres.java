public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char character = 'F';
        char character2 = '0'; // 0 to 9
        char character3Unicode = '\u0040'; // @
        char character3Decimal = 64; // @
        char symbol ='@';

        System.out.println("character = " + character);
        System.out.println("character = " + character2);
        System.out.println("character3Unicode = " + character3Unicode);
        System.out.println("character3Decimal = " + character3Decimal);

        System.out.println("character3 = character3Decimal  " + (character3Unicode == character3Decimal)); // The parenthesis give priority to the comparison

        System.out.println("symbol = character3 " + (symbol == character3Unicode));

        System.out.println("char type in bytes correspond to " + Character.BYTES);
        System.out.println("char in bits is equal to " + Character.SIZE);
        System.out.println("Max value of char type is " + Character.MAX_VALUE);
        System.out.println("Min value of char type is " + Character.MIN_VALUE);

        char space = ' ';
        char spaceUnicode = '\u0020';
        System.out.println("hello" + space + "world");
        System.out.println("hello" + spaceUnicode + "world");

        char backspace = '\b';
        System.out.println("1234" + backspace);
        System.out.println("1234" + backspace + backspace);
        System.out.println("1234" + backspace + backspace + backspace);

        char tab = '\t'; //tab is bigger than space
        System.out.println("hello" + tab + "wolrd");

        char lineBreak = '\n';
        System.out.println("hello" + lineBreak + "world");

        System.out.println("hello" + System.lineSeparator() + "world");
    }
}
