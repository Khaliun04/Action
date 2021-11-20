package SlelniumMentoringAhmet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FacebookCreate {
    /*
    Facebook Sign up:
    Scenario:
    Open a Chrome browser.
    Navigate to "http://www.fb.com"
    Verify that the page is redirected to "http://www.facebook.com", by getting the current URL. (use Assertion)
    Verify that there is a "Create an account" section on the page.
    Fill in the text boxes: First Name, Surname, Mobile Number or email address, "Re-enter mobile number", new password.
    Update the date of birth in the drop-down.
    Select gender.
    Click on "Create an account".
    Verify that the account is not created.
     */
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.fb.com");
     String actual = driver.getCurrentUrl();
     String expect = "https://www.facebook.com/";
     if(actual.equals(expect)){
         System.out.println("true");
     }else{
         System.out.println("you are failed");
     }

     WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
     createNewAccount.click();
     Thread.sleep(1000);
     WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
     firstName.sendKeys("Khaliun");
     WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
     lastName.sendKeys("Batbayar");

    }
}
