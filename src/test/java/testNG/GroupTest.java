package testNG;

import org.testng.annotations.Test;

public class GroupTest {

    // S -> smoke test R-> Regression test

    @Test (groups = {"S","R"})
    public void test01(){
        System.out.println("This is smoke and Regression test case");
    }
    @Test(groups = {"R"})
    public void test02(){
        System.out.println("This is a Regression test case");
    }
    @Test
    public void test03(){
        System.out.println("This is smoke not Regression test case");
    }

    @Test(groups = {"S"})
    public void test04(){
        System.out.println("This is a smoke test case");
    }

    @Test (groups = {"S","R"})
    public void test05(){
        System.out.println("This is smoke and Regression test case");
    }













}
