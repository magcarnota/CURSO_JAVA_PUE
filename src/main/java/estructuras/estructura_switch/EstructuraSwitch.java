package estructuras.estructura_switch;

import java.util.Random;

public class EstructuraSwitch {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(5); // Generamos un numero entre el 0 y el 4

        switch (numeroAleatorio) {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            default:
                System.out.println("Imposible!");
        }
    }
}
