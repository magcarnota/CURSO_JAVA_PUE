package bucles;

/**
 * Clase para testing bucle for mejorado
 * @author magcarnota
 */
public class TestBucleForMejorado {
    public static void main(String[] args) {
        System.out.println("Imprimir números de del array {2, 4, 6, 8}:");
        int[] array = {2, 4, 6, 8};

        ejemplo1(array);
    }

    static void ejemplo1(int[] arr) {
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}