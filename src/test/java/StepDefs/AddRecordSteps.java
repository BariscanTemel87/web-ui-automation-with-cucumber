package StepDefs;

import Pages.WebTablesPage;
import io.cucumber.java.en.*;

public class AddRecordSteps {

    WebTablesPage webTablesPage = new WebTablesPage();

    @Given("I am on the Web Tables page")
    public void i_am_on_the_web_tables_page() {
        webTablesPage.openWebTablesPage();
    }

    @When("I add a new record with first name {string}, last name {string}, age {string}, email {string}, salary {string}, and department {string}")
    public void i_add_a_new_record(String firstName, String lastName, String age, String email, String salary, String department) {
        webTablesPage.clickAddButton();
        webTablesPage.fillNewRecordForm(firstName, lastName, email, age, salary, department);
    }

    @When("I edit the record to have age {string}")
    public void i_edit_the_record_to_have_age(String newAge) {
        webTablesPage.editRecord(newAge);
    }

    @Then("I should see the updated age as {string}")
    public void i_should_see_the_updated_age_as(String expectedAge) {
        webTablesPage.verifyUpdatedRecord(expectedAge);
    }
}
