package clases_anidada;

/**
 * Clase para testing de clase interna
 * @author magcarnota
 */
public class TestAnidada {
    public static void main(String[] args) {
        clases_anidada.ClaseConClaseAnidadaInterna externa = new clases_anidada.ClaseConClaseAnidadaInterna("Objeto clase externa!");

        System.out.println(externa.msg);
        System.out.println(externa.objetoClaseInterna.msg_interna);
    }
}
