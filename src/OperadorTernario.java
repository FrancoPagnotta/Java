import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        String variable = 7 == 7 ? "is true" : "is false";
        System.out.println("variable = " + variable);

        String state = "";
        double average = 0.0;

        double maths = 0.0;
        double science = 0.0;
        double history = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica");
        maths = scanner.nextDouble();

        System.out.println("Ingrese la nota de ciencias");
        science = scanner.nextDouble();

        System.out.println("Ingrese la nota de historia");
        history = scanner.nextDouble();

        average = (maths + science + history) / 3;


        state = average >= 5.49 ? "approve" : "reproved";
        System.out.println("state = " + state);
    }
}
