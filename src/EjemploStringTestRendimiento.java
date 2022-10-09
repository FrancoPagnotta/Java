public class EjemploStringTestRendimiento {
    public static void main(String[] args) {

       String a = "a";
       String b = "b";
       String c = a;

       StringBuilder sb = new StringBuilder(a);
       long start = System.currentTimeMillis();

       for (int i = 0; i < 10000; i++) {
           // c = c.concat(a).concat(b).concat("\n"); //243ms
           // c = a + b + "\n"; //33ms
           sb.append(a).append(b).append("\n"); // 5ms
           /*
           * como el metodo append() retorna una nueva instancia de StringBuilder, podemos  concatenar estos metodos
           * de forma seguida y abreviada en vez de hacer
           sb.append(a);
           sb.append(b);
           sb.append("\n");
           **/

           /*
           * de los tres metodos, el mas rapido es el StringBuilder() sin importar la cantidad de concatenaciones,
           * sin embargo, concatenar con el operador +, en caso de muchas concatenaciones, es mucho mas rapido que usar
           * el metodo concat()
           */
       }

       long end = System.currentTimeMillis();

        System.out.println(end - start);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
    }
}
