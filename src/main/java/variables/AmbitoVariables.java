package variables;

/**
 * Ámbito de las variables
 * @author magcarnota
 */
public class AmbitoVariables {
    // Visibles en toda la clase (globales para toda la clase)
    static String nivel0 = "en toda la clase!";

    public static void main(String[] args) {
        // Visibles dentro del método
        String nivel1 = "dentro método de main!";

        System.out.println("Estoy dentro de main:");
        System.out.println("nivel0: " + nivel0);
        System.out.println("nivel1: " + nivel1);
        System.out.println("------------------------------");

        if (true) {
            // Visible dentro del if
            String nivel2 = "dentro del if!";

            System.out.println("Estoy dentro del if:");
            System.out.println("nivel0: " + nivel0);
            System.out.println("nivel1: " + nivel1);
            System.out.println("nivel2: " + nivel2);
            System.out.println("------------------------------");

            {
                // Visible dentro del bloque de codigo
                String nivel3 = "dentro del bloque!";

                System.out.println("Estoy dentro del bloque:");
                System.out.println("nivel0: " + nivel0);
                System.out.println("nivel1: " + nivel1);
                System.out.println("nivel2: " + nivel2);
                System.out.println("nivel3: " + nivel3);
                System.out.println("------------------------------");
            }
        }

        miMetodo();
    }

    static void miMetodo() {
        String nivel1 = "dentro de miMetodo!";

        System.out.println("Estoy dentro de miMetodo:");
        System.out.println("nivel0: " + nivel0);
        System.out.println("nivel1: " + nivel1);
    }

}
