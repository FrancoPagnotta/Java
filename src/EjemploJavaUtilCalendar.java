import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        //calendar.set(2022, Calendar.MARCH, 24);
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 24);

        Date date = calendar.getTime();
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd MMMM, yyyy");
        String dateFormated = dateFormater.format(date);

        System.out.println("calendar = " + calendar);
        System.out.println("dateFormater = " + dateFormated);
    }
}
