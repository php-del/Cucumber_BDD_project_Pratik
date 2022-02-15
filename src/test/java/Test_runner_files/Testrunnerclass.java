package Test_runner_files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/pratikhemantpathare/Desktop/Selenium-Cucumber/Feature_files",
glue = "Step_definitions",
plugin = {"pretty","html:test-output.html"},
tags = "@sanity or @smoke")
public class Testrunnerclass {
}
