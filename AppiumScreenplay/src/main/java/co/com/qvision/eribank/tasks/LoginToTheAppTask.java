package co.com.qvision.eribank.tasks;

import co.com.qvision.eribank.models.LoginModel;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.qvision.eribank.user_interface.LoginPageUserInterface.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginToTheAppTask implements Task {

    LoginModel loginModel;

    public LoginToTheAppTask(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.remember("dato", loginModel);
        //Serenity.setSessionVariable("dato").to(loginModel);
        actor.attemptsTo(
                Enter.keyValues(loginModel.getUserName()).into(NAME_USER),
                Enter.keyValues(loginModel.getUserPassword()).into(PASS_USER),
                Click.on(BUTTON_LOGIN)
        );
    }

    public static LoginToTheAppTask loginToTheAppTask(LoginModel loginModel) {
        return instrumented(LoginToTheAppTask.class, loginModel);
    }
}
