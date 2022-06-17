package excepciones;

import java.sql.SQLOutput;

/**
 * Clase para testing de excepciones.
 * Throwable
 *  - Error
 *      - ...
 *  - Exception
 *      - ...
 *      - RunTimeException
 *          -...
 * La clase exception y las que heredan de ella DEBEN ser capturadas.
 * La clase Error y sus descendientes así como RuntimeException y
 * sus descendientes, PUEDEN ser capturadas o no.
 * Se pueden crear excepciones personalizadas extendiendo Exception.
 * @author magcarnota
 */
public class TestExcepciones {
    public static void main(String[] args) {
        Integer[] valores = {3, 5, 25, 0};

        System.out.println("METODO1:");
        try {
            metodo1(valores, valores.length);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            System.out.println("Capturamos la excepción: " + outOfBoundsException.getClass().getSimpleName());
        } catch (Exception exception) {
            System.out.println("No pasamos por aquí ya que se capturó la excepción antes!");
        } finally {
            System.out.println("Parte que se ejecutará de todas formas.");
        }

        System.out.println();

        System.out.println("METODO2");
        try {
            metodo2(valores, valores.length);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            System.out.println(outOfBoundsException.getMessage());
        }

        System.out.println();

        System.out.println("METODO3");
        try {
            metodo3(valores, valores.length);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
            System.out.println(outOfBoundsException.getClass().getSimpleName());
        }

        System.out.println();

        System.out.println("METODO4");
        try {
            metodo4(valores, valores.length);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getClass().getSimpleName());
        }

        System.out.println();

        System.out.println("METODO5");
        try {
            metodo5(valores, 2);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (NumeroParException numeroParException) {
            System.out.println(numeroParException.getMessage());
        }

        System.out.println();

        System.out.println("METODO5");
        try {
            metodo5(valores, 2);
            // Las siguientes instrucciones no se realizarán
            // ....
            // ....
        } catch (NumeroParException | ArithmeticException exception) {
            System.out.println("Se pueden agrupar varias excepciones en un catch siempre que no sean del mismo tipo.");
            System.out.println(exception.getClass().getSimpleName());
        }
    }

    /**
     * Este método provocará una excepción del tipo
     * java.lang.ArrayIndexOutOfBoundsException pero no lo
     * indicamos.
     * @param valores arrays con valores enteros
     * @param indice índice al que queremos acceder
     */
    private static void metodo1(Integer[] valores, int indice) {
        System.out.println(valores[indice]);
    }

    /**
     * Este método provocará una excepción del tipo
     * java.lang.ArrayIndexOutOfBoundsException pero no lo
     * indicamos y la lanzamos nosotros manualmente.
     * @param valores arrays con valores enteros
     * @param indice índice al que queremos acceder
     */
    private static void metodo2(Integer[] valores, int indice) {
        if(indice >= valores.length)
            throw new ArrayIndexOutOfBoundsException("Indice fuera de rango!");

        System.out.println(valores[indice]);
    }

    /**
     * Este método provocará una excepción del tipo
     * java.lang.ArrayIndexOutOfBoundsException y lo
     * indicamos con la palabra reservada throws.
     * @param valores arrays con valores enteros
     * @param indice índice al que queremos acceder
     */
    private static void metodo3(Integer[] valores, int indice)
            throws ArrayIndexOutOfBoundsException {
        System.out.println(valores[indice]);
    }

    /**
     * Este método provocará una excepción del tipo
     * java.lang.ArithmeticException y lo
     * indicamos con la palabra reservada throws.
     * @param valores arrays con valores enteros
     * @param indice índice al que queremos acceder
     */
    private static void metodo4(Integer[] valores, int indice)
            throws ArithmeticException {
        System.out.println(valores[indice - 1] / valores[valores.length - 1]);
    }

    /**
     * Este método provocará una excepción del tipo
     * NumeroParException (excepción personalizada) y lo
     * indicamos con la palabra reservada throws.
     * @param valores arrays con valores enteros
     * @param indice índice al que queremos acceder
     */
    private static void metodo5(Integer[] valores, int indice)
            throws NumeroParException {
        if(0 == (indice % 2))
            throw new NumeroParException("El índice es un número par!");
        else
            System.out.println("El índice no es un número par.");
    }
}

/**
 * Excepción personalizada
 */
class NumeroParException extends Exception {
    public NumeroParException() { super(); }
    public NumeroParException(String message) { super(message); }
    public NumeroParException(String message, Throwable cause) { super(message, cause); }
}
