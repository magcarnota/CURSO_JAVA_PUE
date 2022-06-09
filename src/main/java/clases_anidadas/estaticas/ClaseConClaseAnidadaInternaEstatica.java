package clases_anidadas.estaticas;

/**
 * Clase con otra clase anidada estática en su interior
 * @author magcarnota
 */
public class ClaseConClaseAnidadaInternaEstatica {
    String msg;
    static public class ClaseInterna {
        String msg_interna;
        ClaseInterna(String msg) {
            msg_interna = msg;
        }
    }

    ClaseConClaseAnidadaInternaEstatica(String msg) {
        this.msg = msg;
    }

}
