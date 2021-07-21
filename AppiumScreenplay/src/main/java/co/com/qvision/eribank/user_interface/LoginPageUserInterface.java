package co.com.qvision.eribank.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageUserInterface {

    public static final Target NAME_USER = Target.the("Input text user name").
            located(By.id("com.experitest.ExperiBank:id/usernameTextField"));

    public static final Target PASS_USER = Target.the("Input text user password ").
            located(By.id("com.experitest.ExperiBank:id/passwordTextField"));

    public static final Target BUTTON_LOGIN = Target.the("Login Button").
            located(By.id("com.experitest.ExperiBank:id/loginButton"));

    public static final Target BUTTON_MAKE_PAYMENT = Target.the("Payment Button").
            located(By.id("com.experitest.ExperiBank:id/makePaymentButton"));




}
