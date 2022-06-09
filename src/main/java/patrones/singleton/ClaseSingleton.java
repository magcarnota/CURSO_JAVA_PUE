package patrones.singleton;

/**
 * El patrón singleton garantiza que sólo habrá un único
 * objeto de una determinada clase durante la ejecución del programa.
 * @author magcarnota
 */
public class ClaseSingleton {
    private String msg;

    /*
    Almacenamos el objeto único de la clase una vez que lo creemos
    y será el que devolveremos todas las veces.
     */
    private static ClaseSingleton singleton = null;

    /**
     * El constructor ha de ser <b>private</b> para que no se pueda
     * instanciar la clase desde otras clases.
     * @param msg
     */
    private ClaseSingleton(String msg) {
        this.msg = msg;
    }

    /**
     * Método público que nos devolverá el objeto de la clase o, si no existiese,
     * creará uno, lo almacenará y lo devolverá.
     * @param msg
     * @return  el objeto único de la clase
     */
    public static ClaseSingleton obtenerInstancia(String msg) {
        if(null == singleton) singleton = new ClaseSingleton(msg);
        return singleton;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ClaseSingleton{ msg='" + msg + "\' }";
    }
}
