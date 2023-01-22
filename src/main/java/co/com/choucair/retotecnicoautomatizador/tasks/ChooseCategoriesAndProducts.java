package co.com.choucair.retotecnicoautomatizador.tasks;

import co.com.choucair.retotecnicoautomatizador.util.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.time.Duration;

import static co.com.choucair.retotecnicoautomatizador.userinterfaces.Main.*;
import static co.com.choucair.retotecnicoautomatizador.userinterfaces.Products.*;
import static co.com.choucair.retotecnicoautomatizador.userinterfaces.ShoppingCar.*;
import static co.com.choucair.retotecnicoautomatizador.util.Constants.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseCategoriesAndProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (int x = 0; x < AMOUNT_CATEGORY; x++) {
            int product = (int) (Math.random() * 5 + 1);
            int amountProduct = (int) (Math.random() * 9 + 1);
            actor.attemptsTo(Click.on(CATEGORY_MENU),
                    (Click.on(LIST_CATEGORY.of(String.valueOf((int) (Math.random() * 6 + 1))))),
                    (Click.on(SUB_CATEGORY.of(String.valueOf((int) (Math.random() * 6 + 1))))));
            actor.remember("product" + x, PRODUCTS_TEXT.of(String.valueOf(product)).resolveFor(actor).getText());
            actor.attemptsTo(Click.on(PRODUCTS_MENU.of(String.valueOf(product))),
                    (WaitUntil.the(SCROLL, isVisible()).forNoMoreThan(CONSTANTS_TIME).seconds()),
                    (Scroll.to(SCROLL)), (Click.on(ADD)));
            actor.remember("price" + x, PRICE_PRODUCTS.resolveFor(actor).getText());
            actor.remember("amountProduct" + x, amountProduct);
            for (int i = 0; i < amountProduct; i++) {
                actor.attemptsTo(Click.on(AMOUNT));
            }
            Wait.stopExecution(STOP_TIME);
        }
        actor.attemptsTo(WaitUntil.the(SHOPPING_CAR, isVisible()).forNoMoreThan(CONSTANTS_TIME).seconds(),
                Click.on(SHOPPING_CAR));
    }

    public static ChooseCategoriesAndProducts choose() {
        return Tasks.instrumented(ChooseCategoriesAndProducts.class);
    }
}
