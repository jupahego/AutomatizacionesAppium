package co.com.qvision.eribank.utils;

import co.com.qvision.eribank.exeptions.ExceptionMessages;
import co.com.qvision.eribank.exeptions.MyBussinessException;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyDriver {
    private static final Logger logger = Logger.getLogger(MyDriver.class.getName());
    private static AppiumDriver<MobileElement> driver;
    static String envPlatform = "ANDROID";
    public static Platformas plataforma = null;

    public static AppiumDriver<MobileElement> abrirApp() {
        if (envPlatform.contains("ANDROID")) {
            plataforma = Platformas.ANDROID;
        } else if (envPlatform.contains("IOS")) {
            plataforma = Platformas.IOS;
        }
        String url = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        switch (plataforma) {
            case IOS:
                try {
                    //String path = System.getProperty("user.dir")
                    //path = path + "/src/test/resources/app/appPrueba.iOS.ipa"
                    //capabilities.setCapability("app", path)
                    capabilities.setCapability("deviceName", "iPhone 8");
                    capabilities.setCapability("udid", "0202bba73adcc99fa654db813d43e6e52faa49bf");
                    capabilities.setCapability("platformVersion", "12.1");
                    capabilities.setCapability("platformName", "iOS");
                    capabilities.setCapability("automationName", "XCUITest");
                    capabilities.setCapability("bundleId", "co.com.prueba.canalesmoviles.ProbandoElMundo");
                    capabilities.setCapability("noReset", false);

                /*String kobitonServerUrl = "https://estivenm:a12ce76e-b733-4d8e-881e-572b924279d8@api.kobiton.com/wd/hub";
                capabilities.setCapability("sessionName", "Automation test session");
                capabilities.setCapability("sessionDescription", "");
                capabilities.setCapability("deviceOrientation", "portrait");
                capabilities.setCapability("captureScreenshots", true);
                capabilities.setCapability("app", "kobiton-store:26510");
                capabilities.setCapability("groupId", 444);
                capabilities.setCapability("deviceGroup", "KOBITON");
                capabilities.setCapability("deviceName", "iPhone 7");
                capabilities.setCapability("platformVersion", "12.1.2");
                capabilities.setCapability("platformName", "iOS"); */

                    driver = new AppiumDriver<MobileElement>(new URL(url), capabilities);
                    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                    return driver;
                } catch (Exception e) {
                    logger.log(Level.SEVERE, ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
                    throw new MyBussinessException(ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
                }
            case ANDROID:
                try {
                    capabilities.setCapability("deviceName", "emulator-5554"); //Nombre del dispositivo, en este caso del emulador
                    //capabilities.setCapability("udid", "J7AXHM001253GB7"); Se debe poner el ID del dispositivo si es uno REAL
                    capabilities.setCapability("platformVersion", "9.0");
                    capabilities.setCapability("platformName", "Android");
                    capabilities.setCapability("appPackage", "com.experitest.ExperiBank");
                    capabilities.setCapability("appActivity", "com.experitest.ExperiBank.LoginActivity");
                    capabilities.setCapability("noReset", true);


                    //com.android.calculator2
                    //com.android.calculator2.Calculator

		 		/*String kobitonServerUrl = "https://estivenm:a12ce76e-b733-4d8e-881e-572b924279d8@api.kobiton.com/wd/hub";
		 		capabilities.setCapability("sessionName", "Automation test session");
		 		capabilities.setCapability("sessionDescription", "");
		 		capabilities.setCapability("deviceOrientation", "portrait");
		 		capabilities.setCapability("captureScreenshots", true);
		 		capabilities.setCapability("app", "kobiton-store:24713");
		 		capabilities.setCapability("groupId", 444);
		 		capabilities.setCapability("deviceGroup", "KOBITON");
		 		capabilities.setCapability("deviceName", "Moto G Plus (5th Gen)");
		 		capabilities.setCapability("platformVersion", "7.0");
		 		capabilities.setCapability("platformName", "Android");
		 		capabilities.setCapability("noReset", "false");*/

                    driver = new AppiumDriver<MobileElement>(new URL(url), capabilities);
                    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                    return driver;
                } catch (Exception e) {
                    logger.log(Level.SEVERE, ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
                    throw new MyBussinessException(ExceptionMessages.EXCEPTION_NO_CREATE_DRIVER.getMensaje(), e);
                }
            default:
                logger.log(Level.SEVERE, ExceptionMessages.EXCEPTION_NO_SE_ENCONTRO_PLATAFORMA.getMensaje());
                break;
        }
        return null;
    }

    public static AppiumDriver<MobileElement> getDriver() {
        return driver;
    }

    public static Logger getLogger() {
        return logger;
    }
}
