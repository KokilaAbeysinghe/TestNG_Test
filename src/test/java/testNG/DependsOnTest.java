package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnTest {

    @Test()
    public void oLevel(){
        System.out.println("OL");
        //Assert.fail();
    }

    @Test(dependsOnMethods = "oLevel")
    public void aLevel(){
        System.out.println("AL");
    }

    @Test(dependsOnMethods = {"oLevel","aLevel"},alwaysRun = true)
    public void campus() {
        System.out.println("Campus");

    }
}
