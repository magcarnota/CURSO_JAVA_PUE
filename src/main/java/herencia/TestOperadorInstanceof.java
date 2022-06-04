package herencia;

/**
 * Clase para pruebas del operador instanceOf
 * @author magcarnota
 */
public class TestOperadorInstanceof {
    public static void main(String[] args) {
        Producto producto = new Producto();
        Comida comida = new Comida();
        Bebida bebida = new Bebida();

        System.out.println("producto instanceof Producto? " + (producto instanceof Producto));
        System.out.println("producto instanceof Comida? " + (producto instanceof Comida));
        System.out.println("comida instanceof Producto? " + (comida instanceof Producto));
        // System.out.println("comida instanceof Bebida? " + (comida instanceof Bebida));
        System.out.println("comida instanceof Bebida? NO ESTÁ PERMITIDO PORQUE UNO NO ES SUBTIPO DEL OTRO");

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Almacenamos comida en un objeto de clase Object:");
        Object objeto = comida;
        System.out.println("objeto instanceof Bebida? " + (objeto instanceof Bebida));
        System.out.println("objeto instanceof Comida? " + (objeto instanceof Comida));
        System.out.println("objeto instanceof Producto? " + (objeto instanceof Producto));
    }
}
