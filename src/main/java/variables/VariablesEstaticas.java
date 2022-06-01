package variables;

/**
 * Pruebas de variables static (pertenecientes a la clase).
 * Las variables estáticas se pueden acceder desde la clase
 * y desde los objetos creados a partir de esa clase.
 * @author magcarnota
 */
public class VariablesEstaticas {
    static String variableEstatica = "Soy una variable estática definida en la clase VariablesEstaticas!";

    public static void main(String[] args) {
        System.out.println("Accediendo desde la clase:");
        System.out.println("variableEstatica: " + variableEstatica);
        System.out.println("--------------------------------------------");

        VariablesEstaticas objeto = new VariablesEstaticas();
        System.out.println("Accediendo desde un objeto de la misma clase:");
        System.out.println("objeto.variableEstatica: " + objeto.variableEstatica);
        System.out.println("--------------------------------------------");

        OtraClase objetoOtraClase = new OtraClase();
        objetoOtraClase.accederVariableEstaticaDeOtraClase();
    }
}

class OtraClase {
    void accederVariableEstaticaDeOtraClase() {
        System.out.println("Accediendo desde un objeto de otra clase:");
        System.out.println("objetoOtraClase.accederVariableEstaticaDeOtraClase(): " + VariablesEstaticas.variableEstatica);
    }
}