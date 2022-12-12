import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config2.properties");
            Properties properties = new Properties(System.getProperties());

            properties.load(file);
            properties.setProperty("my.custom.property","Mi saved value");

            System.setProperties(properties);

            System.out.println("my custom property in system is: " + System.getProperty("my.custom.property"));
        } catch (Exception e) {
            //hrow new RuntimeException(e);
            System.err.println("the file doesn't exist = " + e);
            System.exit(1);
        }
    }
}
