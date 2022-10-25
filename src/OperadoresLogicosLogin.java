import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
//        long way to create arrays
//        String[] usersNames = new String[2];
//        String[] passwords = new String[2];
//        usersNames[0] = "Fran";
//        usersNames[1] = "Adrian";
//
//        passwords[0] = "abc1234";
//        passwords[1] = "efg567";

        // short way
        String[] usersNames = {"Fran", "Adrian"};
        String[] passwords = {"abc1234", "efg567"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario");
        String user = scanner.next();

        System.out.println("Ingrese la contraseña");
        String pass = scanner.next();

        boolean isAuth = false;

        for (int i = 0; i < usersNames.length; i++) {
            if (usersNames[i].equals(user) && passwords[i].equals(pass)) {
                isAuth = true;
                break;
            }
        }

        if (isAuth) {
            System.out.println("Welcome ".concat(user));
        } else {
            System.out.println("Invalid username or password");
        }
        /*
         we must use equals to compare, because userName is an object, and the equal operator is only for compare values
        */
    }
}
