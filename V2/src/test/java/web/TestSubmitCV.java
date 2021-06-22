package web;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSubmitCV{

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.get("https://fosscvbuilder.xyz/");

    }

    @After
    public void shutdown() {

        driver.quit();
    }

    @Test
    public void test_If_CV_Form_Submits_To_Page_By_Title() {
        driver.get("https://fosscvbuilder.xyz/");
        WebElement button = driver.findElement(By.name("submit"));
        button.click();
        assertEquals("Your CV", driver.getTitle());
    }



}