package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloRegistrationSuccessfull extends Base {
    @FindBy (xpath = "//*[contains(text(),\"Registracija je uspela!\")]")
    WebElement successfullRegistration;

    public HaloRegistrationSuccessfull() {
        PageFactory.initElements(driver, this);
    }

    public boolean registrationSuceeded() {
        wdWait.until(ExpectedConditions.visibilityOf(successfullRegistration));
        return successfullRegistration.isDisplayed();
    }
    public String registrationText () {
        wdWait.until(ExpectedConditions.visibilityOf(successfullRegistration));
        return successfullRegistration.getText();
    }

}
