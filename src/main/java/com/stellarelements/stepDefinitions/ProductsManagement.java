package com.stellarelements.stepDefinitions;

import com.stellarelements.questions.ResponseBodyQuestion;
import com.stellarelements.questions.ResponseCodeQuestion;
import com.stellarelements.questions.ResponseTimeQuestion;
import com.stellarelements.tasks.GetAvailableProductsList;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class ProductsManagement {

    private final String BASE_URL = "https://automationexercise.com/api";

    Actor marcos;

    @Given("Marcos wants to view a list of products")
    public void marcosWantsToViewAListOfProducts() {
        marcos = Actor.named("Marcos").whoCan(CallAnApi.at(BASE_URL));
    }

    @When("he accesses the product list")
    public void heAccessesTheProductList() {
        marcos.attemptsTo(GetAvailableProductsList.fromTheApi());
    }

    @Then("he should see a complete list of available products")
    public void heShouldSeeACompleteListOfAvailableProducts() {
        marcos.should(
                seeThat("the response status", ResponseCodeQuestion.was(), equalTo(200)),
                seeThat("the response time", ResponseTimeQuestion.was(), lessThan(1300L)),
                seeThat("products in the response", ResponseBodyQuestion.was(), is(not(isEmptyOrNullString())))

        );
    }
}
