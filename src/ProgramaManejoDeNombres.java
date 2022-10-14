import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre");
        String firstName = scanner.nextLine();
        String firstName2 = firstName.substring(1, 2).toUpperCase().concat(".").concat(firstName.substring(firstName.length() - 2));
        System.out.println("firstName2 = " + firstName2);

        System.out.println("Ingrese el segundo nombre");
        String secondName = scanner.nextLine();
        String secondName2 = secondName.substring(1, 2).toUpperCase().concat(".").concat(secondName.substring(secondName.length() - 2));
        System.out.println("secondName2 = " + secondName2);

        System.out.println("Ingrese el tercer nombre");
        String thirdName = scanner.nextLine();
        String thirdName2 = thirdName.substring(1, 2).toUpperCase().concat(".").concat(thirdName.substring(thirdName.length() - 2));
        System.out.println("thirdName2 = " + thirdName2);
    }
}
