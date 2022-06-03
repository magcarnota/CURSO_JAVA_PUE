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

        System.out.println("---------------------- EJEMPLO 2 ----------------------");
        MiClase2 objetoMiClase2 = new MiClase2();
        objetoMiClase2.metodoDefault();
        objetoMiClase2.metodoSinModificadorVisibilidad();
        objetoMiClase2.metodoPublic();

        InterfazTiposDeMetodos.metodoStatic();  // El método static pertenece al interfaz, no al objeto

        System.out.println("---------------------- EJEMPLO 3 ----------------------");
        MiClase3 objetoMiClase3 = new MiClase3();
        objetoMiClase3.metodo();

        System.out.println(InterfazConAtributos.ATRIBUTO); // Podemos acceder al atributo desde el interfaz

        System.out.println("---------------------- EJEMPLO 4 ----------------------");
        InterfazFuncional interfazFuncional = (nombre, msg) -> nombre + " dijo: " + msg;
        System.out.println(interfazFuncional.metodo("Don Pepito", "Hola don José"));

        interfazFuncional = (modelo, marca) -> "Modelo: " + modelo + " marca: " + marca;
        System.out.println(interfazFuncional.metodo("León", "Seat"));

        // Si hay varias intrucciones en el cuerpo del método, debemos encerrarlo entre llaves
        // e indicar los retornos manualmente con return

        interfazFuncional = (String usuario, String password) -> {
            if("MrRobot".equals(usuario) && "nopassword".equals(password)) {
                return "Acceso permitido";
            }
            return "Acceso denegado";
        };
        System.out.println("MrRobot tratando de acceder: " + interfazFuncional.metodo("MrRobot", "nopassword"));
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

class MiClase3 implements InterfazConAtributos {

    @Override
    public void metodo() {
        System.out.println("Método implementado");
    }
}
