public class EjemplosStringValidar {
    public static void main(String[] args) {

        String course = null;

        boolean isNull = course == null;

        if (isNull) {
            // course = "Programacion Java";
            course = " ";
            System.out.println("isNull = " + isNull);

        }


        /*
        * si isNull fuese true y no estuviesemos manejando el error
        * inicializando course como estamos haciendo en la linea 10,
        * el metodo concat() daria error NullPointerException, porque course es null, por eso siempre
        * hay que estar seguros de que vamos a usar el metodo concat con dos objetos strings instanciados
        * */
        
        boolean isEmpty = course.isEmpty();

        if (isEmpty) {
            System.out.println("isEmpty = " + isEmpty);
        }


        boolean isBlank = course.isBlank(); // esta es la forma mas segura de comprobar si un objeto string es null o si es un espacio blanco.
        
        if (isBlank) {
            System.out.println("isBlank = " + isBlank);
        }
    }
}
