package variables;

/**
 * Modificadores de acceso public, protected, *por defecto* y private
 * y cómo afectan a la visibilidad de las variables desde otras clases
 */
public class VisibilidadVariables {
    public String variablePublica = "Visible por todos!";
    protected String variableProtegida = "Visible por clases del mismo paquete y subclases!";
    String variablePorDefecto = "Visible por clases del mismo paquete!";
    private String variablePrivada = "Visible sólo por los objetos de la misma clase!";

    public static void main(String[] args) {
        ClaseHija objetoClaseHija = new ClaseHija();

        System.out.println("Variables a las que puedo acceder desde el objeto objetoClaseHija:");
        System.out.println("variablePublica: " + objetoClaseHija.variablePublica);
        System.out.println("variableProtegida: " + objetoClaseHija.variableProtegida);
        System.out.println("variablePorDefecto: " + objetoClaseHija.variablePorDefecto);

        System.out.println("----------------------------------------------------------------------------------");

        VisibilidadVariables objetoClaseVisibilidadVariables = new VisibilidadVariables();
        System.out.println("Variables a las que puedo acceder desde el objeto objetoClaseVisibilidadVariables:");
        System.out.println("variablePublica: " + objetoClaseVisibilidadVariables.variablePublica);
        System.out.println("variableProtegida: " + objetoClaseVisibilidadVariables.variableProtegida);
        System.out.println("variablePorDefecto: " + objetoClaseVisibilidadVariables.variablePorDefecto);
        System.out.println("variablePrivada: " + objetoClaseVisibilidadVariables.variablePrivada);

    }
}

/**
 * Clase creada para pruebas
 */
class ClaseHija extends VisibilidadVariables {

}
