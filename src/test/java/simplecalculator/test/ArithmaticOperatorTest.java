package simplecalculator.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simplecalculator.ArithmeticOperator;

public class ArithmaticOperatorTest {

    SoftAssert softAssert = new SoftAssert();
   @Test(priority = 0)
    public void testSum(){
       System.out.println("**** First test case for cal sum **** ");
       System.out.println("First sum calculation");
       int actualValuesum1 = ArithmeticOperator.calSum(20,5);
      System.out.println("Actual Sum 1 value is:" + actualValuesum1);
      //Assert.assertEquals(actualValuesum1,25,"Faild to calc sum 1");
       softAssert.assertEquals(actualValuesum1,5,"Faild to calc sum 1");

      System.out.println("Second sum calcutation");
      int actualValueSum2 = ArithmeticOperator.calSum(10,20);
      System.out.println("Actual Sum 2 value is:" + actualValueSum2);
      // Assert.assertEquals(actualValueSum2,30,"Failed to calc sum2");
       softAssert.assertEquals(actualValueSum2,30,"Failed to calc sum2");


      System.out.println("Third sum calculator");
      int actualValueSum3 = ArithmeticOperator.calSum(4,8);
      System.out.println("Actual Sum 3 value is:" + actualValueSum3);
      //Assert.assertEquals(actualValueSum3,12,"Faild to calc sum 3");
       softAssert.assertEquals(actualValueSum3,12,"Faild to calc sum 3");

      System.out.println();
      System.out.println();
      softAssert.assertAll();
   }














}
