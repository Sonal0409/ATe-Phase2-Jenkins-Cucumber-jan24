package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\sonal\\Eclipse-2023\\ATE-Phase2-Cucumber-ExtentReports-Jenkins\\src\\test\\java\\features\\AmazonTest.feature",
		glue = {"steps"}, //packagename where the steps are
		plugin= {"pretty",
		"html:target/cucumberreport.html",
		/*
		 * "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 * "timeline:test-output-thread/"
		 */
		
		
		}
		
		)
public class Amazonrunner {



}
