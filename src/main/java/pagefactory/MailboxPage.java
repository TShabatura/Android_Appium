package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MailboxPage extends BasePage{
    @FindBy(id = "compose_button")
    private WebElement composeButton;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView/android.view.ViewGroup")
    private List<WebElement> letters;

    @FindBy(id = "open_search_bar_text_view")
    private WebElement searchButton;

    @FindBy(id = "open_search_view_edit_text")
    private WebElement searchBox;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    private WebElement navigationButton;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Sent']")
    private WebElement sentLettersButton;

    @FindBy(xpath = "//android.widget.TextView[@text = 'Trash']")
    private WebElement trashButton;

    @FindBy(xpath = "//android.widget.TextView[3]")
    private List<WebElement> subjects;

    public MailboxPage composeNewLetter(){
        composeButton.click();
        return this;
    }

    public MailboxPage searchLettersBy(String string){
        searchButton.click();
        searchBox.sendKeys(string);
        return this;
    }

    public MailboxPage clickNaviButton(){
        navigationButton.click();
        waitForElementToBeClickable(30, sentLettersButton);
        return this;
    }

    public MailboxPage clickSentLettersButton(){
        sentLettersButton.click();
        return this;
    }

    public MailboxPage clickTrashButton(){
        trashButton.click();
        return this;
    }

    public List<WebElement> getLetters(){
        return letters;
    }

    public List<WebElement> getSubjects(){
        return subjects;
    }
}
