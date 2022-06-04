package herencia;

/**
 * Clase para pruebas de herencia
 * @author magcarnota
 */
public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("---------------- EJEMPLO 1 ----------------");
        System.out.println("Creamos un objeto de tipo Comida.");
        Comida comida = new Comida();
        System.out.println("Ejecutando método de la clase object! " + comida.toString());   // Método de la clase Object
        comida.metodoProducto();    // Método de la clase padre Producto
        comida.metodoComida();      // Método de la propia clase Comida

        System.out.println("---------------- EJEMPLO 2 ----------------");
        System.out.println("Asignamos el objeto comida a un objeto tipo Producto.");
        Producto producto = comida;
        System.out.println("Ejecutando método de la clase object! " + producto.toString());   // Método de la clase Object
        producto.metodoProducto();    // Método de la clase padre Producto
        //producto.metodoComida();    // Método de la propia clase Comida
        System.out.println("No puede ejecutar los métodos de la clase Comida ya que es un objeto tipo Producto.");

        System.out.println("---------------- EJEMPLO 3 ----------------");
        System.out.println("Asignamos el objeto comida a un objeto tipo Object.");
        Object objeto = comida;
        System.out.println("Ejecutando método de la clase object! " + objeto.toString());   // Método de la clase Object
        //objeto.metodoProducto();    // Método de la clase padre Producto
        System.out.println("No puede ejecutar los métodos de la clase Producto ya que es un objeto tipo Object.");
        //producto.metodoComida();    // Método de la propia clase Comida
        System.out.println("No puede ejecutar los métodos de la clase Comida ya que es un objeto tipo Object.");

        System.out.println("---------------- EJEMPLO 4 ----------------");
        System.out.println("Asignamos el objeto de tipo Object anterior a uno de tipo Producto.");
        Producto producto2 = (Producto) objeto; // Como vamos hacia abajo en la jerarquía, es necesario el casting
        System.out.println("Ejecutando método de la clase object! " + producto2.toString());   // Método de la clase Object
        producto2.metodoProducto();    // Método de la clase padre Producto
        //producto2.metodoComida();    // Método de la propia clase Comida
        System.out.println("No puede ejecutar los métodos de la clase Comida ya que es un objeto tipo Producto.");

        System.out.println("---------------- EJEMPLO 5 ----------------");
        System.out.println("Asignamos el objeto de tipo Producto anterior a uno de tipo Comida.");
        Comida comida2 = (Comida) producto2; // Como vamos hacia abajo en la jerarquía, es necesario el casting
        System.out.println("Ejecutando método de la clase object! " + comida2.toString());   // Método de la clase Object
        comida2.metodoProducto();    // Método de la clase padre Producto
        comida2.metodoComida();    // Método de la propia clase Comida
    }
}
