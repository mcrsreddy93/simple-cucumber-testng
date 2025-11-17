package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MySteps {

    int num1,num2,result;

    @Given("I have number {int}")
    public void i_have_number(Integer num){
        if (num1 == 0){
            num1 = num;
        }else{
            num2 = num;
        }
    }


    @When("I add them")
    public void iAddThem() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        Assert.assertEquals(result, expected);
    }

    @When("I subtract them")
    public void iSubtractThem() {
        result = num1 - num2;
    }

    @When("I multiplicate them")
    public void iMultiplicateThem() {
        result = num1 * num2;
    }
}
