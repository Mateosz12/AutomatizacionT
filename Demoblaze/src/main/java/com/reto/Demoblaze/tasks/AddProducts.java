package com.reto.Demoblaze.tasks;

import com.reto.Demoblaze.interactions.AddUpPrices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;


import static com.reto.Demoblaze.userinterfaces.HomePage.*;
import static com.reto.Demoblaze.utils.Constants.*;


public class AddProducts implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECT.of(PHONES_CATEGORY)),
                Click.on(SELECT.of(SAMSUNG_GALAXY_S6)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(PHONES_CATEGORY)),
                Click.on(SELECT.of(IPHONE_6_32GB)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(LAPTOPS_CATEGORY)),
                Click.on(SELECT.of(DELL_I7_8GB)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(LAPTOPS_CATEGORY)),
                Click.on(SELECT.of(MACBOOK_PRO)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(MONITORS_CATEGORY)),
                Click.on(SELECT.of(APPLE_MONITOR_24)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(SELECT.of(HOME_BTN)),
                Click.on(SELECT.of(MONITORS_CATEGORY)),
                Click.on(SELECT.of(ASUS_FULL_HD)),
                Click.on(ADD_TO_CART_BTN),

                JavaScriptClick.on(CART_BTN),
                AddUpPrices.sumOfProduct()
        );
    }

    public static AddProducts chooseProduct() {
        return Tasks.instrumented(AddProducts.class);
    }
}
