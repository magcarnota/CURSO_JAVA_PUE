package estructuras.estructura_if;

import java.util.Random;

public class EstructuraIF {
    public static void main(String[] args) {
        ifSimple();
        ifElse();
        ifAnidados();
    }

    public static void ifSimple(){
        int numeroAleatorio = new Random().nextInt(3); // Generamos un número aleatorio entre 0 y 2 (ambos incluidos)

        System.out.println("El número aleatorio es el " + numeroAleatorio);
        System.out.println("Mostraremos \"ÉXITO!\" sólo si el número es 2.");

        if (numeroAleatorio == 2) {
            System.out.println("ÉXITO!");
        }
    }

    public static void ifElse(){
        int numeroAleatorio = new Random().nextInt(3); // Generamos un número aleatorio entre 0 y 2 (ambos incluidos)

        System.out.println("El número aleatorio es el " + numeroAleatorio);
        System.out.println("Mostraremos \"ÉXITO!\" sólo si el número es 2 y \"FRACASO!\" de lo contrario.");

        if (numeroAleatorio == 2) {
            System.out.println("ÉXITO!");
        } else {
            System.out.println("FRACASO!");
        }
    }

    public static void ifAnidados(){
        int numeroAleatorio = new Random().nextInt(3); // Generamos un número aleatorio entre 0 y 2 (ambos incluidos)

        System.out.println("El número aleatorio es el " + numeroAleatorio);
        System.out.println("Mostraremos el número aleatorio en texto.");

        if (numeroAleatorio == 0) {
            System.out.println("CERO!");
        } else if (numeroAleatorio == 1) {
            System.out.println("UNO!");
        } else {
            System.out.println("DOS!");
        }
    }
}
