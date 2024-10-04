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

    @Given("^Inicio sesion (.*) (.*)$")
    public void login(String username, String password) {
        erick.attemptsTo(
                LoginPage.login(username, password)
        );
    }

    @Given("^Selecciono dos productos del catalogo (.*) (.*)$")
    public void selectProducts(String product1, String product2) {
        erick.attemptsTo(
                CatalogPage.addProduct(product1),
                CatalogPage.addProduct(product2)
        );
    }

    @Then("Ingreso al carrito de compras$")
    public void visitCart() {
        erick.attemptsTo(
                CatalogPage.visitCart()
        );
    }

    @And("^Completo el formulario de compra con (.*) (.*) (.*)$")
    public void completeShopForm(String firstName, String lastName, String postalCode) {
        erick.attemptsTo(
                CatalogPage.openCheckout(),
                CheckoutPage.completeCheckout(firstName, lastName, postalCode)
        );
    }

    @And("Finalizo la compra$")
    public void finishShop() {
        erick.attemptsTo(
                CheckoutPage.finishCheckout()
        );

    }
}
