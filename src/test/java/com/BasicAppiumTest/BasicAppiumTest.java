package com.BasicAppiumTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.All_Screens.All_Screens;


public class BasicAppiumTest {

        private String userName = "vibhugp";
        private String accessKey = "02be297d-f7ce-47b9-978d-e078d7e9300d";

        public AndroidDriver<WebElement> driver;

        @BeforeTest
        public void setUp() throws MalformedURLException  {
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();

            desiredCapabilities.setCapability("appiumVersion","1.9.1");
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("platformVersion", "9.0");
            desiredCapabilities.setCapability("browserName", "");
            desiredCapabilities.setCapability("deviceName", "Samsung Galaxy S9 FHD GoogleAPI Emulator");
            desiredCapabilities.setCapability("app", "sauce-storage:genius-plaza-prod.apk");
            desiredCapabilities.setCapability("name", "Smoke_Test_Cases");
            desiredCapabilities.setCapability("tags", "Spark");
            desiredCapabilities.setCapability("build", "Genius_Plaza_Spark_Android");
            desiredCapabilities.setCapability("deviceOrientation", "portrait");
            desiredCapabilities.setCapability("unicodeKeyboard", "true");
            desiredCapabilities.setCapability("resetKeyboard", "true");


            // for live test desiredCapabilities.setCapability("testobject_api_key", "10D4E9875B304A27BE4B7D9E94670780");
            // for live test desiredCapabilities.setCapability("app", "genius-plaza-prod.apk");
           // for live test desiredCapabilities.setCapability("testobject_app_id", "2");
            // for live test desiredCapabilities.setCapability("testobject_suite_name", "GP_Android_Spark(vaibhav)");
            // for live test desiredCapabilities.setCapability("testobject_suite_name", "GP_Android_Spark(vaibhav)");

            desiredCapabilities.setCapability("appPackage", "com.geniusplaza.core_android");
            desiredCapabilities.setCapability("appActivity", "com.geniusplaza.core_android.v3.splashscreen.SplashScreenActivity");
            //URL remoteUrl = new URL("http://localhost:4723/wd/hub");


            URL remoteUrl = new URL("http://"+userName+":"+accessKey+"@ondemand.saucelabs.com:80/wd/hub");

            // URL remoteUrl = new URL("https://us1-manual.app.testobject.com/wd/hub");

            //driver = new AndroidDriver<WebElement>(remoteUrl, desiredCapabilities);

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);




        }

        @Test
        public void alogin() throws InterruptedException{

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            Thread.sleep(5000);
            All_Screens.loginButton(driver).click();
            All_Screens.userName(driver).sendKeys("vibhu");
            All_Screens.password(driver).sendKeys("0711");
            All_Screens.loginButtonSubmit(driver).click();
            All_Screens.avatar(driver).click();
            All_Screens.logoutOption(driver).click();
            All_Screens.logoutConfirmPopupOK(driver).click();
            System.out.println("User Successfully Logged Out");

            Thread.sleep(5000);

        }


    @Test
    public void create_class() throws InterruptedException{
        All_Screens.userName(driver).sendKeys("vibhu");
        All_Screens.password(driver).sendKeys("0711");
        All_Screens.loginButtonSubmit(driver).click();
        All_Screens.createIcon(driver).click();
        All_Screens.addClass(driver).click();
        All_Screens.selectAddOption(driver).click();
        All_Screens.selectAddOptionNext(driver).click();
        All_Screens.enterClassName(driver).sendKeys("genius16");
        All_Screens.selectClassType(driver).click();
        All_Screens.clickSelectClassType(driver).click();
        All_Screens.addClassSubmit(driver).click();
        Thread.sleep(2000);
        All_Screens.classCreatedOk(driver).click();
        All_Screens.addStudent(driver).click();
        All_Screens.studentFirstName(driver).sendKeys("geniusstudent16");
        All_Screens.studentLastName(driver).sendKeys("spark");
        All_Screens.selectGradeDrop(driver).click();
        All_Screens.selectGrade(driver).click();
        All_Screens.saveStudent(driver).click();
        All_Screens.studentRegisterSuccess(driver).click();
        All_Screens.myStudentDoneButton(driver).click();
        Thread.sleep(2000);
        System.out.println("Class create successfully");
        System.out.println("Student added successfully");




    }



        @AfterTest
        public void tearDown() {
            driver.quit();
        }



}
