package bucles;

/**
 * Clase para testing del bucle do-while
 * @author magcarnota
 */
public class TestBucleDoWhile {
    public static void main(String[] args) {
        System.out.println("Imprimir números del 5 al 1:");

        ejemplo1();

        ejemplo2();

        ejemplo3();
    }

    static void ejemplo1() {
        System.out.println("El contenido del bucle do-while siempre se ejecuta por lo menos una vez, ");
        System.out.println("ya que a diferencia del bucle while, la condición se comprueba al final.");
        int contador = 5;
        do {
            System.out.print(contador + " ");
            contador--;         // Hay que controlar la variable de control dentro del bucle
        } while(contador > 0);  // La condición siempre se comprueba al final
        System.out.println();
    }

    static void ejemplo2() {
        System.out.println("Bucle infinito con control de condición interna.");
        int contador = 5;
        do {
            System.out.print(contador + " ");
            contador--;                 // Hay que controlar la variable de control dentro del bucle
            if(contador <= 0) break;    // Controlamos la condición de salida dentro del bucle para que no sea infinito
        } while(true);                  // Condición que siempre se cumple
        System.out.println();
    }

    static void ejemplo3() {
        System.out.println("Actualizamos la variable de control en la condición.");
        int contador = 5;
        do {
            System.out.print(contador + " ");
        } while(--contador > 0);  // La condición siempre se comprueba al final
        System.out.println();
    }
}
