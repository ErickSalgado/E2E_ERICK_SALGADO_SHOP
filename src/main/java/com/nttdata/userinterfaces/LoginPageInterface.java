package com.nttdata.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPageInterface {

    public static final Target INP_USERNAME = Target.the("Input Username").located(By.id("user-name"));
    public static final Target INP_PASSWORD = Target.the("Input Password").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Button Login").located(By.id("login-button"));

}
