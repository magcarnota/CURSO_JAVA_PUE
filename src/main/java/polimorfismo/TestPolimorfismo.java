package polimorfismo;

/**
 * Clase para probar polimorfismo
 * @author magcarnota
 */
public class TestPolimorfismo {
    public static void main(String[] args) {
        System.out.println("Instanciamos un objeto tipo Animal:");
        desplazarse( new Animal() );

        System.out.println("Instanciamos un objeto tipo Pez:");
        desplazarse( new Pez() );

        System.out.println("Instanciamos un objeto tipo Ave:");
        desplazarse( new Ave() );
    }

    public static void desplazarse(Animal animal) {
        System.out.println("Llamando al método mover de un objeto de tipo " + animal.getClass().getSimpleName());
        animal.mover();
    }
}

class Animal {
    public void mover() {
        System.out.println("Andando...");
    }
}

class Pez extends Animal {
    @Override
    public void mover() {
        System.out.println("Nadando...");
    }
}

class Ave extends Animal {
    @Override
    public void mover() {
        System.out.println("Volando...");
    }
}