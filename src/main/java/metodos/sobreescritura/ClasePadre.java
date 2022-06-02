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
public class ClasePadre {
    public static void main(String[] args) {
        (new ClaseHija()).sayYourAge(null);
    }

    /**
     * Método a sobreescribir
     * @param age
     * @return
     */
    protected Number sayYourAge(Number age) {
        System.out.println("Metodo de clase padre!");
        return null;
    }
}
