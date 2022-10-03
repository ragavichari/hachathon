package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\general\\eclipse-workspace\\Hackathon-Cucumber\\src\\test\\resources\\features",
glue="stepdefinition",dryRun=false,monochrome=true,plugin= {"pretty","html:target/cucumber.html"})
*/
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\general\\eclipse-workspace\\Hackathon-Cucumber\\src\\test\\resources\\features",
glue={"stepdefinition"},monochrome=true,plugin= {"pretty","html:target/cucumber.html"})
public class testrun {

}
