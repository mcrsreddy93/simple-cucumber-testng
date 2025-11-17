package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.json.support.Status;
import net.masterthought.cucumber.presentation.PresentationMode;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AbstractTestNGCucumberParallelTests extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void afterSuite(){
        File reportOutputDirectory = new File("target/cucumber-reports");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-reports/Cucumber.json");
        String buildNumber="1";
        String projectName="cucumberProject";
        Configuration configuration = new Configuration(reportOutputDirectory,projectName);
        configuration.setBuildNumber(buildNumber);
        configuration.addPresentationModes(PresentationMode.PARALLEL_TESTING);
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I am beforeSuite");
    }
}
