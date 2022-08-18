package test;

import base.Base;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.util.Random;

public class HaloTest extends Base {
    private HaloPage haloPage;
    private HaloLogin haloLogin;
    private HaloRegistrationSuccessfull haloRegistrationSuccessfull;
    private MailinatorHomePage mailinatorHomePage;
    private MailinatorInbox mailinatorInbox;
    private MailinatorMessages mailinatorMessages;
    private HaloOglasiActivation haloOglasiActivation;

    private Random ran = new Random();
    private String text = "Zvezdic"+ran.nextInt(99999);
    private String eMail = text+"@mailinator.com";

    @Before
    public void setupTest() {
        haloPage = new HaloPage();
        haloLogin = new HaloLogin();
        haloRegistrationSuccessfull = new HaloRegistrationSuccessfull();
        mailinatorHomePage = new MailinatorHomePage();
        mailinatorInbox = new MailinatorInbox();
        mailinatorMessages = new MailinatorMessages();
        haloOglasiActivation = new HaloOglasiActivation();

    }
    @Test
    public void test1() {

    haloPage.clickCookie()
            .clickRegistrujSe();
    haloLogin.clickRegistrujteSe()
            .inputName(text)
            .inputEmail(eMail)
            .inputPasswordAndConformation("P@ssw0rd")
            .checkNews()
            .checkAgreement()
            .clickRegistrujMe();
        Assert.assertTrue(haloRegistrationSuccessfull.registrationSuceeded());
        Assert.assertEquals("Registracija je uspela!",haloRegistrationSuccessfull.registrationText());
        driver.get("https://www.mailinator.com/");
        mailinatorHomePage.typeMail(eMail);
        mailinatorInbox.clickInbox();
        mailinatorMessages.activateAccount();
        haloOglasiActivation.movetoNewTab();
        Assert.assertTrue(haloOglasiActivation.isActivationSuccessfull());
        Assert.assertEquals("Vaš nalog je uspešno aktiviran!",haloOglasiActivation.activationSuccessfullText());

    }
}
