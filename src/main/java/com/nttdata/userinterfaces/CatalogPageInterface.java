package com.nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Link;
import org.openqa.selenium.By;

public class CatalogPageInterface {
    public static final Target LINK_CART = Link.withNameOrId("shopping-cart-link");
    public static final Target BTN_CHECKOUT = Target.the("Button Checkout").located(By.id("checkout"));
}