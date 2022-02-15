package Step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifymngrid {

    public WebDriver driver;

    @Given("I launch the browser and login with valid credentials")
    public void iLaunchTheBrowserAndLoginWithValidCredentials() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/index.php");
        driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr383534");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("etAquzu");
        driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
    }

    @Then("The manager ID should match in the welcome greeting")
    public void theManagerIDShouldMatchInTheWelcomeGreeting() {
        String rp=driver.findElement(By.xpath("//*[contains(text(),'Manger')]")).getText();
        Assert.assertEquals("Manger Id : mngr383534",rp);

    }


    @And("Close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }
}
