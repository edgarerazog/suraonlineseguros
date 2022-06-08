package co.com.sura.dto.tasks;

import co.com.sura.dto.userinterface.ButtonBuy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sura.dto.userinterface.ButtonBuy.CLICK_BUTTONBUY;

public class Click_Buy implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_BUTTONBUY));
    }
    public static Click_Buy click_buy(){return Tasks.instrumented(Click_Buy.class); }
}
