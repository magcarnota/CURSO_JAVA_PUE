package api.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Clase para testing de Collections
 * @author magcarnota
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Ana");
        lista.add("Manuel");

        System.out.println("Lista:");
        lista.forEach( e -> System.out.println(e + " "));   // Mostramos la lista

        Collections.sort(lista);    // Ordenamos la lista

        System.out.println("Lista ordenada:");
        lista.forEach( e -> System.out.println(e + " "));   // Mostramos la lista

        Collections.reverse(lista);    // Damos la vuelta a la lista

        System.out.println("Lista del revés:");
        lista.forEach( e -> System.out.println(e + " "));   // Mostramos la lista

        Collections.shuffle(lista);    // Desordenamos la lista

        System.out.println("Lista desordenada:");
        lista.forEach( e -> System.out.println(e + " "));   // Mostramos la lista

        // Para trabajar con acceso concurrente y prevenir la corrupción de memoria
        // se pueden usar colecciones de sólo lectura, sincronizadas o copy-on-write
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> mapaSincronizado = Collections.synchronizedMap(map);

        Set<String> conjunto = new HashSet<>();
        Set<String> conjuntoSoloLectura = Collections.unmodifiableSet(conjunto);

        List<Double> listaDeDouble = new ArrayList<>();
        List<Double> listaCopyOnWrite = new CopyOnWriteArrayList<>(listaDeDouble);
    }
}
