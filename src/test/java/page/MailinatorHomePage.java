package page;

import base.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorHomePage extends Base {
@FindBy (id="search")
    WebElement mailType;

public MailinatorHomePage () {
    PageFactory.initElements(driver, this);
}
public void typeMail (String x) {
    wdWait.until(ExpectedConditions.elementToBeClickable(mailType));
    mailType.clear();
    mailType.sendKeys(x);
    mailType.sendKeys(Keys.ENTER);
}

}