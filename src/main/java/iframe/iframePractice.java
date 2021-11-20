package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframePractice {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox = driver.findElement(By.id("tinymce"));
       textBox.clear();
       textBox.sendKeys("Hello Java!");
       driver.switchTo().parentFrame();
       //parentFrame(); goes to one parent up in the inner html
       WebElement text = driver.findElement(By.tagName("h3"));
       String actualText = text.getText();
       String expectText = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(actualText,expectText);
    }
}
