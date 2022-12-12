import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = dateFormat.parse(scanner.next());
            System.out.println("date = " + date);
            System.out.println("format = " + dateFormat.format(date));

            Date date2 = new Date();

            if (date.after(date2)) {
                System.out.println("User date is after actual date");
            } else if (date.before(date2)) {
                System.out.println("User date is before actual date");
            } else if (date.equals(date2)) {
                System.out.println("User date is equal actual date");
            }

            if (date.compareTo(date2) > 0) {
                System.out.println("User date is after actual date");
            } else if (date.compareTo(date2) < 0) {
                System.out.println("User date is before actual date");
            } else if (date.compareTo(date2) == 0) {
                System.out.println("User date is equal actual date");
            }
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("incorrect date format = " + e.getMessage());
            //System.exit(1);
            main(args);
        }
    }
}
