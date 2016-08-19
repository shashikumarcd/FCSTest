package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
    
    WebDriver driver;
    @Given("^Open firefox and start application$")
    public void Open_firefox_and_start_application() throws Throwable {
        driver = new FirefoxDriver();
        driver.get("https://www.google.co.in");
        
       
    }

    @When("^Correct URL$")
    public void Correct_URL() throws Throwable {
       driver.findElement(By.id("lst-ib")).sendKeys("selenium");
    }

    @Then("^Launch Application$")
    public void Launch_Application() throws Throwable {
        driver.findElement(By.name("btnG")).click();
       
    }



}
