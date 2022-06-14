package expresiones_lambda;

/**
 * Clase para testing de expresiones lambda
 * @author magcarnota
 */
public class TestExpresionesLambda {
    public static void main(String[] args) {
        MiInterfazFuncionalOperacion<Integer> suma = (op1, op2) -> op1 + op2;
        System.out.println("Pasamos op1=5, op2=3 e implementación del interfaz funcional definiendo una suma:");
        metodo(5, 2, suma);

        System.out.println("Mismos operandos (5, 2) pero pasamos una expresión lamba directamente como instancia del interfaz con resta:");
        metodo(5, 2, (MiInterfazFuncionalOperacion<Integer>)((a, b) -> a - b));

        MiInterfazFuncionalOperacion<Integer> potencia = new MiInterfazFuncionalOperacion<Integer>() {
            @Override
            public Integer opera(Integer operando1, Integer operando2) {
                Integer resultado = 1;
                for(int i = 0; i < operando2; i++) {
                    resultado *= operando1;
                }
                return resultado;
            }
        };
        System.out.println("Mismos operandos pero definiendo una instancia del interfaz funcional para potencia:");
        metodo(5, 2, potencia);

        /*
        Cuando el interfaz funcional cuenta con un método con un solo parámetro, no es necesario indicarlo entre paréntesis.
        Si queremos indicar el tipo del parámetro entonces aunque sólo sea uno, deberá ir entre paréntesis (String param) -> ...
        Al otro lado de la flecha, irá la instrucción a ejecutar, y si el método devuelve algo, no hará falta la sentencia return.
        Si el cuerpo del método cuenta con varias sentencias, deberán ir entre llaves y será obligatorio el usa de return si es
        que el método devuelve algún valor.
         */
        OtroInterfazFuncional<String> presentar = n -> {
            StringBuilder sb = new StringBuilder("Bienvenido señor ");
            String[] partes = n.split(" ");

            if(partes.length == 2)
                sb.append(partes[1]);
            else
                sb.append(partes[partes.length - 2]).append(" ").append(partes[partes.length - 1]);
            return sb.toString();
        };
        System.out.println( presentar.darBienvenida("Pepe Pérez") );
        System.out.println( presentar.darBienvenida("Francisco Manuel Gómez García") );

    }

    /**
     * Método al que le podemos pasar un interfaz funcional o bien como instancia
     * de MiInterfazFuncional o bien directamente la expresión lambda
     * @param a
     * @param b
     * @param operacion expresión lambda o instancia de interfaz funcional
     */
    public static void metodo(Integer a, Integer b, MiInterfazFuncionalOperacion operacion) {
        //System.out.println("Operando a: " + a + " operando b: " + b + " = " + operacion.opera(a, b));
        System.out.println(operacion.opera(a, b));
    }
}

/**
 * Interfaz funcional con método que aceptará dos parámetros
 * del mismo tipo T y devolverá un resultado de tipo T
 * @param <T> Tipo de dato de los operandos y de retorno
 */
@FunctionalInterface
interface MiInterfazFuncionalOperacion<T> {
    public T opera(T operando1, T operando2);
}

/**
 * Interfaz funcional con método que recibe un solo parámetro
 * y realiza algo con él
 * @param <T> tipo del parámetro
 */
@FunctionalInterface
interface OtroInterfazFuncional<T> {
    public String darBienvenida(T nombre);
}