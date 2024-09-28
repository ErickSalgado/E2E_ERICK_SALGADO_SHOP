package com.nttdata.tasks;

import com.nttdata.userinterfaces.CheckoutPageInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class CheckoutPage {
    public static Task completeCheckout(String firstName, String lastName, String postalCode) {
        return Task.where(
                Enter.theValue(firstName).into(CheckoutPageInterface.INP_FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutPageInterface.INP_LAST_NAME),
                Enter.theValue(postalCode).into(CheckoutPageInterface.INP_POSTAL_CODE),
                Click.on(CheckoutPageInterface.BTN_CONTINUE)
        );
    }

    public static Task finishCheckout() {
        String msjCompleteOrder = "Thank you for your order!";
        return Task.where(
                Ensure.that(CheckoutPageInterface.LBL_TOTAL).text().isEqualTo("Total: $86.38"),
                Click.on(CheckoutPageInterface.BTN_FINISH),
                Ensure.that(CheckoutPageInterface.LBL_COMPLETE_ORDER).text().isEqualTo(msjCompleteOrder)
        );
    }
}
