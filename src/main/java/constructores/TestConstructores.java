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

        System.out.println("--------------- EJEMPLO 5 ---------------");
        InicializacionEstatica conInicializacionEstatica = new InicializacionEstatica("instancia 1");
        conInicializacionEstatica = new InicializacionEstatica("instancia 2");

        System.out.println("--------------- EJEMPLO 6 ---------------");
        EncadenarConstructores conEncadenarConstructores = new EncadenarConstructores();
        System.out.println();
        conEncadenarConstructores = new EncadenarConstructores("Parametro1");
        System.out.println();
        conEncadenarConstructores = new EncadenarConstructores("Parámetro1", "Parámetro2");

        System.out.println("--------------- EJEMPLO 7 ---------------");
        ConstructorPorCopia objetoParaCopiar = new ConstructorPorCopia("Texto", 1000);
        ConstructorPorCopia objetoCopiado = new ConstructorPorCopia(objetoParaCopiar);
        System.out.println("Son el mismo objeto? " + (objetoCopiado == objetoParaCopiar));
        System.out.println("Son iguales? " + objetoCopiado.equals(objetoParaCopiar));

    }
}
