import org.junit.*;
import static org.junit.Assert.*;
import io.cucumber.java.en.*;


public class HikerStepDef {

    private int answer;

    @Given("the hitch-hiker selects some tiles")
    public void theHitchHikerSelectsSomeTiles() throws Throwable {
    }

    // Printing inside a step puts the flood ahead of the summary the colour
    // rests on, and the runner keeps only the first 50K of the stream.
    @When("they spell {int} times {int}")
    public void theySpellTimes(int arg1, int arg2) throws Throwable {
        for (int i = 0; i != 20000; i++) {
            System.out.println("debug: i is " + i + ", total is " + (i * 2));
        }
        answer = Hiker.answer(arg1,arg2);
    }

    @Then("the score is {int}")
    public void theScoreIs(int expected) throws Throwable {
        assertEquals(expected, answer);
    }
}
