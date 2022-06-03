package constructores;

/**
 * Test de constructores
 * @author magcarnota
 */
public class TestConstructores {
    public static void main(String[] args) {
        System.out.println("--------------- EJEMPLO 1 ---------------");
        ClaseSinConstructor sinConstructor = new ClaseSinConstructor();
        sinConstructor.mostrarMsg();

        System.out.println("--------------- EJEMPLO 2 ---------------");
        ClaseConConstructor conConstructor = new ClaseConConstructor();
        conConstructor.mostrarMsg();

        System.out.println("--------------- EJEMPLO 3 ---------------");
        conConstructor = new ClaseConConstructor("Valor de atributo pasado al constructor");
        conConstructor.mostrarMsg();

        System.out.println("--------------- EJEMPLO 4 ---------------");
        ClaseConConstructorHija conConstructorHija = new ClaseConConstructorHija("Atributo en padre", "Atributo en hija");
        conConstructorHija.mostrarMsg();
    }
}
