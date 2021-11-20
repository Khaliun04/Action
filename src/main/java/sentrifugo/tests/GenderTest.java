package sentrifugo.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sentrifugo.TestBase;
import sentrifugo.pages.GenderPage;
import sentrifugo.pages.HomePages;
import sentrifugo.pages.LoginPage;

public class GenderTest extends TestBase {
    LoginPage loginPage;
    HomePages homePages;
    GenderPage genderPage;

    @BeforeMethod
    public void initializa(){
        loginPage = new LoginPage(driver);
        homePages = new HomePages(driver);
        genderPage = new GenderPage(driver);
    }
    @Test
    public void validateGenderError(){
        loginPage.login("EM01","sentrifugo");
        homePages.clickGender();
        genderPage.clickAddButton();
        genderPage.sendGenderInfo("F","Female");
        genderPage.clickSaveButton();
        String genderCodeColor = genderPage.getGenderCodeColor();
        String genderColor = genderPage.getGenderColor();
        System.out.println(genderColor);
        System.out.println(genderCodeColor);
        Assert.assertEquals(genderCodeColor,"rgba(255, 0, 0, 1)");
        Assert.assertEquals(genderColor,"rgba(255, 0, 0, 1)");
    }
}
