package SeleniumLocators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SearchIphone {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iphone 13");
        //searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.name("btnK"));
       searchButton.click();
       WebElement result = driver.findElement(By.tagName("nobr"));
       String resultStr = result.getText().replaceAll("[^0-9.]","");
       double sec = Double.parseDouble(resultStr);
       if(sec<3){
           System.out.println(true);
       }else{
           System.out.println(false);
       }
    }
}
