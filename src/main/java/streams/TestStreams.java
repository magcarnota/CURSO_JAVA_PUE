package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Clase para testing de streams
 * Características:
 * - El procesamiento puede ser secuencial o paralelo
 * - Una vez el elemento es procesado, no vuelve a estar disponible en el strem
 *
 * @author magcarnota
 */
public class TestStreams {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();

        System.out.println("Generamos una lista de 100 productos con precio aleatorio entre 1 y 1.99");
        generaLista(lista, 100);

        //lista.forEach(System.out::println); // Mostramos la lista

        System.out.println("Queremos el nombre de todos aquellos productos cuyo precio sea >= 1.5 y <= 1.55 en procesamiento secuencial:");
        long inicio = System.currentTimeMillis();
        lista.stream()  // Obtenemos un stream de la lista (este paso no es necesario)
                .filter(producto -> producto.getPrecio() >= 1.5 && producto.getPrecio() <= 1.55)    // Añadimos un filtro
                .map(producto -> producto.getNombre())  // De cada producto que haya pasado el filtro nos quedamos con el nombre
                .forEach(System.out::println);          // Mostramos cada nombre
        System.out.println("Tiempo transcurrido: " + (System.currentTimeMillis() - inicio) + " ms.");

        System.out.println();

        System.out.println("Queremos el nombre de todos aquellos productos cuyo precio sea >= 1.5 y <= 1.55 en procesamiento paralelo:");
        inicio = System.currentTimeMillis();
        lista.stream()
                .parallel() // Indicamos que queremos que este stream se procese en paralelo
                .filter(producto -> producto.getPrecio() >= 1.5 && producto.getPrecio() <= 1.55)    // Filtramos
                .map(producto -> producto.getNombre())  // Nos quedamos con el nombre
                .forEach(System.out::println);          // Mostramos
        System.out.println("Tiempo transcurrido: " + (System.currentTimeMillis() - inicio) + " ms.");

        System.out.println();

        System.out.println("Queremos contar el número de productos cuyo precio sea 1.25:");
        long total = lista.stream()
                .filter(producto -> producto.getPrecio() == 1.25)   // Filtramos
                .peek(producto -> System.out.println(producto))     // Para cada uno que haya pasado el filtro lo mostramos
                .count();   // Realizamos el recuento
        System.out.println("Total de productos con precio igual a 1.25: " + total);

        System.out.println();

        System.out.println("Podemos enlazar varios Consumers con el método de Consumer andThen(<Consumer>).");
        System.out.println("Aplicamos a todos los productos con precio mayor o igual a 1.95 un descuento del 10% y");
        System.out.println("marcamos el nombre como REBAJADO:");
        Consumer<Producto> aplicaDescuento = producto -> producto.setPrecio(producto.getPrecio() * 0.9);
        Consumer<Producto> marcaRebajado = producto -> producto.setNombre(producto.getNombre() + " REBAJADO");

        lista.stream()
                .filter( producto -> producto.getPrecio() >= 1.95 )  // Filtramos por los productos con precio >= 1.95
                .peek( System.out::println )    // Mostramos los productos que superan el filtro
                .forEach( aplicaDescuento.andThen(marcaRebajado) ); // Aplicamos primero el descuento y después marcamos REBAJADO

        System.out.println();

        System.out.println("Productos rebajados:");
        lista.stream()
                .filter( producto -> producto.getNombre().contains("REBAJADO") )
                .forEach(System.out::println);

    }

    /**
     * Añade numeroDeElementos productos a la lista con precio aleatorio entre 1 y 1.99
     * @param lista
     * @param numeroDeElementos
     */
    private static void generaLista(List<Producto> lista, int numeroDeElementos) {
        double precio;
        for(int i = 0; i < numeroDeElementos; i++) {
            precio = Math.round( (new Random().nextDouble() + 1) * 100.0 ) / 100.0;
            lista.add( new Producto("Producto_" + i, precio) );
        }
    }
}

class Producto {
    private String nombre;
    private double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() { return this.nombre; }
    public double getPrecio() { return this.precio; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    @Override
    public String toString() { return nombre + " - " + precio; }
}
