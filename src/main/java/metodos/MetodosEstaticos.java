package metodos;

/**
 * Los métodos estáticos pertencen a la clase y son
 * compartidos por todos los objetos que se creen de esa clase
 * @author magcarnota
 */
public class MetodosEstaticos {

    public static void main(String[] args) {
        // Referenciamos al método estático, dentro de la misma clase,
        // por su nombre o por su nombre compuesto <Clase>.<metodo>()
        metodoEstatico("Llamado desde la clase que lo contiene!");
        MetodosEstaticos.metodoEstatico("Llamado desde la clase que lo contiene!");

        // Refenciamos al método de instancia desde un objeto
        // de la clase que lo contiene
        MetodosEstaticos instanciaDeMetodosEstaticos = new MetodosEstaticos();
        instanciaDeMetodosEstaticos.metodoDeInstancia("Llamado desde instancia de la clase!");

        // Desde la instancia también está accesible el método estático
        instanciaDeMetodosEstaticos.metodoEstatico("Llamado desde una instacia de la clase!");

        // Desde otra clase
        OtraClase instanciaOtraClase = new OtraClase();
        instanciaOtraClase.llamaMetodoEstatico();
    }

    public static void metodoEstatico(String msg) {
        System.out.println(msg);
        System.out.println("ESTÁTICO!");
    }

    public void metodoDeInstancia(String msg) {
        System.out.println(msg);
        System.out.println("DE INSTANCIA!");
    }
}

class OtraClase {
    public void llamaMetodoEstatico() {
        // Desde otra clase, se llama al método estático
        // indicando el nombre de la clase que lo contiene
        MetodosEstaticos.metodoEstatico("Llamada desde otra clase");
    }
}
