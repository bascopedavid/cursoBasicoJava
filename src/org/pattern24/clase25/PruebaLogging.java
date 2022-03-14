package org.pattern24.clase25;

import org.pattern24.clase20.Bebida;
import org.pattern24.clase20.Producto;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaLogging {
    //Java logging API
    static {
        String path = PruebaLogging.class.getClassLoader()
                .getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", path);
    }
    private static final Logger LOGGER = Logger.getLogger(PruebaLogging.class.getName());
    // niveles
//    SEVERE
//    WARNING
//    INFO
//    CONFIG
//    FINE
//    FINER
//    FINEST
    private static void muestraLog() {
        LOGGER.log(Level.WARNING, "Hola mundo.");
        LOGGER.logp(Level.SEVERE, PruebaLogging.class.getName(), "dummy", "Hola mundo.");
    }

    private static String getString() {
        System.out.println("getString()");
        return " fin del mensaje";
    }

    private static void logger(Level level, String msg) {
        if (LOGGER.isLoggable(level)) {
            LOGGER.log(level, msg.toLowerCase());
        }
    }

    public static void main (String[] args) {
//        LOGGER.setLevel(Level.INFO);
        System.out.println("Hola mundo.");
        LOGGER.log(Level.INFO, "Hola mundo.");
        muestraLog();
        LOGGER.logrb(Level.INFO, ResourceBundle.getBundle("mensajes", Locale.forLanguageTag("fr-FR")), "saludo", "David");
        LOGGER.finest("bienvenido" + getString());
        Producto x = new Bebida();
//        LOGGER.finest(x.getNombre().toLowerCase());
        logger(Level.FINEST, x.getNombre());
        System.out.println("level:" + LOGGER.getLevel());
//        if (x != null) {
//            LOGGER.info(x.getNombre().toLowerCase());
//        }
    }
}
