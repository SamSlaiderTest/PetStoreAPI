package com.stellarelements.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

public class ResponseTimeQuestion implements Question {

    public static ResponseTimeQuestion was(){
        return new ResponseTimeQuestion();
    }
    @Override
    public Long answeredBy(Actor actor) {
        return LastResponse.received().answeredBy(actor).getTime();
    }
}
