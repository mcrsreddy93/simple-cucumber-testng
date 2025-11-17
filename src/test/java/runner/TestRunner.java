package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"json:target/cucumber-reports/Cucumber.json","html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = {"steps"},
//        tags = "@Calculator",
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberParallelTests {

}
