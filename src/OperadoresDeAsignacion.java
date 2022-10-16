public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        int i = 5;
        i += 2; // i = i + 2;
        i -= 4; // i = i - 4;
        i *= 2; // i = i * 2;
        i /= 2; // i = i / 2;

        String sqlString = "select * from clients as c";
        sqlString += " where c.name = 'Fran'";
        sqlString += " and c.active = 1";
        System.out.println("sqlString = " + sqlString);

    }
}
