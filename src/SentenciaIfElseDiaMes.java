public class SentenciaIfElseDiaMes {
    public static void main(String[] args) {

        int month = 2;
        int days = 0;
        int year = 1978;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days = 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else if (month == 2) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            }
            else {
                days = 28;
            }
        }

        System.out.println("days = " + days);
    }
}
