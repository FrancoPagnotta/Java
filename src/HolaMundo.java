public class HolaMundo {
    public static void main(String[] args) {

        String greetings = "Hello World from Java";
        System.out.println(greetings);
        System.out.println("greetings.toUpperCase() = " + greetings.toUpperCase());

        int number = 11;
        int number2 = 5;

        boolean value = true;

        if (value) {
            System.out.println("number = " + number);
            number2 = 10;
        }

        System.out.println("number2 = " + number2);

        var number3 = "15";


        String name;
        name = "Franco";

        if (number > 10) {
            name = "Franco Adrian";
        }

        System.out.println("name = " + name);

    }
}
