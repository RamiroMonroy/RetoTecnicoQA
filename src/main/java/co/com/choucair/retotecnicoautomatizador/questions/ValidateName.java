package co.com.choucair.retotecnicoautomatizador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retotecnicoautomatizador.userinterfaces.ShoppingCar.*;
import static co.com.choucair.retotecnicoautomatizador.util.Constants.AMOUNT_CATEGORY;

public class ValidateName implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        int adder = 0;
        for (int i = 0; i < AMOUNT_CATEGORY; i++) {
            if (NAME_PRODUCT.of(String.valueOf(i + 1)).resolveFor(actor).getText().equals(actor.recall("product" + i))) {
                adder++;
            }
        }
        return String.valueOf(adder).equals(String.valueOf(AMOUNT_CATEGORY));
    }

    public static ValidateName validate() {
        return new ValidateName();
    }
}
