package Pages;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ElementsPage extends BasePage {


    public ElementsPage() {

        }
    public void openElementsPage() {
            open("/elements");
    }

    public void clickButtonsOption() {
        $x("//*[@id='item-4']/span").click();
    }

    public void clickClickMeButton() {
        $x("//button[text()='Click Me']").click();
    }

    public void verifyClickMessage() {
        $("p").shouldHave(text("You have done a dynamic click"));
    }
}
