public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        System.out.println("i initial value = " + i);
        int j = ++i; // j = i + 1; primero se incrementa i y desp se asigna a j, porque es pre incremento
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // Post incremento
        i = 2;
        System.out.println("i initial value = " + i);
        j = i++; // primero se asigna a j y desp se incrementa, por eso es post incremento
        System.out.println("j = " + j);
        System.out.println("i = " + i);
        
        // pre decremento
        i = 3;
        System.out.println("i initial value = " + i);
        j = --i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        // post decremento
        i = 3;
        System.out.println("i initial value = " + i);
        j = i--;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}
