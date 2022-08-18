package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloPage extends Base {
    @FindBy (xpath = "//*[contains(text(),\"U redu\")]")
    WebElement cookie;
    @FindBy (css = "[href=\"/prijava?returnUrl=%2f\"]")
    WebElement ulogujSe;

    public HaloPage () {
        PageFactory.initElements(driver, this);
    }
    public HaloPage clickCookie () {
        wdWait.until(ExpectedConditions.elementToBeClickable(cookie));
        cookie.click();
        return this;
    }
    public void clickRegistrujSe () {
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSe));
        ulogujSe.click();
    }
}
