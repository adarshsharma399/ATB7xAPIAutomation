package com.TheTestingAcademy.ex_21092024.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG010 {
    //alwaysRun- This testcase will always run even if previous ones are failed.
    @Test
    public void test01(){
        Assert.assertTrue(false);
    }
    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(false);
    }
    @Test(alwaysRun = true)
    public void test03(){
        Assert.assertTrue(true);
    }
}

//Parallel

//invocationCount** - How many times you want to run
//@Test(invocationCount = 5) // This will run the test method 5 times

//Data Driven

