package herencia;

/**
 * Clase para pruebas con palabra reservada super
 * y palabra reservada this
 * @author magcarnota
 */
public class TestSuperThis {
    public static void main(String[] args) {
        Hija hija = new Hija("Mensaje de Hija.");

        System.out.println("Hija msg: " + hija.msg);
        System.out.println("Padre msg: " + ((Padre)hija).msg);
        hija.metodo();
//        ((Padre)hija).metodo();   // Ejecuta igualmente el método de Hija
        Padre padre = new Padre("Mensaje de Padre");
        padre.metodo();
        hija.ejecutaMetodos();
    }
}

class Padre {
    String msg;
    Padre(String msg) {
        this.msg = msg; // this.msg referencia a la variable del objeto actual y msg al parámetro del constructor
    }
    void metodo() {
        System.out.println("Método de Padre!");
    }
}

class Hija extends Padre {
    String msg;
    Hija(String msg) {
        super("Mensaje de Padre."); //  Hay que llamar explícitamente al constructor de la superclase en la primera linea
        this.msg = msg;
    }

    @Override
    void metodo() {
        System.out.println("Método de Hija!");
    }

    void ejecutaMetodos() {
        super.metodo(); // Para inicar que el método que queremos ejecutar es el de la superclase
        metodo();       // Igual que poner: this.metodo();
    }
}
