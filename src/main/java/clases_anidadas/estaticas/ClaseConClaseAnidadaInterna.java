package clases_anidadas.estaticas;

/**
 * Clase con otra clase anidada estática en su interior
 * @author magcarnota
 */
public class ClaseConClaseAnidadaInterna {
    String msg;
    ClaseInterna objetoClaseInterna;
    public class ClaseInterna {
        String msg_interna;
        ClaseInterna(String msg) {
            msg_interna = msg;
        }
    }

    ClaseConClaseAnidadaInterna(String msg) {
        this.msg = msg;
        objetoClaseInterna = new ClaseInterna("Objeto clase interna!");
    }

}
