public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object text = "create an object of the String class";
        //Integer num = 5; // Simple way to create an instance of Integer, assign the literal value, on the background the system do Integer.valueOf(5)
        Integer num = Integer.valueOf(5); // Another way to create an instance of Integer. The same with the other concretes values.

        Boolean b1 = text instanceof String;
        System.out.println("text es de tipo String = " + b1);

        b1 = text instanceof Object;
        System.out.println("text es de tipo Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es de tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es de tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es de tipo Object = " + b1);

        b1 = text instanceof Long;
        System.out.println("num es de tipo Long = " + b1);

        b1 = text instanceof Double;
        System.out.println("num es de tipo Double = " + b1);

        Number decimal = 10.50f;
        b1 = decimal instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("decimal es de tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es de tipo Float = " + b1);
    }
}