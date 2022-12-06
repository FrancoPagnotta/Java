import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyyy");
        String dateStr = dateFormat.format(date);
        System.out.println("dateStr = " + dateStr);
        
        long j = 0;

        for(int i = 0; i < 10000000; i++) {
            j += i;
        }

        Date date2 = new Date();
        long finalTime = date2.getTime() - date.getTime();
        System.out.println("finalTime = " + finalTime);
    }
}
