package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        String mainWindow = driver.getWindowHandle();
        Set<String> ids = driver.getWindowHandles();
        for(String id : ids){
            if(!id.equals(mainWindow)){
                driver.switchTo().window(id);

            }
        }
        WebElement title = driver.findElement(By.tagName("h3"));
        String actual = title.getText();
        String expected = "New Window";
        Assert.assertEquals(actual,expected,"New window validation");
        driver.quit();
    }
    @Test
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        String mainWindow = driver.getWindowHandle();
        Set<String> ids = driver.getWindowHandles();
        for(String id : ids){
            if(!id.equals(mainWindow)){
                driver.switchTo().window(id);
                driver.close(); //close only one window
            }
        }
        driver.switchTo().window(mainWindow);
        Assert.assertEquals(driver.getTitle(),"The Internet");
    }
}
