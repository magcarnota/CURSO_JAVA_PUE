package logging;

import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Clase para testing de clase Logger de java.util.logging
 * es parte del módulo java.logging
 * Una buena práctica es poner de nombre al logger el nombre
 * junto con el paquete de la clase en la que se encuentra.
 * @author magcarnota
 */
public class TestLogger {
    private static Logger miLogger = Logger.getLogger(logging.TestLogger.class.getName());

    public static void main(String[] args) {
        miLogger.log(Level.SEVERE, "Entrada de log nivel SEVERE (GRAVE)");
        miLogger.log(Level.WARNING, "Entrada de log nivel WARNING (ADVERTENCIA)");

        miLogger.info("Entrada de log nivel INFO (INFORMACIÓN)");

        miLogger.setLevel(Level.FINE);  // Marcamos el nivel a partir del que se registrarán entradas de log

        miLogger.finer("Este mensaje no se mostrará ya que es de un nivel inferior al configurado");

        miLogger.setLevel(Level.ALL);

        miLogger.info("Este mensaje si que se mostrará");

        getLoggers();
    }

    private static void getLoggers() {
        LogManager logManager = LogManager.getLogManager();

        Enumeration<String> loggers = logManager.getLoggerNames();

        while(loggers.hasMoreElements()) {
            String loggerName = loggers.nextElement();
            System.out.println(Logger.getLogger(loggerName).getName());
        }
    }
}
