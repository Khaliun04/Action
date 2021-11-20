package SlelniumMentoringAhmet.SeleniumInterview;

public class InterviewQ {
    /*
    1) What are the advantage and disadvantages of Selenium?
       Advantages: * Free open sources
                   * It support multiple language
                   * support multiple browser
                   * Big community
       Disadvantages: * Selenium can't automate by captcha, picture, finger print etc
                      * There is not direct call for the selenium since it is open-source
                      * It only automates the web app.

    2) What types of testing are you automate with Selenium?
       * Smoke test
       * Regression test
       * Functional test

    3) What are the test types we do not automate with Selenium?
       * Performance Testing
       * Manual Testing(ad Hoc-Monkey Testing)
       * Load Testing
       * Stress Testing

    4) What is the locator and what are the locator types?
       Locator is way of the finding the web element in the DOM.LOCATOR. The types are:
        * XPATH
        * ID
        * TAGNAME
        * NAME
        * CLASSNAME
        * PARTIALLINKTEXT
        * LINKTEXT
        * CSS

     5) How do you handle dynamic elements?
        I faced many dynamic elements and I used different way to handle with
         * I used parent-child-sibling(Xpath) to locate the elements
         * I went with different ATTRIBUTE to locate elements

     6) Difference between close() and quit()?
        CLOSE: It specifically closes the window that you are currently working on.
        QUIT: It specifically closes the whole browser. It means it closes all of the windows

     7) Difference between navigate to () and get() ?
        NAVIGATE: * It doesn't wait web elements(page) to be loaded
                  * It has some methods(forward, back, refresh)
        GET: * It waits web elements(page) to be loaded
             * It doesn't have some methods

     8) What is the xpath?
        * Xpath is used to find location of the elements on a webpage using HTML structure
        * There are two types of Xpath:
          - Absolute: it goes from parent to child and start with one slash
          - Relative: It goes to directly to the element locator and it is start with two slash
     9) How to handle static drop down menus?
        I would definitely check the tag of the location.
        * If the tag is Selected --> I used "Select class" ---> Select select = new Select(webElement)
        * If tag is not select --> I use locators to locate the elements
        * I can also use ACTIONS CLASS to handle the drop downs. *****(movetoElements())

    10) What are the methods of the Select?
        Select class is really useful to locate the elements
        * SelectByIndex
        * SelectByVisibleText
        * SelectByValue

    11) What kind of exception did you face in Selenium?
        * NoSuchElementException
        * StaleElementReferenceException
        * NoSuchWindowException
        * NoSuchFrameException

    12) In what condition do you get StaleElementReferenceException?
        * Once the element is not there anymore
        * Navigate to the another page
         ********* I can handle with (refreshing the website or reinitiliaze the driver)

   13) How do you handle Alert?
       * Operation System Alert: I can't handle it directly. I need to use Robot class to handle it.
       * HTML Alert: I just need to find the element and click the button.
       * JavaScript(Browser) Alert: I use to the Alert interface

   14) For the Alert interface what kind of methods do you know?
       * Alert alert = driver.switchTo.Alert();
         - alert.dismiss(); --> cancel
         - alert.accept(); --> ok
         - alert.sendkey();
         - alert.getText();

   15) What do you know about iframe(Frame)? Can you tell me the type that you used before?
       * iframe is the HTML inside of the another HTML

       Different Types: Here is the scenario we have a website and I would like to get text of
       print from products. All xpath is correct and there is no problem with attribute as well.
       But I can't get it. What do you think the reason could be?
       * There are could be many reasons but first I will first search the iframe.

       How do you handle the iframe?
       * driver.switchto().frame()
       ******* driver.switch().defaultContent()*******
       * driver.switchto().frame()
       * if you have multiple iframe into each other. Then I should use
       * driver.switchto.ParentFrame().

  16) What do you know about Actions class ?
      * Actions class is really useful to handle same issues in my project since I use same actions
        class methods. Same of the important ones are:
        - contextClick(rightClick)
        - doubleclick()
        - dragANdDrop()
        - click()
        - moveToElement()
        - clickAndHold()

       Actions actions = new Actions(driver)
       * every time when I call the actions class method after that I must call perform() method otherwise
         code will not execute

 17) Find Element and Find Elements?
     * Find Element return web element
       Once the element is not found ** it throws the NoSuchElementException
     * Find Elements return list of the element
       Once the elements is not found ** it throws the any exception but it is return EMPTY LIST

 18) Different between isDisplayed? isEnable? and isSelected?
     The method start with "is" that means the boolean
     * isDisplayed --> it displayed the element and it is VISIBLE or NOT
     * isEnabled --> the element is ENABLED or NOT
     * isSelected --> the element is SELECTED or NOT

 19) What is the difference between check box and radio button?
     * Selected and checkbox mentality is similarly but the difference is you can only choose one radio
       button option
     * For the selected you can choose as many as you want.

 20) How do you switch the windows from one to another?
     * I switch the window by using by switchto() method whitch is driver.switchTo().window(id);
       String mainWindow = driver.getWindowHandle() --> it returns String "id"
       Set<String> ids = driver.getWindowHandles() --> it returns the set of the ids

       for(String id : ids){
       driver.switchto().window(id)
       if(!driver.getTitle.equals(ebayPage))
       }


 21) How do you switch the multiple windows from one to another?








     */
}
