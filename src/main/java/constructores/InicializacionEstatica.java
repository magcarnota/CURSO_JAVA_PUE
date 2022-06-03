package constructores;

/**
 * Prueba de constructor con incialiazación estática
 * @author magcarnota
 */
public class InicializacionEstatica {
    public static String variableEstatica;

    // Bloque de código estático que se ejecutará una sola vez
    // cuando la clase se cargue en memoria
    static {
        System.out.println("Ejecutando bloque estático!");
        variableEstatica = "Variable static inicializada en bloque estático!";
    }

    InicializacionEstatica(String msg) {
        System.out.println("Ejecutando constructor: " + msg);
    }
}
