package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class HaloOglasiActivation extends Base {
    @FindBy (css =".regsitration-success span")
    WebElement activationSuccessfull;

    public HaloOglasiActivation () {
        PageFactory.initElements(driver, this);
    }
    public void movetoNewTab(){
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }

    public boolean isActivationSuccessfull() {


        wdWait.until(ExpectedConditions.visibilityOf(activationSuccessfull));
        return activationSuccessfull.isDisplayed();
    }

    public String activationSuccessfullText () {
        wdWait.until(ExpectedConditions.visibilityOf(activationSuccessfull));
        return activationSuccessfull.getText();
    }

}
