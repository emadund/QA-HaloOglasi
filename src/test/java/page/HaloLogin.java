package page;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class HaloLogin extends Base {
    @FindBy (className = "no-account-reg-link")
    WebElement regustrujSe;
    @FindBy (css = "[value=\"person\"]")
    WebElement fizickoLice;
    @FindBy (id = "UserName")
    WebElement userName;
    @FindBy (id = "Email")
    WebElement email;
    @FindBy (id = "Password")
    WebElement password;
    @FindBy (id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy (id= "AllowSendingNewsletters")
    WebElement turnOffNews;
    @FindBy (id = "HasAgreedToGetFiscalReceiptByEmail")
    WebElement obligatory;
    @FindBy (css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrujMe;

    public HaloLogin () {
        PageFactory.initElements(driver, this);
    }
    public HaloLogin clickRegistrujteSe() {
        wdWait.until(ExpectedConditions.elementToBeClickable(regustrujSe));
        regustrujSe.click();
        return this;
    }
    public HaloLogin fizickoLice () {
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLice));
        if (!fizickoLice.isSelected()) {fizickoLice.click();}
        return this;
    }


    public HaloLogin inputName (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(userName));
        userName.clear();
        userName.sendKeys(x);
        return this;
    }
    public HaloLogin inputEmail (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(email));
        email.clear();
        email.sendKeys(x);
        return this;
    }
    public HaloLogin inputPasswordAndConformation (String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(password));
        password.clear();
        password.sendKeys(x);
        wdWait.until(ExpectedConditions.elementToBeClickable(confirmPassword));
        confirmPassword.clear();
        confirmPassword.sendKeys(x);
        return this;
    }
    public HaloLogin checkNews () {
        wdWait.until(ExpectedConditions.elementToBeClickable(turnOffNews));
        if (turnOffNews.isSelected()) {turnOffNews.click();}
        return this;
    }
    public HaloLogin checkAgreement () {
        wdWait.until(ExpectedConditions.elementToBeClickable(obligatory));
        if (!obligatory.isSelected()) {obligatory.click();}
        return this;
    }
    public void clickRegistrujMe () {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujMe));
        registrujMe.click();
    }
    }




