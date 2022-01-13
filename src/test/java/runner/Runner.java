package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
        plugin = {"json:src/test/resources/report/cucumber_report.json"}
)
public class Runner {
    @AfterClass
    public static void finishTest() {
        try {
            String[] args = {"/bin/bash", "-c", "npm run report"};
            Runtime.getRuntime().exec(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
