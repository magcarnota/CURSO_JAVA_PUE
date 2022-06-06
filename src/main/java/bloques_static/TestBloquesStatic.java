package bloques_static;

/**
 * Clase para testing de bloques static
 * Los bloques static se ejecutan una sola vez cuando se carga
 * la clase en memoria (la primera vez que se hace referencia
 * a la clase)
 * @author magcarnota
 */
public class TestBloquesStatic {
    public static void main(String[] args) {
        System.out.println("Instanciamos ClaseHija:");
        ClaseHija claseHija = new ClaseHija();
        System.out.println("--------------------------------");
        System.out.println("Instanciamos de nuevo ClaseHija:");
        claseHija = new ClaseHija();
        System.out.println("--------------------------------");
        System.out.println("Hacemos referencia a clase por primera vez sin instanciarla:");
        System.out.println("n: " + ClasePrimeraReferencia.n++);
        System.out.println("Hacemos referencia a clase por segunda vez sin instanciarla:");
        System.out.println("n: " + ClasePrimeraReferencia.n++);
    }
}

class ClasePadre {
    static {
        System.out.println("Bloque static ClasePadre!");
    }
    ClasePadre() {
        System.out.println("Constructor ClasePadre!");
    }
}

class ClaseHija extends ClasePadre {
    ClaseHija() {
        System.out.println("Constructor ClaseHija!");
    }
    static {
        System.out.println("Bloque static ClaseHija!");
    }
}

class ClasePrimeraReferencia {
    static int n = 0;
    static {
        System.out.println("Bloque static en ClasePrimeraReferencia!");
    }
}
