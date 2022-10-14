public class EjemploStringMetodos {
    public static void main(String[] args) {
        String name = "Fran";
        String trabalenguas = "trabalenguas";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Fran\") = " + name.equals("Fran"));
        System.out.println("name.equals(\"fran\") = " + name.equals("fran"));
        System.out.println("name.equalsIgnoreCase(\"fran\") = " + name.equalsIgnoreCase("fran"));
        System.out.println("name.compareTo(\"Fran\") = " + name.compareTo("Fran"));
        System.out.println("name.chartAt() = " + name.charAt(2));
        System.out.println("name.substring() = " + name.substring(1)); // el beginIndex se muestra porque es desde el beginIndex inclusive
        System.out.println("name.substring() = " + name.substring(1,3)); // pero el lastIndex no
        System.out.println("name.substring() = " + name.substring(name.length() - 1));
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf() = " + trabalenguas.indexOf('l'));
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf("s"));
        System.out.println("trabalenguas.contains() = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());












    }
}
