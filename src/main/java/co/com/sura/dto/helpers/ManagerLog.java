package co.com.sura.dto.helpers;

import java.util.logging.Logger;

public class ManagerLog {
    static Logger logger = Logger.getLogger("MyLog");
    private ManagerLog(){
    }

    public static void imprimirMensaje(String mensaje) {
        logger.info(mensaje);

    }

    public static void imprimirFallo(String mensaje) {
        logger.info(mensaje);
    }


    public static void imprimirExito(String mensaje) {
        logger.info(mensaje);
    }

    public static void imprimirExito(String mensaje, boolean isQuality) {
        if (isQuality) {
            imprimirExito(mensaje + " QC exitoso");
        } else {
            imprimirExito(mensaje);
        }
    }

}
