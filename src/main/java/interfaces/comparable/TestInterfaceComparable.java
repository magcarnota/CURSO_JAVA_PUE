package interfaces.comparable;

import java.util.Arrays;

/**
 * Clase para testing de Interface Comparable<T>
 * @author magcarnota
 */
public class TestInterfaceComparable {
    public static void main(String[] args) {
        System.out.println("Creamos varios objetos con atributo String:");
        MiClase objeto1 = new MiClase("Juan", 23);
        MiClase objeto2 = new MiClase("Pedro", 20);
        MiClase objeto3 = new MiClase("Ana", 41);

        MiClase[] array = {objeto1, objeto2, objeto3};

        System.out.println("Mostramos el contenido inicial del array:");
        mostrarArray(array);

        System.out.println("Ordenamos el array (por nombre):");
        Arrays.sort(array);

        System.out.println("Mostramos el contenido del array ordenado (usa el método compareTo para ordenar):");
        mostrarArray(array);

        System.out.println("Cambiamos el criterio de ordenación de cada uno de los objetos para ordenar por edad:");
        for(MiClase objeto : array) {
            objeto.ordenaPor(CriterioOrdenacion.EDAD);
        }

        System.out.println("Ordenamos el array (ahora por edad):");
        Arrays.sort(array);

        System.out.println("Mostramos el contenido del array:");
        mostrarArray(array);

    }

    static void mostrarArray(MiClase[] array) {
        for(MiClase objeto : array) {
            System.out.println(objeto);
        }
    }
}

enum CriterioOrdenacion {NOMBRE, EDAD};

class MiClase implements Comparable<MiClase> {
    String nombre;
    Integer edad;
    CriterioOrdenacion criterio = CriterioOrdenacion.NOMBRE;    // Criterio de ordenación por defecto

    MiClase(String name, int edad) {
        this.nombre = name;
        this.edad = edad;
    }

    public void ordenaPor(CriterioOrdenacion criterio) {
        this.criterio = criterio;
    }

    @Override
    public int compareTo(MiClase o) {
        if(criterio.equals(CriterioOrdenacion.NOMBRE)) {
            return this.nombre.compareTo(o.nombre);
        } else {
            return this.edad.compareTo(o.edad);
        }
    }

    @Override
    public String toString() {
        return "MiClase{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", criterio=" + criterio +
                '}';
    }
}

