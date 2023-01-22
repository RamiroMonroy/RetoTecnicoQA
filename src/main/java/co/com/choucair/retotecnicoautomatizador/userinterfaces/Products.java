package co.com.choucair.retotecnicoautomatizador.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class Products {
    public static final Target PRODUCTS_MENU= Target.the("products_menu").locatedBy("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--search-result-web']/div/div/div/div[{0}]");
    public static final Target PRODUCTS_TEXT= Target.the("products_text").locatedBy("//div[@class='vtex-flex-layout-0-x-flexRow vtex-flex-layout-0-x-flexRow--search-result-web']/div/div/div/div[{0}]/section/a/article/div[2]/div[2]/div/div/div/div/div/div/div[3]/div/div/div/h3/span");
    public static final Target PRICE_PRODUCTS= Target.the("price_products").locatedBy("//div[@class='false bg-base w-100']/div/div[2]/div/span");
    }
