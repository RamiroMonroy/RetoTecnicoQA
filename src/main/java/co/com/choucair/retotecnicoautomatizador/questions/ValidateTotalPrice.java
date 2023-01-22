package co.com.choucair.retotecnicoautomatizador.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.retotecnicoautomatizador.userinterfaces.ShoppingCar.TOTAL_PRICE_PRODUCT;
import static co.com.choucair.retotecnicoautomatizador.util.Constants.AMOUNT_CATEGORY;

public class ValidateTotalPrice implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String priceText;
        int sumPrice, totalPrice = 0, amount, priceProduct, totalPriceCar = 0;
        for (int i = 0; i < AMOUNT_CATEGORY; i++) {
            priceText = (actor.recall("price" + i));
            priceProduct = Integer.valueOf(priceText.replace("$", "").replace(".", "").replace(" ", ""));
            amount = (actor.recall("amountProduct" + i));
            sumPrice = priceProduct * (amount + 1);
            totalPrice = totalPrice + sumPrice;
            totalPriceCar = Integer.valueOf(TOTAL_PRICE_PRODUCT.of(String.valueOf(i + 2)).resolveFor(actor).getText()
                    .replace("$", "").replace(".", "").replace(" ", ""));

        }

        return totalPrice == totalPriceCar;
    }

    public static ValidateTotalPrice validate() {
        return new ValidateTotalPrice();
    }
}
