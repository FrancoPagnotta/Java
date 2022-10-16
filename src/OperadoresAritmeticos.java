import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;

        int addition = i + j;
        System.out.println("addition = " + addition);
        System.out.println("addition = " + (i + j));

        int subtraction = i - j;
        System.out.println("substraction = " + subtraction);
        System.out.println("substraction = " + (i - j));

        int multiplication = i * j;
        System.out.println("multiplication = " + multiplication);
        System.out.println("multiplication = " + (i * j));

        int division = i / j;
        System.out.println("division = " + division);
        System.out.println("division = " + (i / j)); // 5 / 4 es 1.25 pero como i y j son integers, redondea el resultado al valor mas proximo

        float division2 = i / j;
        System.out.println("division2 = " + division2);
        System.out.println("division2 = " + (i / j));

        float division3 = (float)i / (float)j;
        System.out.println("division3 = " + division3);
        System.out.println("division3 = " + (i / j));

        int rest = i % j;
        System.out.println("rest = " + rest);
        System.out.println("rest = " + (i % j));

        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (number % 2 == 0) {
            System.out.println("numero par " + number);
        } else {
            System.out.println("numero impar " + number);
        }

    }
}
