public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String course = "Programacion Java";
        String teacher = "Andres Guzman";

        String detail = course + " con el profesor " + teacher;
        System.out.println("detail = " + detail);

        int numberA = 10;
        int numberB = 5;

        System.out.println(detail + numberA + numberB);
        /*
        * output: Programacion Java con el profesor Andres Guzman105,
        * esto se debe a la precedencia de los operadores, el programa lee de
        * izq a der y lo primero que encuentra en este caso es un string, entonces asume
        * que  todo es un string y va a concatenar, a menos que usemos parentesis
        */
        System.out.println(detail + (numberA + numberB));
        /*
        * los parentesis cambian el orden en el que se ejecutan/evaluan estas operaciones,
        * por ende en este caso, primero resuelve lo que esta entre parentesis o sea suma y luego
        * concatena los strings, por lo tanto IMPORTANTE tener en cuenta esto al tener que concatenar operaciones aritmeticas con strings
        * */

        System.out.println(numberA + numberB + detail);
        /*
         * en este caso, resuelve la operacion aritmetica y luego concatena
         * */

        String detail2 = course.concat(teacher);
        System.out.println("detail2 = " + detail2);
        /*
        * los strings son inmutables, por lo tanto concat lo que hace es retornar
        * una nueva instancia o sea otro objeto string de la clase course y una nueva instancia
        * o sea un nuevo objeto string de la clase teacher y asignarselos a detail2.
        * */
        
        String detail3 = course.concat(" con ".concat(teacher)); // los concat se pueden anidar
        System.out.println("detail3 = " + detail3);
    }
}
