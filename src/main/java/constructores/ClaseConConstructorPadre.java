package constructores;

/**
 * Clase con constructor de la que heredará
 * la clase ClaseConConstructorHija
 * @author magcarnota
 */
public class ClaseConConstructorPadre {
    private String msgPadre;

    ClaseConConstructorPadre(String msg) {
        System.out.println("Pasando por constructor ClaseConConstructorPadre");
        msgPadre = msg;
    }

    public void mostrarMsg() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("msgPadre: " + msgPadre);
    }
}
