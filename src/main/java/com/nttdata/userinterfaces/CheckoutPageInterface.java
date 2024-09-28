package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class CheckoutPageInterface {
    public static final Target INP_FIRST_NAME = Target.the("Input First Name").located(By.id("first-name"));
    public static final Target INP_LAST_NAME = Target.the("Input Last Name").located(By.id("last-name"));
    public static final Target INP_POSTAL_CODE = Target.the("Input Postal Code").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Button Continue").located(By.id("continue"));
    public static final Target LBL_TOTAL = PageElement.withNameOrId("total-label");
    public static final Target BTN_FINISH = Target.the("Button Finish").located(By.id("finish"));
    public static final Target LBL_COMPLETE_ORDER = PageElement.withNameOrId("complete-header");
}
