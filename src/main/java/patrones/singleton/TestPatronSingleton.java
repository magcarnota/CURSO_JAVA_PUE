package patrones.singleton;

/**
 * Clase para testing del patrón <b>singleton</b>
 * @author magcarnota
 */
public class TestPatronSingleton {
    public static void main(String[] args) {
        System.out.println("Creamos una instancia de ClaseSingleton a través de su método obtenerInstancia:");
        ClaseSingleton singleton = ClaseSingleton.obtenerInstancia("Instancia única!");

        System.out.println(singleton);

        System.out.println("Tratamos de obtener otra instancia de ClaseSingleton:");
        ClaseSingleton otraInstancia = ClaseSingleton.obtenerInstancia("Soy otra instancia!");

        System.out.println(otraInstancia);

        System.out.println("Vemos si singleton == otraInstancia: " + (singleton == otraInstancia));
    }
}
