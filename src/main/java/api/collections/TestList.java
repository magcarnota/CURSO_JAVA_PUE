package api.collections;

import java.util.*;

/**
 * Clase para testing del interfaz List<E>
 * @author magcarnota
 */
public class TestList {
    public static void main(String[] args) {
        List<String> listaPorDefecto = new ArrayList<>();
        List<String> listaIndicandoCapacidad = new ArrayList<>(5); // La capacidad inicial por defecto es 10

        Set<String> conjunto = new HashSet<>();
        List<String> listaCreadaDesdeUnConjunto = new ArrayList<>(conjunto);    // El constructor acepta cualquier otro tipo de colección

        List<Integer> listaAsList = Arrays.asList(1, 2, 3);  // Devuelve un List con los elementos indicados
        ArrayList<Integer> arrayListArrayElementos = new ArrayList<>(listaAsList);  // Hay que crear una implementación no abstracta a partir del List
        arrayListArrayElementos.add(89);                // Añade al final {1, 2, 3, 89}
        arrayListArrayElementos.add(0, 5);  // Añade en el índice indicado y desplaza los demás elmentos {5, 1, 2, 3, 89}
        arrayListArrayElementos.remove(3);        // Elimina la posicion 4 y desplaza las demás {5, 1, 2, 89}
        arrayListArrayElementos.set(0, 0);              // Actualiza el elemento de la posición dada con el valor dado {0, 1, 2, 89}

        mostrarListaInteger("Creada con Arrays.asList(1, 2, 3): ", arrayListArrayElementos);

        List<Double> listaSoloLectura = List.of(0.1, 3.5, 12.23, 4.2);  // Crea una lista de solo lectura
        //listaSoloLectura.add(2.345);  // UnsupportedOperationException ya que List.of() devuelve una lista inmutable

        mostrarListaDouble("Creada con List.of(0.1, 3.5, 12.23, 4.2):", listaSoloLectura);
    }



    static void mostrarListaStrings(String msg, List<String> lista) {
        System.out.println(msg);
        for(String elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    static void mostrarListaInteger(String msg, List<Integer> lista) {
        System.out.println(msg);
        for(Integer elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    static void mostrarListaDouble(String msg, List<Double> lista) {
        System.out.println(msg);
        for(Double elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
