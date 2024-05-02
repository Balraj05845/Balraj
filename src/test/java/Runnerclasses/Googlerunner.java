package Runnerclasses;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL 5290\\eclipse-workspace\\BDDcucumber\\src\\test\\resources\\Featurefiles\\Google.feature",glue="StepDef")
public class Googlerunner {

}
