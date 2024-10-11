package com.ecommerce.tests;

import com.ecommerce.base.BaseTest;
import com.ecommerce.pom.pages.HomePage;
import org.testng.annotations.Test;

public class endToEndTestTemp extends BaseTest {

    @Test
    public void testingWorkflow(){
        HomePage hp = new HomePage(driver);
        driver.findElement()
    }
}
