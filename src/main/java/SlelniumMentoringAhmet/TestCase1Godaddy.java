package SlelniumMentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Godaddy {
    // Assing


    public static void main(String[] args) {

        //What is the function of webdriver?
        //Webdriver is a way of manipulating(changing) the web browser
        // What is the firefox driver?
        // Firefox is the gechko driver
        //What is the differnce between navigate to and get?
        //get: It wait for all elements to be loaded on the website
        //navigate: IT WILL WAIT FOR SPECIFIC ELEMENT THAT YOU ARE LOOKING FOR
                  //IT HAS ALSO SOME METHOD LIKE FORWARD, REFERESH, BACK ETC.....
        //What is the difference between close and quit
        //Quit will close the driver(it means all of the web browser
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.godaddy.com/");
        //Suggestion: if you put all the elements location correct and still they are not working, make the web browser full screen
        //2. : put the thread.sleep()
        driver.manage().window().maximize();
        driver.close();

    }
}
