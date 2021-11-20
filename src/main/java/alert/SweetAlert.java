package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SweetAlert {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://sweetalert.js.org/");
    }
    @Test
    public void sweetAlert() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        WebElement preview = driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        preview.click();
        Thread.sleep(1000);
        WebElement popupMessege = driver.findElement(By.xpath("//div[@class='swal-text']"));
        String actualText = popupMessege.getText().trim();
        softAssert.assertEquals(actualText,"Something went wrong!");

        WebElement okButton = driver.findElement(By.xpath("//button[.='OK']"));
        okButton.click();
        Thread.sleep(1000);
        softAssert.assertTrue(okButton.isDisplayed());
        softAssert.assertAll();


    }
    @Test
    public void test() throws InterruptedException {


        WebElement alert = driver.findElement(By.xpath("//button[contains(@onclick,'alert')]"));
        alert.click();
        Thread.sleep(1000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("It will run before each annotation");
        driver.quit();
    }
}
