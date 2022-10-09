public class EjemploString {
    public static void main(String[] args) {

        // formas de crear un string

        //forma simple
        String course = "Programacion Java"; // la instancia de la clase se hace de forma implicita por el JDK, o sea new String("programacion java");

        //forma mas larga
        String course2 = new String("Programacion Java"); // hacemos nosotros mismos la instancia de la clase String
        
        boolean isEqual = course == course2;
        System.out.println("isEqual = " + isEqual);
        // output: isEqual = false, ya que son dos instancias distintas, completamente diferentes a pesar de que tengan el mismo valor

        isEqual = course.equals(course2);
        System.out.println("isEqual = " + isEqual);
        // output: true, ya que en este caso, con el metodo equals() estamos comparando por valor

        String course3 = "Programacion Java";
        isEqual = course == course3;
        System.out.println("isEqual = " + isEqual);
        /*
        output: true, porque primero instanciamos de forma implicita a course o sea creamos un objeto tipo string y luego,
        al hacer lo mismo con course3, el JSK ve que ya existia un objeto tipo stirng creado de forma implicita y con el mismo valor,
        entonces lo que hace es no crear una nueva instancia o sea un nuevo objeto si no mas bien asignar la referencia del objeto
        course que ya existe, para optimizar, para no tener que andar creando tantos objetos de igual instancia y valor en memoria,
        por lo tanto lo que hace es solo asignar la referencia.
        */

        String str1 = "Hola Mundo";
        String str2 = "hola mundo";

        boolean areEquals = str1.equalsIgnoreCase(str2); // tener en cuenta equalsIgnoreCase() al necesitar comparar strings que tengan mayusculas
        System.out.println("areEquals = " + areEquals);
        // output: true


        /*
        Siempre que se necesiten comparar strings, comparar siempre por el valor con el equals()
        o con el equalsIgnoreCase(), nunca comparar por instancias con el ==.
         */

    }
}
