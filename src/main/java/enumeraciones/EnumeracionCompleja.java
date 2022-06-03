package enumeraciones;

/**
 * Enumeración compleja
 * @author magcarnota
 */
public enum EnumeracionCompleja {
    PRIMERO("Medalla de Oro", 1000),
    SEGUNDO("Medalla de Plata", 500),
    TERCERO("Medalla de Bronce", 250),
    OTRO("Sin medalla", 0);

    private String medalla;
    private int premio;

    public static String msg = "Variable estática del enum";

    EnumeracionCompleja(String medalla, int premio) {
        this.medalla = medalla;
        this.premio = premio;
    }

    public String getMedalla() {
        return medalla;
    }
    public int getPremio() {
        return premio;
    }

    public static void metodo() {
        System.out.println("En método estático");
    }
}
