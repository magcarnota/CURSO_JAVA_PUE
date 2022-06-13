package clases_anidada;

/**
 * Clase con otra clase anidada estática en su interior
 * @author magcarnota
 */
public class ClaseConClaseAnidadaInterna {
    String msg;
    public ClaseInterna objetoClaseInterna;
    public class ClaseInterna {
        String msg_interna;
        ClaseInterna(String msg) {
            msg_interna = msg;
        }
    }

    public ClaseConClaseAnidadaInterna(String msg) {
        this.msg = msg;
        objetoClaseInterna = new ClaseInterna("Objeto clase interna!");
    }

}
