package referencias_metodos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para testing de referencias a métodos
 * @author magcarnota
 */
public class TestReferenciasMetodos {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("María");
        lista.add("Ana");

        System.out.println("Imprimimos referenciando el método de la clase para cada elemento del array:");
        lista.forEach( MiClase::printClassMethod );     // en lugar de lista.forEach( elemento -> MiClase.printClassMethod(elemento) );

        System.out.println("Imprimimos referenciando el método de la instancia para cada elemento del array:");
        MiClase instancia = new MiClase();
        lista.forEach( instancia::printInstanceMethod );    // en lugar de lista.forEach( elemento -> instancia.printInstanceMethod(elemento) );

        System.out.println("Ordenamos e imprimimos la lista:");
        lista.sort( instancia::ordena );    // en lugar de lista.sort( (e1, e2) -> instancia.ordena(e1, e2) )
        lista.forEach( MiClase::printClassMethod );
    }
}

class MiClase {
    public static void printClassMethod(String text) {
        System.out.println(text);
    }

    public void printInstanceMethod(String text) {
        System.out.println(text);
    }

    public int ordena(String texto1, String texto2) {
        return texto1.compareTo(texto2);
    }
}


