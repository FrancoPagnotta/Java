public class PrimitivosBoolean {
    public static void main(String[] args) {
        
        boolean logic = true;
        boolean logic2 = Boolean.TRUE;
        boolean logic3;

        System.out.println("logic = " + logic);
        System.out.println("logic2 = " + logic2);

        double d = 9765.4e-3;
        float f = 1.2345e2f;

        logic3 = d > f;
        System.out.println("logic3 = " + logic3);
    }
}
