package interfaces.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Clase para testing de interfaz Comparator<T>
 * Cuenta con los métodos por defecto:
 * thenComparing(<otro comparador>) para una vez comparados por el anterior, hacerlo por el indicado
 * reversed() para invertir el orden de ordenación
 * Cuenta con los métodos estáticos:
 * nullsFirst(<comparador>) para devolver un comparador que muestre los nulos al principio
 * nullsLast(<comparador>)  para devolver un comparador que muestre los nulos al final
 *
 * @author magcarnota
 */
public class TestInterfaceComparator {
    public static void main(String[] args) {
        System.out.println("Creamos un array de objetos MiClase:");
        MiClase objeto1 = new MiClase("Juan", 23);
        MiClase objeto2 = new MiClase("Pedro", 20);
        MiClase objeto3 = new MiClase("Ana", 41);

        MiClase[] array = {objeto1, objeto2, objeto3};

        mostrarArray(array);

        System.out.println("Indicamos que ordene el array con el comparador por nombre:");
        Arrays.sort(array, new MiClaseComparatorNombre());

        mostrarArray(array);

        System.out.println("Indicamos que ordene el array con el comparador por edad:");
        Arrays.sort(array, new MiClaseComparatorEdad());

        mostrarArray(array);

        System.out.println("Usamos el método por defecto thenComparing(otro comparador) del interfaz Comparator");
        System.out.println("para que ordene primero por edad y después por nombre:");
        MiClaseComparatorNombre comparadorPorNombre = new MiClaseComparatorNombre();
        MiClaseComparatorEdad comparadorPorEdad = new MiClaseComparatorEdad();
        Arrays.sort(array, comparadorPorEdad.thenComparing(comparadorPorNombre));

        mostrarArray(array);

        System.out.println("Usamos el método por defecto reversed(otro comparador) del interfaz Comparator");
        System.out.println("para que ordene por nombre del revés:");
        Arrays.sort(array, comparadorPorNombre.reversed());

        mostrarArray(array);

        array = Arrays.copyOf(array, array.length + 1);
        array[3] = null;

        System.out.println("Con el método estático nullsFirst(<comparador>) obtenemos un comparador que");
        System.out.println("tenga en cuenta los valores null y los muestre al principio:");
        Arrays.sort(array, Comparator.nullsFirst(comparadorPorNombre));

        mostrarArray(array);

        System.out.println("Con el método estático nullsLast(<comparador>) obtenemos un comparador que");
        System.out.println("tenga en cuenta los valores null y los muestre al final:");
        Arrays.sort(array, Comparator.nullsLast(comparadorPorNombre));

        mostrarArray(array);
    }

    static void mostrarArray(MiClase[] array) {
        for(MiClase objeto : array) {
            System.out.println(objeto);
        }
        System.out.println();
    }
}

class MiClase {
    String name;
    Integer edad;

    MiClase(String name, Integer edad) {
        this.name = name;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}

class MiClaseComparatorNombre implements Comparator<MiClase> {

    @Override
    public int compare(MiClase o1, MiClase o2) {
        return o1.name.compareTo(o2.name);
    }
}

class MiClaseComparatorEdad implements Comparator<MiClase> {

    @Override
    public int compare(MiClase o1, MiClase o2) {
        return o1.edad.compareTo(o2.edad);
    }
}