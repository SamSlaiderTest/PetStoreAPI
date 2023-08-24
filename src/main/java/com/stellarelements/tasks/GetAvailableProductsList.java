package com.stellarelements.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetAvailableProductsList implements Task {

    public static Performable fromTheApi(){
        return Tasks.instrumented(GetAvailableProductsList.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource("/productsList")
        );
    }
}
