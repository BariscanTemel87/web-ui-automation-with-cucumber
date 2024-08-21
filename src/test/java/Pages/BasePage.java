package Pages;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertyManager;

public class BasePage {
    PropertyManager propertyManager = new PropertyManager();


    public BasePage() {
        // Selenide'in WebDriver'ı başlatmasını sağlıyoruz
        Configuration.browser = "chrome";
    }

    public void open(String path) {
        String url = propertyManager.getProperty("APP_URL") + path;
        Selenide.open(url);
    }
}
