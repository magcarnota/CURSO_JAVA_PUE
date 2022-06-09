package patrones.builder;

/**
 * Clase para testing de patrón Builder
 * @author magcarnota
 */
public class TestPatronBuilder {
    public static void main(String[] args) {
        System.out.println("Queremos construir un objeto de tipo Persona");
        System.out.println("Persona con valores por defecto:");
        Persona personaValoresPorDefecto;
        Persona.Constructor constructorDePersonas = new Persona.Constructor();
        personaValoresPorDefecto = constructorDePersonas.construir();
        System.out.println(personaValoresPorDefecto);

        System.out.println("------------------------------------------------------");

        System.out.println("Creamos un objeto tipo Persona pero solo indicando dirección y edad:");
        Persona personaSoloConDireccionEdad;
        personaSoloConDireccionEdad = constructorDePersonas
                .direccion("Dirección nueva")
                .edad(34)
                .construir();
        System.out.println(personaSoloConDireccionEdad);

        System.out.println("------------------------------------------------------");

        System.out.println("Creamos un objeto tipo Persona indicando todos los atributos:");
        Persona personaCompleta;
        personaCompleta = constructorDePersonas
                .nombre("Pepito")
                .direccion("Casa de Pepito")
                .edad(51)
                .construir();
        System.out.println(personaCompleta);
    }
}
