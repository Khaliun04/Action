package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class NestedFramePractice {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame(0);//frame top
        WebElement middleFrame = driver.findElement(By.name("frame-middle"));
        //we should first
        driver.switchTo().frame(middleFrame);//frame - middle
        WebElement middleText = driver.findElement(By.id("content"));
        String actualText = middleText.getText();
        String expectedText = "MIDDLE";
        Assert.assertEquals(actualText,expectedText);
        driver.switchTo().defaultContent();// it will switch to the HTML
        driver.switchTo().frame("frame-bottom");
        WebElement bottomText = driver.findElement(By.tagName("body"));
        bottomText.getText();
        Assert.assertEquals(bottomText.getText().trim(),"BOTTOM");

    }
    @Test
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
        //print text from right and left
        driver.switchTo().frame(0);
        WebElement rightFrame = driver.findElement(By.name("frame-right"));
        driver.switchTo().frame(rightFrame);
        WebElement rightText = driver.findElement(By.tagName("body"));
        System.out.println(BrowserUtils.getText(rightText));
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        WebElement leftBox = driver.findElement(By.tagName("body"));
        System.out.println(BrowserUtils.getText(leftBox));

    }
}
