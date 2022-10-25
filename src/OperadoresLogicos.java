public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k > l; // si la primera condicion es true, evalua la seugnda pero si fuese false queda toda la expresion en false
        System.out.println("b1 = " + b1);
        
        boolean b2 = i == j && k < l && m == true; // si la primera y la segunda son true, evalua la tercera, si alguna fuese false, toda la expresion queda en false
        System.out.println("b2 = " + b2);
        
        boolean b3 = i == j || k > l; // como la primera es true, la seugnda no se evalua y el resultado es true porque al menos una debe ser true
        System.out.println("b3 = " + b3);
        
        boolean b4 = i == j && k > l || m == false; // evalua primero lo previo al or, si es true evalua lo posterior al or
        System.out.println("b4 = " + b4);

        boolean b5 = i == j && (k > l || m == false); // primero resuelve los parentesis, le cambiamos el orden de lectura a derecha a izquierda
        System.out.println("b5 = " + b5);
        
        boolean b6 = true || true && false; // true porque primero se resuelve el and && porque tiene mas prioridad que el or, entonces true y true es true
        System.out.println("b6 = " + b6);
    
        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);


    }
}
