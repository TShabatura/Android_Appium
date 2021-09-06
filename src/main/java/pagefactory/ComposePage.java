package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePage{

    @FindBy(xpath = "//android.widget.Button")
    private WebElement hintGotIt;

    @FindBy(id = "to")
    private WebElement toAddress;

    @FindBy(id = "subject")
    private WebElement subject;

    @FindBy(xpath = "//android.webkit.WebView/android.widget.EditText")
    private WebElement letterBody;

    @FindBy(id = "send")
    private WebElement sendButton;

    public ComposePage setToAddress(String string) {
        toAddress.sendKeys(string);
        return this;
    }

    public ComposePage skipHints() {
        waitForElementToBeClickable(30, hintGotIt);
        hintGotIt.click();
        return this;
    }

    public ComposePage setSubject(String string) {
        subject.sendKeys(string);
        return this;
    }

    public ComposePage setLetterBody(String string) {
        letterBody.sendKeys(string);
        return this;
    }

    public void sendLetter() {
        sendButton.click();
    }
}
