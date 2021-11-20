package sentrifugo.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sentrifugo.TestBase;
import sentrifugo.pages.DepartmentPage;
import sentrifugo.pages.HomePages;
import sentrifugo.pages.LoginPage;

public class DepartmentTest extends TestBase {
    DepartmentPage departmentPage ;
    HomePages homePages ;
    LoginPage loginPage ;
    @BeforeMethod
    public void initializePages(){
        departmentPage = new DepartmentPage(driver);
        homePages = new HomePages(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validateNewDepartment(){

        loginPage.login("EM01","sentrifugo");
       departmentPage.clickDepartment();
        departmentPage.clickAddButton();
        departmentPage.sendDepartmentInfo("Finance","1234");
        departmentPage.clickSubmit();
        String actualMessage = departmentPage.getSuccessMessage();
        Assert.assertEquals(actualMessage,"Department added successfully.");
    }
}
