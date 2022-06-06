package herencia.clases_abstractas;

/**
 * Clase para testing de clases abstractas (aquellas que no se
 * pueden instanciar y que cuentan con uno o varios métodos
 * abstract que han de ser implementados en sus subclases)
 * @author magcarnota
 */
public class TestClasesAbstractas {
    public static void main(String[] args) {
        System.out.println("-------------- Instanciamos ClaseNormal --------------");
        ejecutarMetodo( new ClaseNormal() );
        System.out.println("-------------- Instanciamos OtraClaseNormal --------------");
        ejecutarMetodo( new OtraClaseNormal() );
//        metodo( new ClaseAbstracta() );   // Como es una clase abstracta, no se puede instanciar
        System.out.println("-------------- Instanciamos ClaseNormal con parametro --------------");
        ejecutarMetodo( new ClaseNormal("Mensaje incializado desde ClaseNormal") );
    }

    static void ejecutarMetodo(ClaseAbstracta claseAbstracta) {
        claseAbstracta.metodoAbstracto();
        claseAbstracta.metodoNormal();
    }
}

abstract class ClaseAbstracta {
    private String msg;

    /**
     * En las clases abstractas podemos tener constructores que
     * serán llamados desde las subclases de forma implícita o
     * explícita
     */
    ClaseAbstracta() {
        this.msg = "Mensaje incializado desde ClaseAbstracta";
        System.out.println("En constructor llamado de forma implícita de ClaseAbstracta!");
    }

    ClaseAbstracta(String msg) {
        this.msg = msg;
        System.out.println("En constructor llamado de forma explícita de ClaseAbstracta!");
    }

    /**
     * Método abstracto que han de definir las subclases
     */
    abstract void metodoAbstracto();

    void metodoNormal() {
        System.out.println("Ejecutando metodoNormal definido en ClaseAbstracta... msg: " + msg);
    }
}

class ClaseNormal extends ClaseAbstracta {
    ClaseNormal(){
        System.out.println("En constructor ClaseNormal!");
    }

    ClaseNormal(String msg) {
        super(msg); // Llamamos de forma explícita al constructor de la superclase
    }

    @Override
    void metodoAbstracto() {
        System.out.println("Ejecutando metodoAbstracto de ClaseNormal...");
    }
}

class OtraClaseNormal extends ClaseAbstracta {
    OtraClaseNormal(){
        System.out.println("En constructor OtraClaseNormal!");
    }

    OtraClaseNormal(String msg) {
        super(msg); // Llamamos de forma explícita al constructor de la superclase
    }
    @Override
    void metodoAbstracto() {
        System.out.println("Ejecutando metodoAbstracto de OtraClaseNormal...");
    }
}
