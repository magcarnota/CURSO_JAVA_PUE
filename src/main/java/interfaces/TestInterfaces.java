package interfaces;

import interfaces.distintosInterfaces.*;

/**
 * Clase para pruebas con interfaces
 * @author magcarnota
 */
public class TestInterfaces {

    public static void main(String[] args) {
        System.out.println("---------------------- EJEMPLO 1 ----------------------");
        MiClase1 objetoMiClase = new MiClase1();
        objetoMiClase.saludaA("Pedro");
        objetoMiClase.despideteDe("Juan");

        System.out.println("---------------------- EJEMPLO 1 ----------------------");
        MiClase2 objetoMiClase2 = new MiClase2();
        objetoMiClase2.metodoDefault();
        objetoMiClase2.metodoSinModificadorVisibilidad();
        objetoMiClase2.metodoPublic();

        InterfazTiposDeMetodos.metodoStatic();  // El método static pertenece al interfaz, no al objeto

    }
}

class MiClase1 implements InterfazVariosMetodos {

    @Override
    public void saludaA(String saludado) {
        System.out.println("Hola " + saludado);
    }

    @Override
    public void despideteDe(String despedido) {
        System.out.println("Adiós " + despedido);
    }
}

class MiClase2 implements InterfazTiposDeMetodos {

    @Override
    public void metodoSinModificadorVisibilidad() {
        System.out.println("Método sin modificadores de acceso");
    }

    @Override
    public void metodoPublic() {
        System.out.println("Método con modificador public");
    }
}