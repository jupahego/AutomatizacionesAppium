package co.com.qvision.eribank.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.qvision.eribank.utils.MyDriver.abrirApp;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenAppTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.whoCan(
                BrowseTheWeb.with(abrirApp())
        );
    }

    public static OpenAppTask openAppTask() {
        return instrumented(OpenAppTask.class);
    }

}
