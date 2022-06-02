package metodos.sobreescritura;

/**
 * Demostración de sobreescritura de métodos correcta
 *
 * NORMAS:
 * No se puede sobreescribir métodos final
 * No se considera sobreescritura si lo es de un método estático
 * El tipo de los parámetros debe ser el mismo
 * El tipo de retorno puede ser el mismo o un subtipo de éste
 * El modificar de acceso puede ser el mismo o menos restrictivo
 *
 * @author magcarnota
 */
public class ClaseHija extends ClasePadre {

    // Misma firma
    @Override
    protected Number sayYourAge(Number age) {
        System.out.println("Metodo de clase hija!");
        return null;
    }

    // ---------------------- FUNCIONAN -------------------------------

    // FUNCIONA porque EL MODIFICADOR DE ACCESO (public)
    // ES MENOS RESTRICTIVO QUE EL DEL MÉTODO AL QUE SOBREESCRIBE (protected)
//    @Override
//    public Number sayYourAge(Number age) {
//        System.out.println("Metodo de clase hija!");
//        return null;
//    }

    // FUNCIONA porque EL TIPO DE RETORNO (Double)
    // ES UN SUBTIPO DEL TIPO DE RETORNO DEL MÉTODO AL QUE SOBREESCRIBE (Number)
//    @Override
//    protected Double sayYourAge(Number age) {
//        System.out.println("Metodo de clase hija!");
//        return null;
//    }

    // --------------------- NO FUNCIONAN -----------------------------

    // NO FUNCIONA porque EL MODIFICADOR DE ACCESO (private) ES MÁS
    // RESTRICTIVO QUE EL DEL MÉTODO QUE SOBREESCRIBE (protected)
//    @Override
//    private Number sayYourAge(Number age) {
//        System.out.println("Metodo de clase hija!");
//        return null;
//    }

    // NO FUNCIONA porque EL PARÄMETRO ES DE DISTINTO TIPO (Double)
    // QUE EL DEL MÉTODO AL QUE SOBREESCRIBE (Number)
//    @Override
//    protected Number sayYourAge(Double age) {
//        System.out.println("Metodo de clase hija!");
//        return null;
//    }
}
