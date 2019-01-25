package net.serenitybdd.demos.todos.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tfl.gov.uk")
public class ApplicationHomePage extends PageObject {
  
    /*
    public final static String PLAN_JOURNEY = ".plan-journey";

    public void viewProfile() {
        $(PLAN_JOURNEY).click();
    }*/
  
  
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".plan-journey");
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".status-update");
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".maps");
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".fares-and-payments");
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".help-and-contact");
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".more");
  
  
}
