public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numberByte = 127;
        System.out.println("numberByte = " + numberByte);
        System.out.println("byte type in bytes correspond to " + Byte.BYTES);
        System.out.println("byte type in bits is equal to " + Byte.SIZE);
        System.out.println("Max value of byte type is " + Byte.MAX_VALUE);
        System.out.println("Min value of byte type is " + Byte.MIN_VALUE);

        short numberShort = 32767;
        System.out.println("numberShort = " + numberShort);
        System.out.println("short type in bytes correspond to " + Short.BYTES);
        System.out.println("short type in bits is equal to " + Short.SIZE);
        System.out.println("Max value of short type is " + Short.MAX_VALUE);
        System.out.println("Min value of short type is " + Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println("numberInt = " + numberInt);
        System.out.println("int type in bytes correspond to " + Integer.BYTES);
        System.out.println("int in bits is equal to " + Integer.SIZE);
        System.out.println("Max value of int type is " + Integer.MAX_VALUE);
        System.out.println("Min value of int type is " + Integer.MIN_VALUE);

        long numberLong = 9223372036854775807L;
        System.out.println("numberLong = " + numberLong);
        System.out.println("long type in bytes correspond to " + Long.BYTES);
        System.out.println("long in bits is equal to " + Long.SIZE);
        System.out.println("Max value of long type is " + Long.MAX_VALUE);
        System.out.println("Min value of long type is " + Long.MIN_VALUE);

        var dynamicValue = 9223372036854775808D;
    }
}
