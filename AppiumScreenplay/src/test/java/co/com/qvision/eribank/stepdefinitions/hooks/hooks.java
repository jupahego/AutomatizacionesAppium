package co.com.qvision.eribank.stepdefinitions.hooks;


import co.com.qvision.eribank.models.LoginModel;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

public class hooks {

    @Before
    public void abrirNavegador() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("mateo");
        //OnStage.theActorInTheSpotlight().attemptsTo(Open.url("http://127.0.0.1:4723/wd/hub"));
    }

    @DataTableType
    public LoginModel loginModel(Map<String, String> dato) {
        return new LoginModel(dato.get("userName"), dato.get("userPassword"));
    }





}
