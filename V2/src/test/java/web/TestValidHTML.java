package web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;

public class TestValidHTML {
    private final String url = "https://fosscvbuilder.xyz/";
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.quit();
    }

    @Test
    public void TestIfHomeValid() {
        assertTrue(isValidHtml("/"));
    }



    public boolean isValidHtml(String page) {
        driver.get("https://validator.w3.org/#validate_by_uri+with_options");
        WebElement invulveld = driver.findElement(By.id("uri"));
        invulveld.sendKeys(url + page);
        Select dropdown = new Select(driver.findElement(By.id("uri-doctype")));
        dropdown.selectByValue("HTML5");
        WebElement button = driver.findElement(By.className("submit"));
        button.click();
        try
        {
            Thread.sleep(4000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        try {

            WebElement button2 = driver.findElements(By.className("message_filtering")).get(1);
            button2.click();
            System.out.println(button2.getText());
            WebElement button3 = driver.findElement(By.className("hide"));
            if(button3.getText().equals("Hide all warnings")) {
                button3.click();
            }
            else {
                System.out.println("Errors");
            }

        }
        catch(IndexOutOfBoundsException ex){

            try {
                WebElement pass = driver.findElement(By.cssSelector("p.success"));
                return pass.getText().equals("Document checking completed. No errors or warnings to show.");

            }catch(NoSuchElementException exx){
                return false;
            }
        }

        try {
            WebElement pass = driver.findElement(By.cssSelector("p.success"));
            return pass.getText().equals("Document checking completed. No errors or warnings to show.");

        }
        catch(NoSuchElementException ex){
            return false;
        }
    }

    private boolean containsWebElementsWithText(ArrayList<WebElement> elements, String text) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(text)) {
                return true;
            }
        }
        return false;
    }
}
