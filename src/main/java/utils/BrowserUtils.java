package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class BrowserUtils {

    public static void  switchByTitle(WebDriver driver, String title){
        Set<String> ids = driver.getWindowHandles();
        for(String id :ids){
            driver.switchTo().window(id);
            if(driver.getTitle().contains(title)){
                break;
            }
        }
    }
    //implement the method that switch the by url
    public static void closeWindowsByTitle(WebDriver driver, String title) {
        Set<String> ids = driver.getWindowHandles();
        for (String id : ids) {
            driver.switchTo().window(id);
            if(!driver.getTitle().equals(title)){
                driver.close();
            }
        }
    }
    public static void scrollToView(WebDriver driver,WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",webElement);
    }
    //we will create the reusable methods related with browser
    //inside the BrowserUtils class
    /*
    Method that accepts 3 param - WebElement and Value and MethodName
    SelectByVisibleText
     */
    public static void selectBy(WebElement element, String value, String methodName){
        Select select = new Select(element);
        // method name can be text ,value, index
        switch (methodName){
            case "text"  :
                select.selectByVisibleText(value);
                break;
            case "value"  :
                select.selectByValue(value);
                break;
            case "index"  :
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name is not available");
        }
    }

//method will det the text from the webelement and trim it
    public static String getText(WebElement element){
        return element.getText().trim();
    }
}
