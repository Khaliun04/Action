package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
      //  driver.findElement();
     //   driver.findElements(); --> we need to use find elements method to store
        //all matching element from the locator.
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links = driver.findElements(By.xpath("//li/a"));
        int count =0;
        for(WebElement link : links){
            if(link.getText().length()<12){
                System.out.println(link.getText());
                System.out.println(link.getAttribute("href"));
                count++;
            }
        }
        System.out.println(count);



    }
}
