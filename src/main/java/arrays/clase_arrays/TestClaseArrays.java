package arrays.clase_arrays;

import java.util.Arrays;

/**
 * Clase para testing de clase java.util.Arrays
 * @author magcarnota
 */
public class TestClaseArrays {
    public static void main(String[] args) {
        System.out.println("Creamos un array de char con las vocales {'a', 'e', 'i', 'o', 'u'}:");
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        mostrarArray("vocales: ", vocales);

        System.out.println("Obtenemos una copia del array del mismo tamaño + 1:");
        char[] copiaVocales = Arrays.copyOf(vocales, vocales.length + 1);

        mostrarArray("copiaVocales: ", copiaVocales);

        System.out.println("Podemos asignar directamente un array a otro pero lo que pasamos ");
        System.out.println("será la referencia, por lo que los cambios en uno afectarán al otro.");

        char[] otraCopiaVocales = copiaVocales;
        otraCopiaVocales[0] = 'z';
        copiaVocales[4] = 'w';

        mostrarArray("otraCopiaVocales: ", otraCopiaVocales);
        mostrarArray("copiaVocales: ", copiaVocales);
        mostrarArray("vocales: ", vocales);

        char[] rellenadoAutomatico = new char[5];
        Arrays.fill(rellenadoAutomatico, 'x');

        mostrarArray("rellenadoAutomatico: ", rellenadoAutomatico);

        Arrays.sort(copiaVocales);

        mostrarArray("copiaVocales ordenado: ", copiaVocales);

        int indiceQueContieneUnaW = Arrays.binarySearch(copiaVocales, 'w');
        System.out.println("copiaVocales contiene una w en la posición: " + indiceQueContieneUnaW);
    }

    static void mostrarArray(String msg, char[] array) {
        System.out.print(msg);
        for(char letra : array) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }
}
