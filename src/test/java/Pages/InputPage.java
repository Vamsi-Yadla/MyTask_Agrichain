package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPage {
    WebDriver driver;

    public InputPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "input")
    public WebElement inputField;

    @FindBy(tagName = "button")
    public WebElement submitButton;

    @FindBy(tagName = "div")
    public WebElement divElement;

    public void enterInput(String s) {
        inputField.sendKeys(s);
    }

    public void submit() {
        submitButton.click();
    }


}
