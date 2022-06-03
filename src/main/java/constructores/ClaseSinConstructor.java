package constructores;

/**
 * Clase sin constructor definido
 * Usará el constructor por defecto de la clase Object
 * de la que heredan todas las clases implicitamente
 * @author magcarnota
 */
public class ClaseSinConstructor {
    // Este atributo se inicializa de forma explícita
    private String msg = "Se usa el constructor implícito de la clase Object!";
    // Este atributo, al no ser inicializado, se inicializa con el valor por defecto
    private int numero;

    public void mostrarMsg() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("msg: " + msg);
        System.out.println("numero: " + numero);
    }
}
