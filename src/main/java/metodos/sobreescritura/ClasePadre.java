package metodos.sobreescritura;

public class ClasePadre {
    public static void main(String[] args) {
        new ClasePadre().sayYourAge(null);
        new ClaseHija().sayYourAge(null);
    }

    /**
     * Método a sobreescribir
     * @param age not used
     * @return null
     */
    protected Number sayYourAge(Number age) {
        System.out.println("Metodo de clase padre!");
        return null;
    }
}
