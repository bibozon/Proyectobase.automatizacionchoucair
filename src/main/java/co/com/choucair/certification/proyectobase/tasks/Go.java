package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Go implements Task {
    private ChoucairAcademyPage choucairAcademyPage;

    public static Go ChoucairAcademy() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
