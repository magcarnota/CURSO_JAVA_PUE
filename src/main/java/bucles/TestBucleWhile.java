package bucles;

/**
 * Clase para testing de bucle while
 * @author magcarnota
 */
public class TestBucleWhile {
    public static void main(String[] args) {
        System.out.println("Contar de 0 a 9:");

        ejemplo1();

        ejemplo2();

        ejemplo3();
    }

    static void ejemplo1() {
        System.out.println("Ejemplo1: Bucle while(condicion) {... actualizar variableDeControl ...}");
        int contador = 0;
        while(contador <= 9) {      // Condición de salida
            System.out.print(contador + " ");
            contador++;             // Tenemos que manejar la variable de control manualmente
        }
        System.out.println();
    }

    static void ejemplo2() {
        System.out.println("Ejemplo2: Bucle while(true) {... actualizar variableDeControl ...} bucle infinito por defecto");
        int contador = 0;
        while(true) {               // Condición de salida (en este caso es un bucle infinito)
            System.out.print(contador + " ");
            contador++;             // Tenemos que manejar la variable de control manualmente
            if(contador > 9) break; // Debemos controlar la condición dentro del bucle para evitar que sea infinito
        }
        System.out.println();
    }

    static void ejemplo3() {
        System.out.println("Ejemplo3: Bucle while(condicion) {... actualizar variableDeControl ...} nos saltamos los pares");
        int contador = 0;
        while(contador <= 9) {      // Condición de salida (en este caso es un bucle infinito)
            if(contador % 2 == 0) {
                contador++;
                continue;           // Forzamos al bucle a pasar a la siguiente iteración
            }
            System.out.print(contador + " ");
            contador++;             // Tenemos que manejar la variable de control manualmente
        }
        System.out.println();
    }
}
