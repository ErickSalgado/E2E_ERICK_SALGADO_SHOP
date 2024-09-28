package com.nttdata.glue;

import com.nttdata.tasks.CatalogPage;
import com.nttdata.tasks.CheckoutPage;
import com.nttdata.tasks.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;

public class ShopGlue {

    @CastMember(name = "erick")
    Actor erick;

    @Given("Inicio sesion$")
    public void login() {
        erick.attemptsTo(
                LoginPage.login("standard_user", "secret_sauce")
        );
    }

    @Given("Selecciono dos productos del catalogo")
    public void selectProducts() {
        erick.attemptsTo(
                CatalogPage.addProduct("#add-to-cart-sauce-labs-backpack"),
                CatalogPage.addProduct("#add-to-cart-sauce-labs-fleece-jacket")
        );
    }

    @Then("Ingreso al carrito de compras")
    public void visitCart() {
        erick.attemptsTo(
                CatalogPage.visitCart()
        );
    }

    @And("Completo el formulario de compra")
    public void completeShopForm() {
        erick.attemptsTo(
                CatalogPage.openCheckout(),
                CheckoutPage.completeCheckout("Erick", "Salgado", "170404")
        );
    }

    @And("Finalizo la compra")
    public void finishShop() {
        erick.attemptsTo(
                CheckoutPage.finishCheckout()
        );

    }
}
