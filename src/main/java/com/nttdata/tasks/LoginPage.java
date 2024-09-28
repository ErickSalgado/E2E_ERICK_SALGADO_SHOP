package com.nttdata.tasks;

import com.nttdata.userinterfaces.LoginPageInterface;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LoginPage {

    public static Task login(String username, String password) {
        return Task.where(
                Open.url("https://www.saucedemo.com/"),
                Enter.theValue(username).into(LoginPageInterface.INP_USERNAME),
                Enter.theValue(password).into(LoginPageInterface.INP_PASSWORD),
                Click.on(LoginPageInterface.BTN_LOGIN)
        );
    }

}
