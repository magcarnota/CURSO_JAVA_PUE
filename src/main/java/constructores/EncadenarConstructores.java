package constructores;

/**
 * Encadenamiento de constructores
 * @author magcarnota
 */
public class EncadenarConstructores {

    private String msg1 = "POR DEFECTO", msg2 = "POR DEFECTO";

    EncadenarConstructores() {
        System.out.println("Pasando por constructor sin argumentos... msg1: " + msg1 + " msg2: " + msg2);
    }

    EncadenarConstructores(String msg) {
        this();     // Si existe, ha de ser la primera instrucción del constructor
        msg1 = msg;
        System.out.println("Pasando por constructor con un argumento... msg1: " + msg1 + " msg2: " + msg2);
    }

    EncadenarConstructores(String msg1, String msg2) {
        this(msg1);
        this.msg2 = msg2;
        System.out.println("Pasando por constructor con dos argumentos... msg1: " + msg1 + " msg2: " + msg2);
    }

}
