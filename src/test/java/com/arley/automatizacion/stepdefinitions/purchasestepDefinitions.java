package com.arley.automatizacion.stepdefinitions;

import com.arley.automatizacion.userinterface.Demoblazehomepage;
import com.arley.automatizacion.userinterface.Demoblazehomepage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.arley.automatizacion.userinterface.Demoblazehomepage.MENU_LOG_IN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class purchasestepDefinitions {
    private Demoblazehomepage homePage;


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
            }


    @Given("^(.*) is authenticated$")
    public void authenticade(String actorName) {
        theActorCalled(actorName).attemptsTo(
                Open.browserOn(homePage),
                Click.on(MENU_LOG_IN)
                //authenticadeWithUsername("admin").andPassword("*****")
        );
        throw new io.cucumber.java.PendingException();
    }

    @Given("add from (.*) [a-z]{1,2} (.*)$")
    public void addToCart(String category,String product) {
        theActorInTheSpotlight().wasAbleTo(

        );
        throw new io.cucumber.java.PendingException();
    }



    @When("^[a-zA-Z]{3,50} makes the purchase$")
    public void purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Juan should see the message Thank for your purchase")
    public void juan_should_see_the_message_thank_for_your_purchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
