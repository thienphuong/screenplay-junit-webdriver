package net.serenitybdd.demos.todos.screenplay.features;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.demos.todos.screenplay.ui.ApplicationHomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

/**
 * This example illustrates using Serenity Steps with JUnit.
 */
@RunWith(SerenityRunner.class)
public class LearnAboutTheApplication {

    @Managed
    public WebDriver hisMobileDevice;

    String jacob = "Jacob";
    
    ApplicationHomePage applicationHomePage;

    @Before
    public void jacobCanBrowseTheMobileApp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Test
    public void should_see_how_to_begin() {

    	// Given
    	theActorCalled(jacob).wasAbleTo(Open.browserOn().the(applicationHomePage));
        
        // When 
        //theActorInTheSpotlight().attemptsTo("Define some tasks to achieve your goals");

        // Then
        //theActorInTheSpotlight().should(seeThat("Your questions here", equalTo("The answer here")));
    }
}