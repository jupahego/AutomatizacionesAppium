package co.com.qvision.eribank.stepdefinitions;

import co.com.qvision.eribank.models.LoginModel;
import co.com.qvision.eribank.questions.HomePageQuestion;
import co.com.qvision.eribank.tasks.LoginToTheAppTask;
import co.com.qvision.eribank.tasks.OpenAppTask;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


public class LoginUserStepdefinition {

    @Given("I like a user open the app")
    public void iLikeAUserOpenTheApp() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenAppTask.openAppTask()
        );
    }

    @When("he enters with valid user data")
    public void heEntersWithValidUserData(LoginModel loginModel) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginToTheAppTask.loginToTheAppTask(loginModel)
        );


    }

    @Then("he can see the main menu")
    public void heCanSeeTheMainMenu() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                HomePageQuestion.homePageQuestion()
                )
        );

    }

}
