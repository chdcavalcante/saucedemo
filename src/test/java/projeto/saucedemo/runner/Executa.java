package projeto.saucedemo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = {"projeto.saucedemo.steps"},
		tags = "",
		dryRun = true,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/json-reports"},
		snippets = SnippetType.CAMELCASE
		
		)
public class Executa {


}
