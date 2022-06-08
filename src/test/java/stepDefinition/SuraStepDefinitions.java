package stepDefinition;

import co.com.sura.dto.tasks.Click_Buy;
import co.com.sura.dto.tasks.OpenWebPageBuy;
import co.com.sura.dto.tasks.PersonalInformation;
import co.com.sura.dto.userinterface.ButtonBuy;
import co.com.sura.dto.util.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SuraStepDefinitions {

    @Before
    public void setUp() { OnStage.setTheStage(new OnlineCast()); }

    @Given("el cliente ingresa a la pagina web para realizar la compra del seguro de vida")
    public void elClienteIngresaALaPaginaWebParaRealizarLaCompraDelSeguroDeVida() {
        theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebPageBuy.openWebPageBuy());
        theActorCalled(Constants.ACTOR).wasAbleTo(Click_Buy.click_buy());


    }
    @When("diligencia completamente el formulario de compra con los datos personales y responde preguntas obligatorias")
    public void diligenciaCompletamenteElFormularioDeCompraConLosDatosPersonalesYRespondePreguntasObligatorias() {
        theActorCalled(Constants.ACTOR).attemptsTo(PersonalInformation.FillintheRequestedData());

    }
    @Then("el cliente realiza la compra del producto de manera exitosa")
    public void elClienteRealizaLaCompraDelProductoDeManeraExitosa() {

    }
}
