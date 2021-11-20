package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement checkBox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        checkBox.click();
        WebElement arrowHome = driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        arrowHome.click();
        WebElement arrowDesktop = driver.findElement(By.xpath("//li[.='Desktop']/span/button"));
        arrowDesktop.click();
        WebElement arrowDownload = driver.findElement(By.xpath("//li[.='Downloads']/span/button"));
        arrowDownload.click();
        WebElement arrowDocuments = driver.findElement(By.xpath("//li[.='Documents']/span/button"));
        arrowDocuments.click();
        WebElement office = driver.findElement(By.xpath("//label/span[.='Office']"));
        System.out.println(office.getText());
        //Task: Click to the download arrow
    }
}
