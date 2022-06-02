package metodos;

/**
 * Métodos con argumentos final
 * @author magcarnota
 */
public class MetodosConArgumentosFinal {

    public static void main(String[] args) {
        System.out.println("Llamada a metodoParametrosModificables(\"Miguel\", 100):");
        metodoParametrosModificables("Miguel", 100);

        System.out.println("Llamada a metodoParametrosFinal(\"Miguel\", 100):");
        metodoParametrosFinal("Miguel", 100);
    }

    private static void metodoParametrosModificables(String nombre, int edad) {
        nombre = "<MODIFICADO DENTRO DEL MÉTODO>";
        edad = -1;
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
    }

    private static void metodoParametrosFinal(final String nombre, final int edad) {
//        nombre = "<MODIFICADO DENTRO DEL MÉTODO>";    // No permite modificación
//        edad = -1;                                    // No permite modificación
        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
    }
}
