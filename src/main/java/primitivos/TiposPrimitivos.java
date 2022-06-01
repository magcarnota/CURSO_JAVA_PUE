package primitivos;

/**
 * Pruebas con tipos primitivos
 * @author magcarnota
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        byte byte_variable = 0;
        short short_variable = 0;
        int int_variable = 0;
        long long_variable = 0L;    // preferida L a l por legibilidad

        float float_variable = 0F;  // preferida F a f por legibilidad
        double double_variable = 0.0;

        char char_variable = 'A';
        boolean boolean_variable = true;

        printMaxMin();

        boxing(int_variable);
    }

    /**
     * Imprime los valores máximos y mínimos para los tipos primitivos
     */
    public static void printMaxMin() {
        System.out.println("Tipo\tMIN\t\t\t\t\t\tMAX");
        System.out.println("------------------------------------------------------");
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("------------------------------------------------------");
        System.out.println("float\t" + Float.MIN_VALUE + "\t\t\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t" + Double.MIN_VALUE + "\t\t\t\t" + Double.MAX_VALUE);
        System.out.println("------------------------------------------------------");
        System.out.println("char\t" + Character.MIN_VALUE + "\t\t\t\t\t\t" + Character.MAX_VALUE);
        System.out.println("------------------------------------------------------");
        System.out.println("boolean\t" + Boolean.FALSE + "\t\t\t\t\t" + Boolean.TRUE);
    }

    /**
     * Demostración de auto-boxing al almacenar en un Integer el valor de un int
     * y auto-unboxing al almacenar en un int el valor de un Integer
     * @param entero int
     */
    static void boxing(int entero) {
        System.out.println("Hacemos auto-boxing con Integer variableInteger = entero; :");
        Integer variableInteger = entero;
        System.out.println("variableInteger: " + variableInteger);
        System.out.println("Hacemos auto-unboxing con int variableInt = variableInteger; :");
        int variableInt = variableInteger;
        System.out.println("variableInt: " + variableInt);
    }
}
