public class ConversionDeTipos {
    public static void main(String[] args) {
        //String to primitives types

        // string to integer
        String numberStr = "50";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println("numberInt = " + numberInt);

        // string to double (same case for float, etc)
        String realStr = "1934.3e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        // string to boolean
        String logicalStr = "true";
        boolean logicalBoolean = Boolean.parseBoolean(logicalStr);
        System.out.println("logicalBoolean = " + logicalBoolean);

        // same use with var
        var dynamicStr = "123.4e-3";
        var dynamicValue = Double.parseDouble(dynamicStr);
        System.out.println("dynamicValue = " + dynamicValue);

        //Primitives types to String

        //integer to String
        int otherNumberInt = 100;
        System.out.println("otherNumberInt = " + otherNumberInt);
        String otherNumberStr = Integer.toString(otherNumberInt);
        System.out.println("otherNumberStr = " + otherNumberStr);
        otherNumberStr = String.valueOf(otherNumberInt); // the return is the same in Integer.toString
        System.out.println("otherNumberStr = " + otherNumberStr);

        double otherRealDouble = 1.23456e2;
        String otherRealStr = Double.toString(otherRealDouble);
        System.out.println("otherRealStr = " + otherRealStr);
        otherRealStr = String.valueOf(otherRealDouble); // the return is the same as Double.toString
        System.out.println("otherRealStr = " + otherRealStr);

        // Primitives to primitives

        //int (32 bits) to short (16 bits)
        int i = 10000;
        short s = (short)i; // casting, force the conversion. We can cast int values up to 32767 safely, without data loss
        System.out.println("s = " + s);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        //int to long
        long l = i;
        System.out.println("l = " + l);

        // int to boolean
        // boolean b = (boolean)i; // inconvertible types, we can't cast an integer to boolean.

        //int to char
        char c = (char)i;
        System.out.println("c = " + c); //unicode, because each Unicode character is associated with an integer number
        
        float f = (float)i;
        System.out.println("f = " + f);

        // In primitives types, we only can do casting to a numeric values (short, long, float. double) and char (because a character value can be represented as integer, because it is assigned to a numeric value in the unicode table)
    }
}
