package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/site/serenity/index.html"
                ,"json:target/site//serenity.json"},
        features = {"src/test/resources/features"},
        glue = {"web/stepdefinitions"},
        stepNotifications = true,
        tags = "@Prueba1"
)
public class RunnerTest {
    @BeforeClass
    public static void beforeExecution(){

    }
    @AfterClass
    public static void afterExecution(){

    }
}
