package metodos;

import metodos.otropaquete.ClaseHijaOtroPaquete;
import metodos.otropaquete.ClaseOtroPaquete;

/**
 * Pruebas de visibilidad de métodos con modificadores
 * public, protected, *por defecto* y private
 * @author magcarnota
 */
public class VisibilidadMetodos {
    public static void main(String[] args) {
        VisibilidadMetodos objeto = new VisibilidadMetodos();

        System.out.println("Llamada a métodos desde objeto de la misma clase:");
        objeto.metodoPublico();
        objeto.metodoProtegido();
        objeto.metodoPorDefecto();
        objeto.metodoPrivado();
        System.out.println("---------------------------------------------------");

        ClaseHija objetoClaseHija = new ClaseHija();

        System.out.println("Llamada a métodos desde objeto de clase hija:");
        objetoClaseHija.metodoPublico();
        objetoClaseHija.metodoProtegido();
        objetoClaseHija.metodoPorDefecto();
        //objetoClaseHija.metodoPrivado();  // NO ES ACCESIBLE

        ClaseHijaOtroPaquete objetoHijoOtroPaquete = new ClaseHijaOtroPaquete();

        System.out.println("Llamada a métodos desde objeto de clase hija de otro paquete:");
        objetoHijoOtroPaquete.metodoPublico();
        objetoHijoOtroPaquete.metodoProtegido();
        // objetoHijoOtroPaquete.metodoPorDefecto(); // NO ES ACCESIBLE
        //objetoHijoOtroPaquete.metodoPrivado();  // NO ES ACCESIBLE

        ClaseOtroPaquete objetoOtroPaquete = new ClaseOtroPaquete();

        System.out.println("Llamada a métodos desde objeto de clase hija de otro paquete:");
        objetoOtroPaquete.metodoObjetoOtroPaquete();

    }

    public void metodoPublico() {
        System.out.println("Método público!");
    }
    protected void metodoProtegido() {
        System.out.println("Método protegido!");
    }
    void metodoPorDefecto() {
        System.out.println("Método por defecto!");
    }
    private void metodoPrivado() {
        System.out.println("Método privado!");
    }
}

class ClaseHija extends VisibilidadMetodos {}
