package com.TheTestingAcademy.ex_21092024.testngexamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG008 {
    //Based on Parameters

    @Parameters("browser")
    @Test
    void demo1(String value){
        System.out.println("Browser is " +value);
        // Open the Browser and select dadadada

    }

}
