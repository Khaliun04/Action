package SelecClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class CarSelect {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://cars.com/");
        WebElement newUsed = driver.findElement(By.id("make-model-search-stocktype"));
        WebElement makes = driver.findElement(By.id("makes"));
        WebElement models = driver.findElement(By.id("models"));
        WebElement searchButton = driver.findElement(By.xpath("//div[@id='by-make-tab']//button"));

        BrowserUtils.selectBy(newUsed,"New cars","text");
        BrowserUtils.selectBy(makes,"porsche","value");
        BrowserUtils.selectBy(models,"4","index");
        searchButton.click();

        WebElement header = driver.findElement(By.xpath("//h1"));
        String actual = BrowserUtils.getText(header);
        String expected = "New Porsche 911 for sale";
        Assert.assertEquals(actual,expected);
    }
}
