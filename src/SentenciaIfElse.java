public class SentenciaIfElse {
    public static void main(String[] args) {
        float average = 5.8f;

        if (average > 4 && average <= 6) {
            System.out.println("Good average");
        }
        else if (average > 6 && average <= 8) {
            System.out.println("Excellent average");
        }
        else if (average > 8 && average <= 10) {
            System.out.println("Perfect average");
        }
        else {
            System.out.println("You can do it better");
        }
    }
}
