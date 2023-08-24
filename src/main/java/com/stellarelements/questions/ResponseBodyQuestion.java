package com.stellarelements.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

public class ResponseBodyQuestion implements Question<String> {

    public static Question<String> was(){
        return new ResponseBodyQuestion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return LastResponse.received().answeredBy(actor).jsonPath().getString("products");
    }
}
