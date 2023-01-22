package co.com.choucair.retotecnicoautomatizador.stepdefinitions;

import co.com.choucair.retotecnicoautomatizador.interaction.OpenBrowser;
import co.com.choucair.retotecnicoautomatizador.model.MainPage;
import co.com.choucair.retotecnicoautomatizador.questions.ValidateName;
import co.com.choucair.retotecnicoautomatizador.questions.ValidateTotalPrice;
import co.com.choucair.retotecnicoautomatizador.tasks.ChooseCategoriesAndProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.choucair.retotecnicoautomatizador.util.Constants.ACTOR;

public class MyDefinitions {

    MainPage mainPage;

    @Before
    public void startstage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }

    @Given("^that the user is on the web page$")
    public void thatTheUserIsOnTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.on(mainPage));
    }

    @When("^choose five products at random each product has random quantities between one and ten$")
    public void chooseFiveProductsAtRandomEachProductHasRandomQuantitiesBetweenOneAndTen() {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseCategoriesAndProducts.choose());
    }

    @Then("^the name of the added products are the same as in the shopping cart$")
    public void theNameOfTheAddedProductsAreTheSameAsInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateName.validate()));
    }

    @Then("^the price of the added products are the same as in the shopping cart$")
    public void thePriceOfTheAddedProductsAreTheSameAsInTheShoppingCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateTotalPrice.validate()));
    }


}
