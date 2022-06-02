package variables;

import java.util.logging.SocketHandler;

/**
 * Uso de la palabra reservada final con variables para
 * crear constantes
 * @author magcarnota
 */
public class VariablesFinal {
    // Las variables final si son estáticas hay que inicializarlas al declararlas
    private static final String CIUDAD = "Santiago de Compostela";
    // Si son variables de instancia, se pueden inicializar al declararse o hay que
    // inicializarlas en el constructor
    private final short CODIGO_POSTAL;

    public static void main(String[] args) {
        // Las variables final locales, hay que inicializarlas
        // antes de usarlas
        final String NOMBRE;

        NOMBRE = "Miguel Ángel";

        System.out.println(NOMBRE);
        System.out.println(CIUDAD);
        System.out.println(new VariablesFinal().CODIGO_POSTAL);

        System.out.println("Creamos otra instancia y variamos el código postal para esa instancia:");
        System.out.println(new VariablesFinal((short) 28080).CODIGO_POSTAL);

        // Si el valor de una variable final es una instancia, lo que
        // permanece inmutable es la referencia, pero si el objeto
        // puede cambiar, se puede cambiar
        final StringBuilder LENGUAJE = new StringBuilder("PHP");
        LENGUAJE.append(" y JAVA");
        System.out.println(LENGUAJE);

    }

    /**
     * Constructor para inicializar la variable final de instancia
     * declarada pero no inicializada con anterioridad
     */
    VariablesFinal() {
        CODIGO_POSTAL = 15704;
    }

    /**
     * Constructor alternativo que inicializa la variable final de instancia
     * al valor que le indiquemos (cada instancia podría tener un valor diferente)
     * @param cp codigo postal
     */
    VariablesFinal(short cp) {
        CODIGO_POSTAL = cp;
    }
}
