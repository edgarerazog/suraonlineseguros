package co.com.sura.dto.userinterface;

import co.com.sura.dto.helpers.Utils;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.By;

public class InformationPersonal extends PageObject {
    public static final Target INPUT_NAMES = Target.the("ingresa sus nombre completos").located(By.xpath("//input[@id='nombres']"));
    public static final Target INPUT_LASTNAME = Target.the("ingresa sus apellidos completos").located(By.xpath("//input[@id='apellidos']"));
    public static final Target DROWNLIST_DOCUMENT_TYPE = Target.the("despliega la lista de tipos de documentos").located(By.xpath("//select[@id='tipo-documento']"));
    //public static final Target SELECT_DOCUMENT_TYPE = Target.the("selecciona un tipo de documento").located(By.xpath("//*[@id='tipo-documento']//option[@value='" + Utils.obtenerTipoDocumento(Utils.obtenerNumeroRandomParaTipoDocGeneroYPreguntas()) + "']"));
    public static final Target INPUT_DOCUMENT_NUMBER= Target.the("ingresa su numero de documento").located(By.xpath("//input[@id='numero-documento']"));

}
