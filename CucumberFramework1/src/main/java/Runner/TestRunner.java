package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="C:/Users/user/eclipse-workspace/CucumberFramework1/src/main/java/Features/login.feature",
		
	    glue= {"stepDefination"},
		
		plugin = {"pretty","html:test-output"}
		
		
)






public class TestRunner {

}



