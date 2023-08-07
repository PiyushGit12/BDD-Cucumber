package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/Features/JioMartHomePage.feature",
		glue= {"StepDefinitions","AppHooks"},
		
		monochrome=true,                     // display the console output in a proper readable format
		dryRun=false,                       // Check the mapping between feature file and Stepdefinitions files
		//plugin= {"pretty"}
				plugin= {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		

		)

public class joiMartHomePageRunner{

}
