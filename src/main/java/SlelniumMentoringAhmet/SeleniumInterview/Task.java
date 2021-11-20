package SlelniumMentoringAhmet.SeleniumInterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task {
    /*
    1 - I want to go to amazon
    2 - I want t6o you click Hello-Sign in Acoount@List
    3 - click sign in button
    4 - Click create your amazon account
    5 - fill the fields
    6 - click continue
    7 - val
     */

    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://amazon.com/");
        WebElement element = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        element.click();
        WebElement createButton = driver.findElement(By.id("createAccountSubmit"));
        createButton.click();
        WebElement userName  = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Khaliun");
        WebElement email  = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Batbayar@ffghril");
        WebElement password  = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("12324356");
        WebElement rePass  = driver.findElement(By.xpath("//input[@type='repaqssword']"));
        rePass.sendKeys("12324356");
        WebElement submit  = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();


    }
}
