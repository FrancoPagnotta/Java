public class EjemploStringInmutabilidad {
    public static void main(String[] args) {

        String course = "Programacion Java";
        String teacher = "Andres Guzman";
        course.concat(teacher);
        System.out.println("course = " + course);
        /*
         * como vemos, curso no cambió, esto es porque concat
         * retorna una nueva instancia de un objeto string, que no se la asigna a course, porque recordemos
         * que los strings son inmutables, por lo tanto la instancia que retorna concat, debo asignarsela a una nueva variable
         */

        String result = course.concat(" con ".concat(teacher));
        System.out.println("result = " + result);

        String result2 = course.transform((value -> {
            return value + " con " + teacher;
        }));
        
        System.out.println("result2 = " + result2);
        /*
        * transform recibe como parametro una funcion que recibe
        * como parametro el string a transformar y retorna una nueva instancia
        * de un objeto string con el valor de la transformacion
        * */

        String name = "Fran";
        String replacedName = name.replace("Fran", "Adrian");
        System.out.println("replacedName = " + replacedName);

        /*
        * cualquier metodo que modifique un string, lo que hace es retornar una nueva instancia que se debe almacenar en una nueva variable,
        * la instancia original nunca se modifica
        */
    }
}
