package excepciones;

import java.io.*;

/**
 * Clase para testing de bloque try-with-parameters
 * Sólo para aquellas clases que implementen el interfaz AutoCloseable.
 * Se pueden inicializar varias a la vez.
 * @author magcarnota
 */
public class AutoCerrables {
    public static void main(String[] args) throws Exception {
        final String ARCHIVO = "archivoInexistente.txt";

        // Método tradicional sin try-with-parameters
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new FileReader(ARCHIVO));
            out = new PrintWriter(new FileWriter(ARCHIVO));
            String linea = in.readLine();
            out.println(linea);
        } catch (FileNotFoundException ex) {    // Lanzada por FileReader
            System.out.println("No se ha encontrado el archivo!");
        } catch (IOException ex) {              // Lanzada por FileWriter
            System.out.println(ex.getClass().getSimpleName());
        } finally { // Cerramos los posibles recursos que hayan podido quedar abiertos
            if(null != in) in.close();
            if(null != out) out.close();
        }


        // Método usando try-with-parameters
        // NO ES NECESARIO CERRAR LOS RECURSOS. YA LOS CIERRA SOLO.
        try(BufferedReader in2 = new BufferedReader(new FileReader("noExiste.txt"));
            PrintWriter out2 = new PrintWriter(new FileWriter("noExiste.txt"))) {
                String linea = in2.readLine();
                out2.println();
        } catch (FileNotFoundException ex) {    // Lanzada por FileReader
            System.out.println("No se ha encontrado el archivo!");
        } catch (IOException ex) {              // Lanzada por FileWriter
            System.out.println(ex.getClass().getSimpleName());
        }

    }

}
