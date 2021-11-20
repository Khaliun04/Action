package actionspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class Practice {

    @Test
    public void test(){
        WebDriver driver  = new ChromeDriver();
        driver.navigate().to("https://skpatro.github.io/demo/iframes/");
        driver.switchTo().frame(0);
        WebElement clickCategory = driver.findElement(By.xpath("//a[.='Category1']"));
        clickCategory.click();
//        Actions actions = new Actions(driver);
//        actions.moveToElement(clickCategory).click().perform();
        BrowserUtils.switchByTitle(driver,"iframe");
        driver.switchTo().frame("SeleniumTesting");
        Assert.assertTrue(driver.getTitle().endsWith("gavalidation"));
        driver.close();//it will close the S
        BrowserUtils.switchByTitle(driver,"iframe");

        driver.switchTo().frame("Frame2");
        WebElement cat3 = driver.findElement(By.linkText("Category3"));
        cat3.click();
        BrowserUtils.switchByTitle(driver,"SoftwareTesting");
        Assert.assertEquals(driver.getCurrentUrl(),"https://qavalidation.com/category/softwaretesting/");
        driver.quit();
    }
}
