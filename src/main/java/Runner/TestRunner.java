package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\BDD_Workspace\\HopscotchBDDFramework\\src\\main\\java\\Features\\Login.feature",//path of the feature files
			glue = {"stepDefinition"},//path of the step definition files
			//format= {"pretty","html:target/cucumber-report-html/cucumber-html-reports", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, //display the console output in a proper readable format
			strict = false, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
public class TestRunner {
	
	

}
