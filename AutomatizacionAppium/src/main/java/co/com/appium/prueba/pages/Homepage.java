package co.com.appium.prueba.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Homepage  {

    AppiumDriver<MobileElement> driver;

    public Homepage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    // -------------------- Elementos Interface login ---------------------- //
/*
    @FindBy(id = "")
    WebElement primerValor;

    @FindBy(id = "")
    WebElement SegundoValor;

    @FindBy(id = "")
    WebElement operador;

    @FindBy(id = "")
    WebElement resultado;
*/

    @AndroidFindBy(id="com.experitest.ExperiBank:id/usernameTextField") // Campo ingreso nombre usuario
    WebElement usernameText;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/passwordTextField") // Campo ingreso contraseña usuario
    WebElement passwordText;

    @AndroidFindBy(id="com.experitest.ExperiBank:id/loginButton") // Boton Login
    WebElement buttonLogin;

    // ---------------- Elementos Interface menu principal ------------------//

    @AndroidFindBy(id="com.experitest.ExperiBank:id/makePaymentButton") // Boton Make Payment
    WebElement buttonMakePayment;


    // ------------------ METODOS -------------------- //

    public void inputDataLogin() {
        usernameText.sendKeys("company");
        passwordText.sendKeys("company");
    }

    public void clickButtonLogin() {
        buttonLogin.click();
    }

    public Boolean validateResult() {
        return buttonMakePayment.isDisplayed();
    }
}
