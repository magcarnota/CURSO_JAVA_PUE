package metodos;

/**
 * Número variable de parámetros pasados a un método
 * @author magcarnota
 */
public class NumeroVariableDeParametros {

    public static void main(String[] args) {
        metodo1("Parametro 1", "Parametro 2");
        metodo1("Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        metodo1();                                          // Al ser longitud variable de parametros, ésta puede ser 0
        metodo1(new String[]{"Array", "de", "Strings"});    // Se le puede pasar un array como parametro

        metodo2("Ejecutando metodo2:", 4, 23, 234, 0);
        metodo2("Ejecutando metodo2 con solo un parámetro");

        metodo3("Ejecutando metodo3:", "SÁBADO", "DOMINGO");

        metodo4("Ejecutando metodo4:", 2022, "Julio", "Agosto");
    }

    private static void metodo1(String... parametros) {
        System.out.println("Ejecutando metodo1:");

        if (parametros.length == 0) {
            System.out.println("No hay parámetros de longitud variable");
            return;
        }

        for (String parametro : parametros) {
            System.out.println(parametro);
        }
    }

    private static void metodo2(String msg, int... numeros) {
        System.out.println(msg);

        if (numeros.length == 0) {
            System.out.println("No hay parámetros de longitud variable");
            return;
        }

        for (int n: numeros) {
            System.out.println(n);
        }
    }

    private static void metodo3(String msg, String... finde) {
        System.out.println(msg);

        if (finde.length == 0) {
            System.out.println("No hay parámetros de longitud variable");
            return;
        }

        for (String dia: finde) {
            System.out.println(dia);
        }
    }

    private static void metodo4(String msg, int curso, String... vacaciones) {
        System.out.println(msg);
        System.out.println("Curso: " + curso);

        if (vacaciones.length == 0) {
            System.out.println("No hay parámetros de longitud variable");
            return;
        }

        for (String mes: vacaciones) {
            System.out.println(mes);
        }
    }
}
