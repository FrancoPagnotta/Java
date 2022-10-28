public class OperadorInstanceOf {
    public static void main(String[] args) {

        String text = "create an object of the String class";
        Integer num = 5;
        // both are objects, not primitives values, because String and Integer are wrapper class, so behind the scenes is occurring the instances like new String() and new Integer()

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

        Double decimal = 10.50;
        b1 = decimal instanceof Number;
        System.out.println("decimal es de tipo NUmber = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es de tipo Boolean = " + b1);
    }
}