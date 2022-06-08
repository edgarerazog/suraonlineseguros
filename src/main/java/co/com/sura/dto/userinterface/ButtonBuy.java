package co.com.sura.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonBuy extends PageObject {

    public static final Target CLICK_BUTTONBUY = Target.the("button buy")
            .located(By.xpath("//li//button[contains(text(),'COMPRAR')]"));
}
