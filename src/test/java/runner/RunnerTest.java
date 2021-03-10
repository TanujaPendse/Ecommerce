package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
		@RunWith(Cucumber.class)
        @CucumberOptions(
                    features = "F:/ECommerce/EcomBDD/src/test/java/features/BuildYourDeal.feature",
                    glue={"stepdefinitions"},
                    plugin= {"pretty"},
                    monochrome=true
                    ,dryRun=false
                )
        

public class RunnerTest {

}
