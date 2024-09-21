package com.TheTestingAcademy.ex_21092024.testngexamples;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNG001 {
    //Allure Reporting
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that true == true")
    @Test
    public void testcase01(){
        Assert.assertEquals(true, true);
        System.out.println("TestCase1");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that true != true")
    @Test
    public void testcase02(){
        Assert.assertEquals(true, false);
        System.out.println("TestCase2");
    }
}


// How to Add the Allure report to the Project?**
//
//        1. Make sure that NodeJS installed - [﻿nodejs.org/en/download/prebuilt-installer](https://nodejs.org/en/download/prebuilt-installer)
//        2. Run the command on the cmd:  npm i -g allure-commandline
//        3. https://www.npmjs.com/package/allure-commandline
//        4. Navigate - https://mvnrepository.com/artifact/io.qameta.allure/allure-testng/2.29.0
//        5. Copy the code and put in the pom.xml file.
//        6. allure serve allure-results/
