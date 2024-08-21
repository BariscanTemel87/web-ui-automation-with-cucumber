package Pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebTablesPage extends BasePage {

    public WebTablesPage() {
    }

    public void openWebTablesPage() {
        open("/webtables");
    }

    public void clickAddButton() {
        $x("//button[@id='addNewRecordButton']").click();
    }

    public void fillNewRecordForm(String firstName, String lastName, String email, String age, String salary, String department) {
        $x("//input[@id='firstName']").setValue(firstName);
        $x("//input[@id='lastName']").setValue(lastName);
        $x("//input[@id='userEmail']").setValue(email);
        $x("//input[@id='age']").setValue(age);
        $x("//input[@id='salary']").setValue(salary);
        $x("//input[@id='department']").setValue(department);
        $x("//button[@id='submit']").click();
    }

    public void editRecord(String newAge) {
        $x("//*[@id='edit-record-4']").click();
        //((JavascriptExecutor) driver()).executeScript("arguments[0].click();", $x("//*[@id='edit-record-4']"));
        $x("//input[@id='age']").clear();
        $x("//input[@id='age']").setValue(newAge);
        $x("//button[@id='submit']").click();
    }

    public void verifyUpdatedRecord(String expectedAge) {
        $x("//div[contains(text(),'" + expectedAge + "')]").shouldBe(visible);
    }
}
