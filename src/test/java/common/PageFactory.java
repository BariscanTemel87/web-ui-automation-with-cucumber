package pages;

import Pages.ElementsPage;
import Pages.WebTablesPage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    public static ElementsPage buildElementsPage(){
        return new ElementsPage();
    }
    public static WebTablesPage buildWebTablesPage(){return new WebTablesPage();
    }
}
