import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);
        
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);
        
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
    }
}
