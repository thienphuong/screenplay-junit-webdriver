package net.serenitybdd.demos.todos.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tfl.gov.uk")
public class ApplicationHomePage extends PageObject {
  
    public final static Target PLAN_JOURNEY_TAB = Target.the("plan-journey navigation item").locatedBy(".plan-journey");
    public final static Target STATUS_UPDATE_TAB = Target.the("status update navigation item").locatedBy(".status-update");
    public final static Target MAPS_TAB = Target.the("maps navigation item").locatedBy(".maps");
    public final static Target FARES_TAB = Target.the("fares navigation item").locatedBy(".fares-and-payments");
    public final static Target HELP_TAB = Target.the("help & contacts navigation item").locatedBy(".help-and-contact");
    public final static Target MORE_TAB = Target.the("more navigation item").locatedBy(".more");
  
  
}
