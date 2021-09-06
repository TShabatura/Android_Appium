package pagefactory.tests;

import businessobject.GmailActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.SystemDate;

public class GmailTest extends BaseTest{

    private GmailActions gmailActions = new GmailActions();

    private String receiver = "tarasshabatura@gmail.com";
    private String subject = new SystemDate().getCurrentDate();
    private String body = "Something important";

    @Test
    public void checkLetterDeleting(){
        gmailActions.entryMailWithCurrentAccount()
                .createNewLetter(receiver, subject, body)
                .deleteLetter();
        Assert.assertTrue(gmailActions.getSubjectOfLastDeletedLetter().equals(subject));
    }

}
