package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsintro {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/khaliun/Desktop/Techtorial.html");

        WebElement header = driver.findElement(By.id("techtorial1"));

        String hdr = header.getText();
        String expected = "Techtorial Academy";

      if(hdr.equals(expected)){
          System.out.println("true");
      }else{
          System.out.println("false");
      }

      WebElement checkBoxTitle = driver.findElement(By.className("group_checkbox"));

      String actTitle = checkBoxTitle.getText();
      String expectedTitle = "All Tools";
      if(actTitle.equals(expectedTitle)){
          System.out.println(true);
      }else {
          System.out.println(false);
      }
      WebElement fName = driver.findElement(By.name("firstName"));
        WebElement lName = driver.findElement(By.name("lastName"));
        WebElement phone = driver.findElement(By.name("phone"));
        WebElement email = driver.findElement(By.name("userName"));

        fName.sendKeys("David");
        lName.sendKeys("Turan");
        phone.sendKeys("2345673345");
        email.sendKeys("tr@gmail.com");

        //store webelement for check boxes --> Java, Selenium, TestNg and Cucember

        WebElement java = driver.findElement(By.id("cond1"));
        WebElement Selenium = driver.findElement(By.id("cond2"));
        WebElement TestNG = driver.findElement(By.id("cond3"));
        WebElement Cucumber = driver.findElement(By.id("cond4"));

        java.click();
        System.out.println(java.isSelected());//true
        System.out.println(TestNG.isSelected());//false
        System.out.println(Cucumber.isDisplayed());//it will return true since cucumber element is displayed on the page

    }
}
