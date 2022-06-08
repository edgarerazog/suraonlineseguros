package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/feature/sura.feature"}
        , glue = {"stepDefinition"}
        , tags = "@Compra"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class RunnerProcesoDeCompraSura {
}
