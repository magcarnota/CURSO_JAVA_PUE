package api.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase para testing de la interfaz Map<K,V>
 * Tratamos la implementación HashMap<K,V>.
 * Un mapa es una composición de un <b>conjunto</b> de
 * claves y una <b>lista</b> de valores.
 * Capacidad incial: 16
 * Factor de carga incial: 0.75
 * Map.entry es un wrapper para clave,valor.
 * @author magcarnota
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> mapaPoDefecto = new HashMap<>();   // Capacidad incial de 16
        Map<Integer, String> mapaCapacidadInicial = new HashMap<>(20);   // Capacidad incial de 20
        Map<Integer, String> mapaCapacidadFactorCarga = new HashMap<>(25, .80f);   // Capacidad incial de 20 y 0.8 de factor de carga

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(0, "Lunes");
        mapa.put(2, "Martes");
        mapa.put(3, "Miércoles");
        mapa.put(4, "Jueves");
        mapa.put(5, "Viernes");
        mapa.put(6, "Sábado");
        mapa.put(7, "Domingo");

        mostrar("Creamos un HashMap y añadimos elementos:", mapa);

        // Si tratamos de añadir un elemento cuya clave ya exista, se actualizará el valor de ésta
        mapa.put(6, "SÁBADO");
        String valorAnterior = mapa.put(7, "DOMINGO");
        mapa.put(8, "Día erróneo");

        mostrar("Actualizamos / Insertamos elementos:", mapa);

        mapa.remove(8); // Eliminamos la clave 8 junto con su correspondiente valor "Día erróneo"

        mostrar("Eliminamos elemento:", mapa);

        System.out.println("El HashMap contiene la clave 23? " + mapa.containsKey(23));
        System.out.println("El HashMap contiene el valor \"Jueves\"? " + mapa.containsValue("Jueves"));
    }

    private static void mostrar(String msg, Map<Integer, String> mapa) {
        System.out.println(msg);
        System.out.println("HashMap<Integer, String> {");
        for(Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println("\tClave: " + entry.getKey() + " Valor: \"" + entry.getValue() + "\"");
        }
        System.out.println("}");
    }
}
