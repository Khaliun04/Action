package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.Set;

public class NewWindow {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.techtorialacademy.com/')");
        js.executeScript("window.open('https://www.techtorialacademy.com/about-us')");
        js.executeScript("window.open('https://www.techtorialacademy.com/programs')");
        String mainPage = driver.getWindowHandle();
        String mainTitle = driver.getTitle();
        BrowserUtils.switchByTitle(driver,"About Us");
     //   Set<String> ids = driver.getWindowHandles();
//        for(String id : ids){
//            driver.switchTo().window(id);
//            if(driver.getTitle().contains("About Us")){
//                break;
//            }
//        }
        System.out.println(driver.getTitle());
        BrowserUtils.closeWindowsByTitle(driver,mainTitle);
//        for(String id : ids){
//            driver.switchTo().window(id);
//                if(!driver.getTitle().equals(mainTitle)){
//                    driver.close();
//                }
//            }
        }
    }

