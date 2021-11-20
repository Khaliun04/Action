package SelecClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.BrowserUtils;

public class Car {
    public static void main(String[] args) {



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        WebElement newCar = driver.findElement(By.id("make-model-search-stocktype"));
        WebElement makes = driver.findElement(By.id("makes"));
        WebElement model = driver.findElement(By.id("models"));
        WebElement search = driver.findElement(By.xpath("//div[@id='by-make-tab']//button"));
        BrowserUtils.selectBy(newCar,"new cars","text");
        BrowserUtils.selectBy(makes,"porsche","value");
        BrowserUtils.selectBy(model,"4","index");

//        Select select =new Select(newCar);
//        select.deselectByVisibleText("New cars");
//
//        Select select1 =new Select(makes);
//        select1.deselectByValue("porsche");
//
//        Select select2 =new Select(model);
//        select2.deselectByIndex(4);

       search.click();

       WebElement header = driver.findElement(By.xpath("//h1"));
       String actual = header.getText().trim();
       String expected = "New Porsche 911 for sale";
        Assert.assertEquals(actual,expected);

    }
}
