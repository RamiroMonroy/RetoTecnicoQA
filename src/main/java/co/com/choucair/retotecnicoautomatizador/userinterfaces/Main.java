package co.com.choucair.retotecnicoautomatizador.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Main {
    public static final Target CATEGORY_MENU= Target.the("category_menu").located(By.id("category-menu"));
    public static final Target LIST_CATEGORY= Target.the("list_category").locatedBy("//div[@class='exito-category-menu-3-x-categoryList']/ul/li[{0}]");
    public static final Target SUB_CATEGORY= Target.the("sub_category").locatedBy("//section[@class='exito-category-menu-3-x-contentSideMenu']/div/div[2]/div/div/a[{0}]");
}
