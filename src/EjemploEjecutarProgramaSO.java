import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        Runtime runTime = Runtime.getRuntime();
        Process process;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                process = runTime.exec("notepad");
            } else {
                process = runTime.exec("gedit"); //gedit is for linux
            }
            process.waitFor();
        } catch (Exception e) {
            System.err.println("The command is undefined " + e);
        }
        System.out.println("The editor is closed");
        System.exit(0);
    }
}
