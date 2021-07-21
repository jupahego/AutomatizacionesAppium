package co.com.qvision.eribank.questions;

import co.com.qvision.eribank.user_interface.LoginPageUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class HomePageQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPageUserInterface.BUTTON_MAKE_PAYMENT.resolveFor(actor).isVisible();
    }

    public static HomePageQuestion homePageQuestion(){
        return new HomePageQuestion();
    }
}
