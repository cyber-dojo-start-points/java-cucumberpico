import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

// cyber-dojo.sh hands JUnitCore the classes whose names hold "Test", so this
// one is compiled and then never run.
@RunWith(Cucumber.class)
@CucumberOptions(
    monochrome = true,
    plugin = { "pretty" }
)
public class RunCukes {
}
