package businessobject;

import org.apache.log4j.Logger;
import pagefactory.ComposePage;
import pagefactory.InitialPage;
import pagefactory.LetterPage;
import pagefactory.MailboxPage;
import utils.ScreenshotMaker;


public class GmailActions {

    private InitialPage initialPage;
    private LetterPage letterPage;
    private MailboxPage mailboxPage;
    private ComposePage composePage;

    private static final Logger logger = Logger.getLogger(GmailActions.class);

    public GmailActions() {
        initialPage = new InitialPage();
        letterPage = new LetterPage();
        mailboxPage = new MailboxPage();
        composePage = new ComposePage();
    }

    public GmailActions entryMailWithCurrentAccount(){
        initialPage.clickGotIt()
                .clickTakeMeToGmail();
        logger.info("Entry completed successfully");
        return this;
    }

    public GmailActions createNewLetter(String toAddress, String subject, String body){
        mailboxPage.composeNewLetter();
        composePage.skipHints()
                .setToAddress(toAddress)
                .setSubject(subject)
                .setLetterBody(body)
                .sendLetter();
        logger.info("Letter was sent successfully");
        return this;
    }

    public GmailActions showSentLetters(){
        mailboxPage.clickNaviButton()
                    .clickSentLettersButton();
        return this;
    }

    public GmailActions deleteLetter(){
        showSentLetters();
        mailboxPage.getLetters().get(0).click();
        letterPage.deleteLetter();
        logger.info("Letter was deleted successfully");
        new ScreenshotMaker().makeScreenshot(logger);
        return this;
    }

    public String getSubjectOfLastDeletedLetter(){
        mailboxPage.clickNaviButton()
                .swipeUp(540, 1000, 500);
        return mailboxPage.clickTrashButton()
                .getSubjects().get(0).getText();
    }
}
