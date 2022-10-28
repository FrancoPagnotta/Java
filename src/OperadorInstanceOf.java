public class OperadorInstanceOf {
    public static void main(String[] args) {

        String text = "create an object of the String class";
        Integer num = 5;
        // both are objects, not primitives values, because String and Integer are wrapper class, so behind the scenes is occurring the instances like new String() and new Integer()

        boolean b1 = text instanceof String;
        System.out.println("text es del tipo String = " + b1);

    }
}