package SlelniumMentoringAhmet;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase2GoDaddy {
//    Test Case 2 - Open Godaddy.com and Print it's Page title.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//4. Get Title of page and print it.
//4. Get URL of current page and print it.
//            5. Close browser.

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.godaddy.com/");
        // What is the driver and element methods?
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        if(driver.getTitle().equals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy")){
            System.out.println("your test is passed");
        }else{
            System.out.println("your test is failed");
        }
        driver.close();
    }
}

