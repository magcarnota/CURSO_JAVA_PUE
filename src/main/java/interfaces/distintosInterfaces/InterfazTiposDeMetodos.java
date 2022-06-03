package interfaces.distintosInterfaces;

/**
 * Interfaz para mostrar diferentes tipos de métodos
 * @author magcarnota
 */
public interface InterfazTiposDeMetodos {

    // Los métodos default ofrecen una implementación por defecto que puede ser o no
    // sobre-escrita por la clase que implementa el interfaz. Es public aunque no lo indiquemos.
    default void metodoDefault() {
        System.out.println("Método con modificador default");
    }

    // El método private pertenece al interfaz y no se puede sobre-escribir
    // en la clase que implemente al interfaz
    private void metodoPrivate() {
        System.out.println("Método con modificador private");
    }

    // El método static pertenece al interfaz y no se puede sobre-escribir
    // en la clase que implemente al interfaz
    static void metodoStatic() {
        System.out.println("Método estático del interfaz");
    }

    // Los métodos no pueden tener el modificador de acceso protected
    // La visibilidad de los métodos implementados en la clase que
    // implementa este interfaz no pueden ser más restrictivos
    void metodoSinModificadorVisibilidad();
    public void metodoPublic();
}
