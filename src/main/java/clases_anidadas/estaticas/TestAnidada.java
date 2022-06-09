package clases_anidadas.estaticas;

/**
 * Clase para testing de clase interna
 * @author magcarnota
 */
public class TestAnidada {
    public static void main(String[] args) {
        ClaseConClaseAnidadaInterna externa = new ClaseConClaseAnidadaInterna("Objeto clase externa!");

        System.out.println(externa.msg);
        System.out.println(externa.objetoClaseInterna.msg_interna);
    }
}
