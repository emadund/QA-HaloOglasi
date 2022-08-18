package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailinatorMessages extends Base {
@FindBy (linkText = "Aktiviraj nalog")
    WebElement activateAccountButton;
@FindBy (id="html_msg_body")
WebElement iframe;

    public  MailinatorMessages () {
        PageFactory.initElements(driver, this );
    }


    public void activateAccount () {
        wdWait.until(ExpectedConditions.visibilityOf(iframe));
        driver.switchTo().frame(iframe);
        wdWait.until(ExpectedConditions.elementToBeClickable(activateAccountButton));
        activateAccountButton.click();
        driver.switchTo().defaultContent();
    }
}
