package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.DataRegister;
import com.co.bonbonite.tasks.RegisterTask;
import com.co.bonbonite.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {

    @Managed
    WebDriver hisDriver;


    @Before
    public void setUp(){
    OnStage.setTheStage(Cast.ofStandardActors());
    OnStage.theActorCalled("Sara");
    OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));

    }


    @Given("^he user enters in the page$")
    public void heUserEntersInThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Constants.URL));
    }

    @When("^he user fills in the corresponding$")
    public void heUserFillsInTheCorresponding(List<DataRegister>dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enter(dataRegister));
    }

    @Then("^the account is successfully created$")
    public void theAccountIsSuccessfullyCreated() {

    }
}
