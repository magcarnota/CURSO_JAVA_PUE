package clases_anidadas.estaticas;

/**
 * Clase para testing de clases anidadas internas estáticas
 * @author magcarnota
 */
public class TestAnidadaEstatica {
    public static void main(String[] args) {
        ClaseConClaseAnidadaInternaEstatica externa = new ClaseConClaseAnidadaInternaEstatica("En clase externa");

        System.out.println(externa.msg);

        ClaseConClaseAnidadaInternaEstatica.ClaseInterna interna = new ClaseConClaseAnidadaInternaEstatica.ClaseInterna("En clase interna");

        System.out.println(interna.msg_interna);


    }
}
