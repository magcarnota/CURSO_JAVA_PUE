package metodos.sobrecarga;

/**
 * Sobrecarga de métodos
 * Reglas:
 * 1) dos o más métodos dentro de la misma clase que tengan el mismo nombre
 * 2) mismo tipo de retorno
 * 3) diferente número o diferente tipo de parámetros o ambas cosas
 * @author magcarnota
 */
public class SobrecargaDeMetodos {

    public static void main(String[] args) {
        System.out.println( metodoSobrecargado(1) );
        System.out.println( metodoSobrecargado("Hola mundo!") );
        System.out.println( metodoSobrecargado(25, "Junio") );
    }

    private static String metodoSobrecargado(Integer parametro) {
        return "Soy el método que recibe un Integer";
    }
    private static String metodoSobrecargado(String parametro) {
        return "Soy el método que recibe un String";
    }
    private static String metodoSobrecargado(Integer parametro1, String parametro2) {
        return "Soy el método que recibe un Integer y un String";
    }
}
