package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ElementsPage {
    public void openElementsPage() {
        open("https://demoqa.com/elements");
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
