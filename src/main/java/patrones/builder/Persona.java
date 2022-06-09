package patrones.builder;

/**
 * Clase para pruebas de patrón Builder
 * @author magcarnota
 */
public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    /**
     * Constructor de Persona
     * Es privado así que no se puede crear un objeto de Persona
     * desde fuera de la misma clase
     * @param nombre
     * @param edad
     * @param direccion
     */
    private Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    /**
     * La clase interna estática Constructor se encarga de
     * contruir un objeto persona con los atributos que se
     * le indican a través de sus métodos y finalmente
     * llamando al método construir.
     * Ej:
     * <code>
     * Persona.Constructor constructor = new Persona.Constructor();
     * Persona persona = constructor.nombre("Pepe").edad(34).direccion("Su casa").construir();
     * </code>
     * No importa el orden de llamada de los métodos los métodos
     * siempre y cuando llamamemos finalmente al método construir().
     */
    public static class Constructor {
        private String nombre = "<Desconocido>";        // Valor por defecto
        private int edad = 0;                           // Valor por defecto
        private String direccion = "<Sin dirección>";   // Valor por defecto

        /**
         * Setea el nombre y devuelve una instancia de Constructor
         * para que sea posible seguir concatenando métodos
         * @param nombre
         * @return
         */
        public Constructor nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        /**
         * Setea la edad y devuelve una instancia de Constructor
         * para que sea posible seguir concatenando métodos
         * @param edad
         * @return
         */
        public Constructor edad(int edad) {
            this.edad = edad;
            return this;
        }

        /**
         * Setea la dirección y devuelve una instancia de Constructor
         * para que sea posible seguir concatenando métodos
         * @param direccion
         * @return
         */
        public Constructor direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        /**
         * Construye y devuelve un objeto de tipo Persona
         * con los valores de sus atributos que anteriormente
         * se le han indicado (o usando los valores por defecto
         * en caso contrario).
         * @return
         */
        public Persona contruir() {
            return new Persona(nombre, edad, direccion);
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
