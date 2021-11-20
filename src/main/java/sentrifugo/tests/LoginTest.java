package sentrifugo.tests;

import sentrifugo.TestBase;
import sentrifugo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void validateSuperAdmin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("EM01","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");
    }
    @Test
    public void validateManagement(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("EM02","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");
    }
    @Test
    public void validateManager(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("EM03","sentrifugo");
        Assert.assertEquals(driver.getTitle(),"Sentrifugo - Open Source HRMS");
    }
    @Test
    public void invalidUserName(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inValidLogin();
        String checkText = loginPage.invalidUserNameText();
        Assert.assertEquals(checkText,"Please enter username or email.");
    }

    @Test
    public void invalidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inValidLogin();
        String checkText = loginPage.invalidpwdMessage();
        Assert.assertEquals(checkText,"Please enter password.");
    }
}
