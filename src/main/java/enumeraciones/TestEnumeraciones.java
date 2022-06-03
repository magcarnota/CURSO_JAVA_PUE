package enumeraciones;

/**
 * Clase para testear las enumeraciones
 * Una enumeración no puede heredar ni puede ser superclase
 * Una enumeración puede implementar interfaces y métodos estáticos
 * @author magcarnota
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        testSimple();
        testCompleja();
    }

    static public void testSimple() {
        System.out.println("--------------------- SIMPLE ---------------------");
        EnumeracionSimple posicion = EnumeracionSimple.SEGUNDO;
        switch (posicion) {
            case PRIMERO:
                System.out.println("Medalla de oro");
                break;
            case SEGUNDO:
                System.out.println("Medalla de plata");
                break;
            case TERCERO:
                System.out.println("Medalla de bronce");
                break;
            case OTRO:
                System.out.println("Gracias por participar");
        }
    }

    public static void testCompleja() {
        System.out.println("--------------------- COMPLEJA ---------------------");
        EnumeracionCompleja posicion = EnumeracionCompleja.SEGUNDO;
        System.out.println("Medalla: " + posicion.getMedalla());
        System.out.println("Premio: " + posicion.getPremio());

        EnumeracionCompleja.metodo();
        System.out.println(EnumeracionCompleja.msg);
    }
}