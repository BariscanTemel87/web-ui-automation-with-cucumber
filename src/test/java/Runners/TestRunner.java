package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDefs",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

    @BeforeClass
    public static void setup() {
        Configuration.browserSize = "1920x1080";
    }
}
