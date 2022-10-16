public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 5;
        double l = 10;
        boolean m = false;

        boolean b1 = i == j && k > l; // si la primera condicion es true, evalua la seugnda pero si fuese false queda toda la expresion en false
        System.out.println("b1 = " + b1);
        
        boolean b2 = i == j && k < l && m == true; // si la primera y la segunda son true, evalua la tercera, si alguna fuese false, toda la expresion queda en false
        System.out.println("b2 = " + b2);
        
        boolean b3 = i == j || k > l; // como la primera es true, la seugnda no se evalua y el resultado es true porque al menos una debe ser true
        System.out.println("b3 = " + b3);
        
        boolean b4 = i == j && k > l || m == false; // evalua primero lo previo al or, si es true evalua lo posterior al or
        System.out.println("b4 = " + b4);

        boolean b5 = i == j && (k > l || m == false); // la expresion es true, porque i == j es true y lo del parentesis es true porque si bien k > f es false, m == false es true y estamos usando el or y al menos una de ambas debe ser true para que sea true.
        System.out.println("b5 = " + b5);



    }
}
