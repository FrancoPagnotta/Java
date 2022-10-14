public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String file = "alguna.imagen.jpg";
        int dotIndex = file.lastIndexOf('.');
        System.out.println("file.length() = " + file.length());
        System.out.println("file.substring(file.length() - 3) = " + file.substring(dotIndex + 1));
    }
}
