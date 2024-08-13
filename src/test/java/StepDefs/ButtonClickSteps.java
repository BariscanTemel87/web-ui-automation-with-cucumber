package StepDefs;

import Pages.ElementsPage;
import io.cucumber.java.en.*;

public class ButtonClickSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Given("I am on the Elements page")
    public void i_am_on_the_elements_page() {
        elementsPage.openElementsPage();
    }

    @When("I click on the {string} option")
    public void i_click_on_the_option(String option) {
        elementsPage.clickButtonsOption();
    }

    @When("I click the {string} button")
    public void i_click_the_button(String button) {
        elementsPage.clickClickMeButton();
    }

    @Then("I should see the message {string}")
    public void i_should_see_the_message(String message) {
        elementsPage.verifyClickMessage();
    }
}
