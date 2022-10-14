public class EjemploStringMetodosArrays {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] array = trabalenguas.toCharArray();
        int lengthArray = array.length; // NO CONFUNDIR este length que es un atributo o propiedad de los arrays y no lleva parentesis, con el metodo length() de los strings

//        for (int i = 0; i < lengthArray; i++) {
//            System.out.println("array = " + array[i]);
//        }

        // tambien se puede hacer con un for each, version mejorada del ciclo for
        for (char character : array) {
            System.out.print(character); //print imprime de forma horizontal y printIn de forma vertical
        }

        System.out.println();

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] array2 = trabalenguas.split("a");
        int array2Length = array2.length;

//        for (int i = 0; i < array2Length; i++) {
//            System.out.println(array2[i]);
//        }
        for (String character : array2) {
            System.out.print(character);
        }

        String file = "alguna_imagen.jpg";
        String[] fileArray = file.split("\\.");
        /* tambien se puede poner asi [.], la diferencia esta en que con las \\
        hacemos referencia al punto como un caracter comun, en cambio con los []
        los usamos tanto para hacer referencia a caracteres clave reservados de las
        expresiones regulares, tambien para referenciar otros caracteres comunes y corrientes
         o bien para armar grupos de caracteres que vamos a usar como expresion regular
        * */
        for (String character : fileArray) {
            System.out.println(character);
        }
    }
}
