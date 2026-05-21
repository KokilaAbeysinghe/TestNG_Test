package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
    SoftAssert softAssert = new SoftAssert();
    String actualValue ="Harith";

    @Test (priority = 0)
    public void valuesEqualCheck(){
        String expectedValue ="Harith";
        //String expectedValue ="Harith123"; -> Hard assertion
        System.out.println("Prior to valuesEqualCheck assertion");
        //Assert.assertEquals(actualValue,expectedValue,"Values miss matched");
        softAssert.assertEquals(actualValue,expectedValue,"Values miss matched");
        System.out.println("After valuesEqualCheck assertion");
        softAssert.assertAll();
    }
    @Test (priority = 1)
    public void valuesNotEqualCheck(){
        String expectedValue ="Learn well";
        System.out.println("Prior to valuesNotEqualCheck assertion");
        //Assert.assertNotEquals(actualValue,expectedValue,"Values matched");
        softAssert.assertNotEquals(actualValue,expectedValue,"Values matched");
        System.out.println("After valuesNotEqualCheck assertion");
    }

    @Test (priority = 2)
    public void trueConditionCheck(){

        System.out.println("Prior to trueConditionCheck assertion");
        //Assert.assertTrue(actualValue.startsWith("H"),"Condition return a False");
        softAssert.assertTrue(actualValue.startsWith("H"),"Condition return a False");
        System.out.println("After trueConditionCheck assertion");
    }
    @Test (priority = 3)
    public void falseConditionCheck(){

        System.out.println("Prior to falseConditionCheck assertion");
        //Assert.assertFalse(actualValue.isBlank(),"Condition return a true");
        softAssert.assertFalse(actualValue.isBlank(),"Condition return a true");
        System.out.println("After falseConditionCheck assertion");
    }
}
