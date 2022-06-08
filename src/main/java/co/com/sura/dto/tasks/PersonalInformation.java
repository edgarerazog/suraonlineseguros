package co.com.sura.dto.tasks;

import co.com.sura.dto.util.Constants;
import com.github.javafaker.Faker;
import io.cucumber.java.eo.Se;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import lombok.SneakyThrows;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.rest.Ensure;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValues;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.support.ui.ISelect;
import co.com.sura.dto.helpers.Utils;

import java.util.Locale;
import java.util.Random;

import static co.com.sura.dto.userinterface.InformationPersonal.*;

public class PersonalInformation implements Task {

    private static Faker faker = Faker.instance(new Locale("es", "CO"), new Random());

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(faker.name().firstName()).into(INPUT_NAMES));
        actor.attemptsTo(Enter.theValue(faker.name().lastName()).into(INPUT_LASTNAME));
        String TipoID;
        if (Utils.obtenerTipoDocumento(Utils.obtenerNumeroRandomParaTipoDocGeneroYPreguntas()) == "CE"){
            TipoID = "Cédula de extranjería";
        }else {
            TipoID = "Cédula de ciudadanía";
        }
        actor.attemptsTo(SelectFromOptions.byVisibleText(TipoID).from(DROWNLIST_DOCUMENT_TYPE));
        //actor.attemptsTo(Click.on(DROWNLIST_DOCUMENT_TYPE));
        //actor.attemptsTo(Click.on(SELECT_DOCUMENT_TYPE));
        actor.attemptsTo(Enter.theValue(Constants.PRIMER_DIGITO+faker.number().digits(Constants.DIGITO_NUEVE)).into(INPUT_DOCUMENT_NUMBER));

    }

        public static Performable FillintheRequestedData(){
            return Tasks.instrumented(PersonalInformation.class);

        }
}
