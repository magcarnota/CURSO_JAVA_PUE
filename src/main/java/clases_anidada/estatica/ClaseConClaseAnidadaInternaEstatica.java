package clases_anidada.estatica;

/**
 * Clase con otra clase anidada estática en su interior
 * @author magcarnota
 */
public class ClaseConClaseAnidadaInternaEstatica {
    public String msg;
    static public class ClaseInterna {
        public String msg_interna;
        public ClaseInterna(String msg) {
            msg_interna = msg;
        }
    }

    public ClaseConClaseAnidadaInternaEstatica(String msg) {
        this.msg = msg;
    }

}
