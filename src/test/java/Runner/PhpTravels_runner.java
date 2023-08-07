package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/Features/PhpTravel.feature",
		glue= {"StepDefinitions"},
		monochrome=true,                                        // display the console output in a proper readable format
		plugin= {
				"pretty","html:target/MyReports/report.html",
				"json:target/MyReports/report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		dryRun = false
		
		
		)
		
public class PhpTravels_runner  {
	
}
