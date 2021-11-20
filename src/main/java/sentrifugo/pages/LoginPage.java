package sentrifugo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;


public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        //it will initialize the element that we stored inside this class
    }
   @FindBy(id = "username")
    WebElement username;
   @FindBy(name = "password")
    WebElement password;
   @FindBy(xpath = "//input[@id='loginsubmit']")
    WebElement loginButton;

   public void login(String username, String password){
       this.username.sendKeys(username);
       this.password.sendKeys(password);
       this.loginButton.click();
   }
   public void inValidLogin(){
       this.loginButton.click();
   }
   @FindBy(id="usernameerror")
    WebElement usernameerror;

   @FindBy(id="pwderror")
    WebElement pwderror;

    public String invalidUserNameText(){
        return BrowserUtils.getText(usernameerror) ;
    }
    public String invalidpwdMessage(){
        return BrowserUtils.getText(pwderror) ;
    }

}
