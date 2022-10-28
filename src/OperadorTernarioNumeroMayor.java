import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int number1 = scanner.nextInt();

        System.out.println("Ingrese un segundo numero");
        int number2 = scanner.nextInt();

        System.out.println("Ingrese un tercer numero");
        int number3 = scanner.nextInt();

        max = (number1 > number2 ) ? number1 : (number2);
        max = (max > number3) ? max : number3;
        System.out.println("max = " + max);
                
                
    }
}
