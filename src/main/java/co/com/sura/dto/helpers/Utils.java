package co.com.sura.dto.helpers;

import co.com.sura.dto.util.Constants;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

import static co.com.sura.dto.util.Constants.UNO;
import static org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.DOS;

public class Utils {
    private Utils() {
    }

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());
    private static final String MENSAJE_FALLO_GENERAL = "No se reconoce el numero para tomar alguna de las dos opciones ";

    public static int obtenerNumeroRandomParaTipoDocGeneroYPreguntas() {
        return faker.number().numberBetween(1, 3);

    }

    public static String obtenerTipoDocumento(int documentoNum) {
        String tipoDocumento;
        switch (documentoNum) {
            case 1:
                tipoDocumento = Constants.CEDULA_EXTRANGERIA;
                return tipoDocumento;
            case 2:
                tipoDocumento = Constants.CEDULA_CIUDADANIA;
                return tipoDocumento;
            default:
                ManagerLog.imprimirFallo(MENSAJE_FALLO_GENERAL);
                return null;
        }
    }
}