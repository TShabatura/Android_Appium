package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage{
    @FindBy(id = "archive")
    private WebElement archiveLetterButton;

    @FindBy(id = "delete")
    private WebElement deleteLetterButton;

    @FindBy(id = "inside_conversation_unread")
    private WebElement markLetterUnreadButton;

    @FindBy(id = "forward_button")
    private WebElement forwardButton;

    @FindBy(id = "reply_all_button")
    private WebElement replyAllButton;

    @FindBy(id = "reply_button")
    private WebElement replyButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private WebElement backButton;

    public void archiveLetter(){
        archiveLetterButton.click();
    }

    public void deleteLetter(){
        deleteLetterButton.click();
    }

    public void markLetterUnread(){
        markLetterUnreadButton.click();
    }

    public void forwardLetter(){
        forwardButton.click();
    }

    public void replyAll(){
        replyAllButton.click();
    }

    public void replyLetter(){
        replyButton.click();
    }

    public void backToMailbox(){
        backButton.click();
    }
}
