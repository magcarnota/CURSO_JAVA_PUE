package api.collections;

import java.util.*;

/**
 * Clase para testing de interfaz Iterator<E>
 * Interfaz implementado por los miembros de Collections.
 * Usado para iterar por los elementos de las colecciones.
 * A diferencia del bucle for-each, con el iterador podremos borrar
 * los elementos.
 * @author magcarnota
 */
public class TestIterator {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Primavera");
        lista.add("Verano");
        lista.add("Otoño");
        lista.add("Invierno");

        mostrar("Lista:", lista);

        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(3);
        conjunto.add(5);
        conjunto.add(7);
        conjunto.add(9);

        mostrar("Conjunto:", conjunto);

        System.out.println("Vamos a iterar con el iterador sobre la lista y borrar \"Invierno\":");

        Iterator<String> iteradorDeLista = lista.iterator();
        while(iteradorDeLista.hasNext()) {
            String elemento = iteradorDeLista.next();
            if(elemento.equals("Invierno")) iteradorDeLista.remove();
        }

        mostrar("Lista después de borrar con el iterador:", lista);

    }
    private static void mostrar(String msg, Collection coleccion) {
        System.out.println(msg);
        System.out.print("{ ");
        Iterator iterator = coleccion.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("}");
    }
}
