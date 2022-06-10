package api.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase para testing del interfaz Set<E>
 * La implementación HashSet<E> de este interfaz, se crea con una
 * capacida inicial de 16 y un factor de carga (porcentaje al que
 * se duplicará la capacidad) por defecto de 0.75 lo que indica que
 * cuando se ocupe el 75% de la capacidad, se duplicará ésta.
 * Esta implementación se puede incializar con un objeto de la
 * clase Collections.
 * Set<E> no permite duplicados.
 * @author magcarnota
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> conjuntoPorDefecto = new HashSet<>();   // Constructor por defecto con capacidad incial de 16
        Set<String> conjuntoCapacidadIndicada = new HashSet<>(20);  // Capacidad indicada incial de 20
        Set<String> conjuntoCapacidadFactorCarga = new HashSet<>(15, 0.85f);    // Indicando factor de carga

        // Inicializando desde una lista
        System.out.println("Creamos una lista con los valores {'Uno', 'Dos', 'Tres', 'Uno', 'Cuatro'}:");
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Uno");       // List<E> permite duplicados pero Set<E> no lo permite
        lista.add("Cuatro");
        Set<String> conjuntoDesdeLista = new HashSet<>(lista);

        mostar("Vemos que el conjunto se ha creado a partir de la lista pero sin duplicados:", conjuntoDesdeLista);

        conjuntoDesdeLista.add("Cinco");

        mostar("Añadimos 'Cinco':", conjuntoDesdeLista);

        conjuntoDesdeLista.remove("Dos");

        mostar("Eliminamos 'Dos':", conjuntoDesdeLista);

        System.out.println("Comprobamos si contiene 'Uno': " + conjuntoDesdeLista.contains("Uno"));

        System.out.println("\nCreamos un conjunto inmutable a partir del anterior con Set.copyOf(conjuntoDesdeLista):");
        Set<String> conjuntoInmutable = Set.copyOf(conjuntoDesdeLista); // Creamos un conjunto inmutable

        System.out.println("Tratamos de añadir un elemento:");
        try {
            conjuntoInmutable.add("Ocho");
        } catch (UnsupportedOperationException exception) {
            System.out.println("Lanza una excepción de tipo " + exception.getClass().getSimpleName());
        }
    }

    private static void mostar(String msg, Set<String> conjunto) {
        System.out.println(msg);
        System.out.print("{ ");
        for(String elemento : conjunto) {
            System.out.print(elemento + " ");
        }
        System.out.println("}");
        System.out.println();
    }
}
