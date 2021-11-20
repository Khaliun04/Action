package SelecClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelect {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/khaliun/Desktop/HTML%20folder/Techtorial.html");

        WebElement multiple = driver.findElement(By.className("select"));
        Select select = new Select(multiple);
        select.selectByIndex(0);
        select.selectByVisibleText("Three");
        select.selectByValue("4");
        select.deselectByVisibleText("Three");
        select.deselectByValue("4");


    }
}
