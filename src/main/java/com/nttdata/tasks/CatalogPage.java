package com.nttdata.tasks;

import com.nttdata.userinterfaces.CatalogPageInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CatalogPage {
    public static Task addProduct(String selectorProduct) {
        return Task.where(
                Click.on(selectorProduct)
        );
    }

    public static Task visitCart() {
        return Task.where(
                Click.on(CatalogPageInterface.LINK_CART)
        );
    }

    public static Task openCheckout() {
        return Task.where(
                Click.on(CatalogPageInterface.BTN_CHECKOUT)
        );
    }
}
