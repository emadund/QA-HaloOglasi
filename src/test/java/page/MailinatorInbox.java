package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorInbox extends Base {
    @FindBy (xpath = "//*[contains(text(),\"Molimo aktivirajte Vaš Halo oglasi nalog\")]")
    WebElement inbox;


public MailinatorInbox () {
    PageFactory.initElements(driver, this);
}
public MailinatorInbox clickInbox() {
    wdWait.until(ExpectedConditions.elementToBeClickable(inbox));
    inbox.click();
    return this;
}

}
