package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/Users/nchillal/Documents/ShwetaWorkspace1/CucumberSFDC/src/main/java/feature"
 ,glue={"LoginStepDefinition"},plugin= {"pretty","html:test-out"}
 )


public class TestRunner 
{
 
}

