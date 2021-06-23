package co.com.choucair.certification.proyectobase.stepdefinition;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Go;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than user wants to learn automation in the Choucair Academy$")
    public void thanUserWantsToLearnAutomationInTheChoucairAcademy() {
        OnStage.theActorCalled("User").wasAbleTo(Go.ChoucairAcademy(), (Login.onThePage()));
    }

    @When("^user search for the course (.*) in the Choucair Academy platform$")
    public void userSearchForTheCourseInTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }
    @Then("^user finds the course called (.*)$")
    public void userFindsTheCourseCalledAutomatizacionDePruebas(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}