package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EtsyPractice {

    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com/");
        WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'holidays!')]"));
        String actual = header.getText();
        String expect = "Bring on the holidays! Discover meaningful finds.";
        Assert.assertEquals(actual,expect,"Esty Header");
    }
}
