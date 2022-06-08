package arrays;

/**
 * Clase para testing de arrays
 * @author magcarnota
 */
public class TestArrays {
    public static void main(String[] args) {
        int[] array_de_int = new int[5];   // Podemos inicializar el array (de ser así hay que indicarle el tamaño)
        Integer array_de_Integer[] = new Integer[5];   // Los corchetes pueden estar al lado del tipo o del nombre
        String[] array_de_String = {"Uno", "Dos", "Tres"};  // Podemos inicializar el array indicando sus miembros
        char[] array_de_char = new char[]{'a', 'b', 'c'};   // Combinando new y {}
        //char[] array_de_char2 = new char[2]{'a', 'b'};    // ASI NO SE PUEDE

        double[] array_de_double;           // Declaramos el array de double
        array_de_double = new double[5];    // Inicializamos el array con tamaño 5

        array_de_double[0] = 23.5;     // Inicializando los valores indicando el índice
        array_de_double[4] = 2;

        // Recorrer array
        mostrarArray(array_de_String);

        System.out.println("Longitud: " + array_de_int.length);    // La propiedad length contiene la longitud del array

        // Valores de un array al que se le ha indicado la longitud pero no los valores
        mostrarArray(array_de_int);         // Los primitivos int se inicializan a 0
        mostrarArray(array_de_Integer);     // Los objetos se inicializan a null

        // Recorrer array controlando el índice
        for(int indice = 0; indice < array_de_char.length; indice++) {
            System.out.print( array_de_char[indice] + " " );
        }
        System.out.println();

        // Rellenar array
        for(int indice = 0; indice < array_de_int.length; indice++) {
            array_de_int[indice] = indice * 2;
        }
        mostrarArray(array_de_int);

        // Arrays multidimensionales
        char[][] tableroTresEnRaya = new char[3][]; // Creamos un array de arrays (es posible indicar sólo la primera dimensión)
        //tableroTresEnRaya[0] = {' ', ' ', ' '};     // NO se puede inicializar así
        tableroTresEnRaya[0] = new char[]{'X', 'O', ' '};
        tableroTresEnRaya[1] = new char[]{' ', 'X', 'O'};
        tableroTresEnRaya[2] = new char[]{'O', ' ', 'X'};

        for(int fila = 0; fila < tableroTresEnRaya.length; fila++) {
            for (int columna = 0; columna < tableroTresEnRaya[fila].length; columna++) {
                System.out.print(tableroTresEnRaya[fila][columna] + " ");
            }
            System.out.println();
        }

        // Podemos tener más dimensiones que dos
        int[][][] cubo = new int[5][5][5];  // Cubo de 5x5
    }

    static void mostrarArray(String[] array) {
        for(String texto : array) {
            System.out.print(texto + " ");
        }
        System.out.println();
    }

    static void mostrarArray(int[] array) {
        for(int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    static void mostrarArray(Integer[] array) {
        for(Integer numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
