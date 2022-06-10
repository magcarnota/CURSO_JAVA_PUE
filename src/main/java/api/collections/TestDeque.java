package api.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Clase para testing de interfaz Deque<E>.
 * Tratamos la implementación ArrayDeque<E>:
 * Capacidad inicial: 16
 * Se puede usar para que funcione como una pila o
 * como una cola.
 * No se permiten valores <b>null</b>.
 * @author magcarnota
 */
public class TestDeque {
    public static void main(String[] args) {
        Deque<String> dequePorDefecto = new ArrayDeque<>(); // Capacidad incial de 16
        Deque<String> dequeIndicaCapacidad = new ArrayDeque<>(20); // Indicando capacidad de 20

        System.out.println("Creamos a partir de una lista:");
        List<String> lista = new ArrayList<>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("María");
        lista.add("Juan");

        Deque<String> dequeDesdeLista = new ArrayDeque<>(lista);

        mostrar("Deque creada desde lista:", dequeDesdeLista);

        dequeDesdeLista.offerFirst("Primero");  // Insertamos al principio
        dequeDesdeLista.offerLast("Último");    // Insertamos al final

        mostrar("Insertamos al principio con el método offerFirst('Primero') y al final con offerLast('Último'):", dequeDesdeLista);

        String primero = dequeDesdeLista.pollFirst();   // Obtenemos y eliminamos el primer elemento
        String ultimo = dequeDesdeLista.pollLast();     // Obtenemos y eliminamos el último elemento

        mostrar("Obtenemos y eliminamos al principio con el método pollFirst() y al final con pollLast():", dequeDesdeLista);

        String primeroSinEliminar = dequeDesdeLista.peekFirst();   // Obtenemos el primer elemento
        String ultimoSinEliminar = dequeDesdeLista.peekLast();     // Obtenemos el último elemento

        mostrar("Obtenemos al principio con el método peekFirst() y al final con peekLast():", dequeDesdeLista);
        System.out.println("Primero: " + primeroSinEliminar + " Último: " + ultimoSinEliminar);

    }

    private static void mostrar(String msg, Deque<String> deque) {
        System.out.println(msg);
        System.out.print("{ ");
        for(String elemento : deque) {
            System.out.print(elemento + " ");
        }
        System.out.println("}");
    }
}
