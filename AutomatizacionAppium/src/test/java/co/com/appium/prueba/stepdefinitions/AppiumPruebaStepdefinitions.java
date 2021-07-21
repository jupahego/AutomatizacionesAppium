package co.com.appium.prueba.stepdefinitions;

import co.com.appium.prueba.steps.HomePageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppiumPruebaStepdefinitions {

    @Steps
    HomePageStep stepsAppium;

    @Given("I want log in to the application")
    public void iWantLogInToTheApplication() {
        stepsAppium.openDriverAppium();
    }

    @When("I enter the username and password")
    public void iEnterTheUsernameAndPassword() {
        stepsAppium.enterTheDataAccountValid();
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        stepsAppium.enterLogin();
    }

    @Then("I verify that the login is successful")
    public void iVerifyThatTheLoginIsSuccessful() {
        stepsAppium.validationLogin();
    }
}
