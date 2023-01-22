package co.com.choucair.retotecnicoautomatizador.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions
        (features = "src\\test\\resources\\features\\reto.feature",
                glue = "co.com.choucair.retotecnicoautomatizador.stepdefinitions",
                snippets = SnippetType.CAMELCASE
        )

public class RunnerTags {
}
