package interfaces.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Clase para testing de interfaz Comparator<T>
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
    }

    static void mostrarArray(MiClase[] array) {
        for(MiClase objeto : array) {
            System.out.println(objeto);
        }
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