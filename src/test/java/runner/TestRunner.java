package runner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"StepDefinitions", "utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json", "junit:target/cucumber-junit-report.xml"}
)
public class TestRunner {

}
