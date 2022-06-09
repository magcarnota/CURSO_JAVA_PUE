package clases_anidadas.estaticas;

/**
 * Clase para testing de clases anidadas internas estáticas
 * @author magcarnota
 */
public class TestAnidadEstatica {
    public static void main(String[] args) {
        ClaseConClaseAnidadaInterna externa = new ClaseConClaseAnidadaInterna("En clase externa");

        System.out.println(externa.msg);

        ClaseConClaseAnidadaInterna.ClaseInterna interna = new ClaseConClaseAnidadaInterna.ClaseInterna("En clase interna");

        System.out.println(interna.msg_interna);


    }
}
