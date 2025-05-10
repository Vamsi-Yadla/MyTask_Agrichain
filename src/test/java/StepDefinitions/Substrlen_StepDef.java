package StepDefinitions;

import Pages.InputPage;
import Pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substrlen_StepDef {
    InputPage inputPage;
    ResultPage resultPage;
    WebDriver driver;
    @Given("user is on agrichain website")
    public void user_is_on_agrichain_website(){
        driver  = new ChromeDriver();
        inputPage = new InputPage(driver);
        driver.get("https://agrichain.com/qa/input");
    }
    @When("user enters text in the input field as {string}")
    public void user_enters_text_in_the_input_field(String input){
        inputPage.enterInput(input);

    }
    @And("the user clicks on submit button")
    public void the_user_clicks_on_submit_button(){
        inputPage.submit();
    }
    @And("the user should be navigated to result page")
    public void the_user_should_be_navigated_to_result_page(){
        String expectedUrl = "https://agrichain.com/qa/result";
        String actualUrl = driver.getCurrentUrl();

        if (!actualUrl.equals(expectedUrl)) {
            System.out.println("Url mismatch");
        }
    }
    @Then("the user should see the output {string}")
    public void the_user_should_see_the_output(String output){
        String actualOutput = resultPage.checkResult();
        if(!output.equals(actualOutput)){
            System.out.println("Not As expected");
        }
    }

}
