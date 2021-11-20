package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertConfirm {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsAlert.click();
        Alert alert = driver.switchTo().alert();
        String jsText = alert.getText();
        Assert.assertEquals(jsText,"I am a JS Confirm");
        alert.dismiss();
        WebElement result = driver.findElement(By.id("result"));
        String resultText = result.getText();
        Assert.assertEquals(resultText,"You clicked: Cancel");



    }
}
