package com.TheTestingAcademy.ex_21092024.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG007 {
    //Based on dependsOnMethods
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }
}
