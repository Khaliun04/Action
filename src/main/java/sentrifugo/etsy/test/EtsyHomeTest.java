package sentrifugo.etsy.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import sentrifugo.etsy.TestBase;
import sentrifugo.etsy.page.EtsyHomePage;

public class EtsyHomeTest extends TestBase {

    @Test
    public void test(){
        EtsyHomePage homePage = new EtsyHomePage(driver);
        homePage.searchItem("java programming mug");
        Assert.assertTrue(homePage.validateTitle());
    }
}
