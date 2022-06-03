package constructores;

/**
 * Clase con constructor definido
 * Desde el momento en el que declaramos algún tipo de constructor,
 * ya no se proporciona el constructor por defecto
 * @author magcarnota
 */
public class ClaseConConstructor {
    // Este atributo se inicializa de forma explícita
    private String msg = "Se usa el constructor explícito de la clase!";
    // Este atributo, al no ser inicializado, se inicializa con el valor por defecto
    private int numero;
    // Este atributo lo inicializamos en el constructor
    private String msg2;

    // Constructor sin parámetros
    ClaseConConstructor() {
        msg2 = "Inicializado en el constructor";
    }

    // Constructor con parámetros
    ClaseConConstructor(String msg2) {
        this.msg2 = msg2;
    }

    public void mostrarMsg() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("msg: " + msg);
        System.out.println("numero: " + numero);
        System.out.println("msg2: " + msg2);
    }
}
