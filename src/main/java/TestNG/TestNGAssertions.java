package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

    //create the one method that 2 parameter as an Integer
    //and return multiplication of the these two number
    public int multi(int a, int b){
        return a*b;
    }
    //-2 * 4 = 8
    // 2 * 0 = 0
    // 3 * 2 = 6
    // -2 * - 5 = 10
    @Test
    public void validateMulti(){
        int result = multi(-2,4);
        int expected = -8;
        Assert.assertEquals(result,expected,"it is for -2 and 4");
    }
    @Test
    public void validateZero(){
        int result = multi(3,0);
        int expected = 0;
        Assert.assertEquals(result,expected,"it is for 3 and 0");
    }
    @Test
    public void validatePositive(){
        int result = multi(2,3);
        Assert.assertTrue(result==6,"false");
    }
    @Test
    public void valdateNegative(){
        int result = multi(-2, -3);
        int expected = 6;
        Assert.assertEquals(result,expected);
        //This is called hard Assertion
        System.out.println("Negative test");
    }
    @Test
    public void valdateNegative1(){
        int result = multi(-2, -3);
       Assert.assertFalse(result==5);
    }
}
