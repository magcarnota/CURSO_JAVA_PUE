package assertions;

/**
 * Clase para testing de assertions
 * NO están activadas por defecto.
 * Para activarlas:
 * java -ea <package>.<MainClass>
 * java -enableassertions <package>.<MainClass>
 *
 * assert <boolean expresion>;
 * assert <boolean expresion>: <error text expression>;
 * @author magcarnota
 */
public class TestAssertions {
    public static void main(String[] args) {
        System.out.println("Definimos una variable boolean a true:");
        boolean esVerdad = true;

        // Va a ser verdad porque la variable es true
        assert esVerdad;

        // Va a ser cierta la condición por lo que no se va a mostrar el mensaje
        assert (1 > 0): "Estamos comprobando que 1 > 0";

        // Esta va a fallar
        assert false: "Texto de assert que va a fallar";
    }
}
