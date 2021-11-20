package SelecClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selectintro {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        String actualFirstSelected = select.getFirstSelectedOption().getText().trim();
        String expectFirstSelected = "Please select an option";
        select.selectByValue("1");
        select.deselectByVisibleText("Option 2");
        select.deselectByIndex(1);
        Assert.assertEquals(actualFirstSelected,expectFirstSelected,"first selected");
    }
}
