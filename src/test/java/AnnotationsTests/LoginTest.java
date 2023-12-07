package AnnotationsTests;

import AnnotationsBase.BaseTest;
import org.testng.annotations.BeforeMethod;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.navigate().to("https://practicetestautomation.com/");
    }



}
