package interfaces.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Clase para testing del interfaz funcional Predicate
 * Métodos estáticos:
 * isEqual(<Object>) comprueba que es un objeto de la misma clase
 * not(<Predicate>)  niega el predicado indicado
 * Métodos por defecto:
 * and(<Predicate>) debe cumplir este predicado Y el anterior en AND de cortocircuito
 * or(<Predicate>)  debe de cumplir este predicado, el otro O los dos en OR de cortocircuito
 * negate()         devuelve un Predicate que es la negación lógica del predicado que lo invoca
 * Método sin implementar:
 * test(<T>)    evalúa un predicado en el elemento pasado como parámetro
 * @author magcarnota
 */
public class TestInterfacePredicate {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Chocolate", 1.75));
        lista.add(new Producto("Aceite", 4.75));
        lista.add(new Producto("Leche", 1.15));
        lista.add(new Producto("Almendras", 2.75));

        System.out.println("Listado de productos:");
        lista.stream().forEach(System.out::println);
        System.out.println();


        Predicate<Producto> empiezaPorA = producto -> producto.getNombre().startsWith("A");
        Predicate<Producto> masDeEuroCincuenta = producto -> producto.getPrecio() > 1.5;

        System.out.println("Listado de todos los productos que empiezan por \"A\":");
        lista.stream()
                .filter(empiezaPorA)    // Nos quedamos con los productos que empiezan por "A"
                //.map(p -> p.getNombre())    // Nos quedamos con el nombre de cada producto
                .forEach(System.out::println);  // Mostramos el nombre de cada producto
        System.out.println();

        System.out.println("Listado de todos los productos que NO empiezan por \"A\" con precio superior a 1.5");
        lista.stream()
                .filter(empiezaPorA
                        .negate()   // Negamos que empiece por "A"
                        .and(masDeEuroCincuenta))   // Añadimos el predicado de que cueste más de 1.5
                //.map(producto -> producto.getNombre())  // De cada producto nos quedamos con el nombre
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Listado de productos que empiezan por \"A\" O que su precio NO sea mayor de 1.5:");
        lista.stream()
                .filter( empiezaPorA    // Que empiecen por "A"
                        .or( Predicate.not(masDeEuroCincuenta) ) )  // Con precio menor o igual a 1.5
                .forEach(System.out::println);


    }
}

class Producto {
    private String nombre;
    private double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
