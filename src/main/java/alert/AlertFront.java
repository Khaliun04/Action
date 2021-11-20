package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertFront {
    /*
    TASK:
1- navigate to the "https://the-internet.herokuapp.com/javascript_alerts"
2- Click JS Prompt
3- Send key 'Techtorial'
4- Validate message "You entered: Techtorial"
     */
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement click = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        click.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Techtorial");
        alert.accept();

        WebElement text = driver.findElement(By.id("result"));
        String actualResult = text.getText().trim();
        Assert.assertEquals(actualResult,"You entered: Techtorial");

    }
}
