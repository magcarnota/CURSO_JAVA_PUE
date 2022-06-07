package bucles;

/**
 * Clase para testing de bucle for
 * @author magcarnota
 */
public class TestBucleFor {
    public static void main(String[] args) {
        System.out.println("Imprimir del 0 al 4:");

        ejemplo1();

        ejemplo2();

        ejemplo3();

        ejemplo4();

        ejemplo5();

        ejemplo6();
    }

    static void ejemplo1() {
        System.out.println("Ejemplo1: Bucle for(variableDeControl; condicionDeSalida; actualizar variableDeControl):");
        for(int variableDeControl = 0; variableDeControl < 5; variableDeControl++) {
            System.out.print(variableDeControl + " ");
        }
        System.out.println();
    }

    static void ejemplo2() {
        // La variable de control se puede declarar e inicializar fuera del bucle
        System.out.println("Ejemplo2: variableDeControl creada e inicializada fuera del bucle:");
        int variableDeControl = 0;
        for( ; variableDeControl < 5; variableDeControl++) {
            System.out.print(variableDeControl + " ");
        }
        System.out.println();
    }

    static void ejemplo3() {
        // La variable de control se puede actualizar dentro del bucle
        System.out.println("Ejemplo3: variableDeControl actualizada dentro del bucle:");
        for(int variableDeControl = 0 ; variableDeControl < 5; ) {
            System.out.print(variableDeControl++ + " ");
        }
        System.out.println();
    }

    static void ejemplo4() {
        // La condición de salida se modifica dentro del bucle
        System.out.println("Ejemplo4: condición de salida modificada dentro del bucle:");
        for(int variableDeControl = 0 ; ; variableDeControl++) {
            if (variableDeControl > 4) break;   // La sentencia break fuerza a salir del bucle.
            System.out.print(variableDeControl + " ");
        }
        System.out.println();
    }

    static void ejemplo5() {
        // Uso de continue para forzar a pasar a la siguiente iteración
        System.out.println("Ejemplo5: Uso de continue para saltar el número 3:");
        for(int variableDeControl = 0 ; variableDeControl < 5; variableDeControl++) {
            if (variableDeControl == 3) continue;   // La sentencia continue fuerza a pasar a la siguiente iteración.
            System.out.print(variableDeControl + " ");
        }
        System.out.println();
    }

    static void ejemplo6() {
        // Uso de etiquetas para indicar a continue o break hacia donde saltar
        System.out.println("Ejemplo6: Uso de etiquetas con break o continue:");
        boolean entrar_en_bucle = true;
        Etiqueta_break:
        if(entrar_en_bucle) {
            System.out.println("Entro en el bucle...");
            for(int variableDeControl = 0 ; variableDeControl < 5; variableDeControl++) {
                if (variableDeControl == 3) {
                    entrar_en_bucle = false;
                    break Etiqueta_break;   // La sentencia break <etiqueta> fuerza a salir del bucle en la etiqueta.
                }
                System.out.print(variableDeControl + " ");
            }
        }
        if(!entrar_en_bucle){
            System.out.println("\nEsta vez paso por la etiqueta pero no entro en el bucle.");
        }
        System.out.println();

    }
}
