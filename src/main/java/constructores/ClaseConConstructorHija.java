package constructores;

/**
 * Clase que heredará de ClaseConConstructorPadre
 * @author magcarnota
 */
public class ClaseConConstructorHija extends ClaseConConstructorPadre {
    private String msgHija;

    ClaseConConstructorHija(String msgPadre, String msgHija) {
        super(msgPadre);    // La llamada al constructor de la clase padre debe de ser la primera instrucción del constructor
        System.out.println("Pasando por constructor ClaseConConstructorHija");
        this.msgHija = msgHija;
    }

    public void mostrarMsg() {
        super.mostrarMsg(); // Para mostrar el atributo de la clase padre
        System.out.println(this.getClass().getSimpleName());
        System.out.println("msgHija: " + msgHija);
    }
}
