package genericos;

/**
 * Clase para testing de genéricos
 * @author magcarnota
 */
public class TestGenericos {
    public static void main(String[] args) {
        System.out.println("MiClase<T> acepta como atributo un tipo cualquiera");

        System.out.println("Instanciamos MiClase<String>:");
        MiClase<String> objetoConString = new MiClase<>("String de objeto");
        System.out.println("Valor de atributo de objeto: " + objetoConString.getAtributo());

        System.out.println("-------------------------------------------------");

        System.out.println("Instanciamos MiClase<Integer>:");
        MiClase<Integer> objetoConInteger = new MiClase<>(12345);
        System.out.println("Valor de atributo de objeto: " + objetoConInteger.getAtributo());
    }
}

class MiClase<T> {
    private T atributo;
    MiClase(T atr) {
        atributo = atr;
    }
    public void setAtributo(T atr) {
        atributo = atr;
    }
    public T getAtributo() {
        return atributo;
    }
}