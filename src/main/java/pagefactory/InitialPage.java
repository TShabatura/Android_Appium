package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePage{
    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItButton;

    @FindBy(id = "action_done")
    private WebElement takeMeToGmailButton;

    @FindBy(id = "setup_addresses_add_another")
    private WebElement addAnotherEmailButton;

    @FindBy(id = "owner")
    private WebElement owner;

    public InitialPage clickGotIt(){
        gotItButton.click();
        return this;
    }

    public void clickTakeMeToGmail(){
        waitForVisibilityOfElement(30, owner);
        takeMeToGmailButton.click();
    }

    public void clickAddAnotherEmail(){
        addAnotherEmailButton.click();
    }

}
