package co.com.choucair.retotecnicoautomatizador.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class ShoppingCar {
    public static final Target ADD=Target.the("add").locatedBy("//span[contains(text(),'Agregar')]");
    public static final Target SCROLL=Target.the("scroll").locatedBy("//h1[@class='vtex-store-components-3-x-productNameContainer mv0 t-heading-4']");
    public static final Target AMOUNT=Target.the("amount").locatedBy("//button[@class='exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus']");
    public static final Target SHOPPING_CAR=Target.the("shopping_car").locatedBy("//div[@class='exito-header-3-x-minicartQuantity']");
    public static final Target NAME_PRODUCT=Target.the("name_product").locatedBy("//table[@class='table cart-items']/tbody/tr[{0}]/td[2]/a");
    public static final Target TOTAL_PRICE_PRODUCT=Target.the("total_prince_product").locatedBy("//td[@class='monetary exito-checkout-monetary']");

}
