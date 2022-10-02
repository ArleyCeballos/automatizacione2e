package com.arley.automatizacion.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://demoblaze.com/")
public class Demoblazehomepage extends PageObject {
    public static final Target MENU_LOG_IN = Target.the("log in menu").located(By.id("login2"));
}
