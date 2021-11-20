package SelecClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.*;

public class SelectMethods {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        WebElement price = driver.findElement(By.id("make-model-max-price"));
        //BrowserUtils.selectBy(price,"Price","value");
        Select select = new Select(price);
        List<WebElement> prices = select.getOptions();
        Set<String> actualOrder = new LinkedHashSet<>();
        Set<String> expectedOrder = new TreeSet<>();
        for (WebElement pr : prices){
           actualOrder.add(BrowserUtils.getText(pr));//insertion order
           expectedOrder.add(BrowserUtils.getText(pr));//ascending order
        }
        Assert.assertEquals(actualOrder,expectedOrder);
    }
}
