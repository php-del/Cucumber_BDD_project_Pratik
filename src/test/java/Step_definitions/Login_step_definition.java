package Step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_step_definition {
    WebDriver driver;

    @Given("I launch the browser")
    public void i_launch_the_browser() {
        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        driver = new ChromeDriver();

    }

    @When("I login to the Guru {int} bank with valid credentials")
    public void i_login_to_the_guru_bank_with_valid_credentials(Integer int1) {
        driver.get("https://www.demo.guru99.com/V4/index.php");
        driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("mngr383534");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("etAquzu");
        driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
    }

    @Then("Proper page title of home page should be displayed")
    public void proper_page_title_of_home_page_should_be_displayed() {
        Assert.assertEquals("Guru99 Bank Manager HomePage", driver.getTitle());
    }

    @Then("Close the browser instance")
    public void close_the_browser_instance() {
        driver.quit();
    }

    @When("I try to login using invalid credentials as {string} and {string}")
    public void iTryToLoginUsingInvalidCredentialsAsAnd(String uid, String passwd) {
        driver.get("https://www.demo.guru99.com/V4/index.php");
        driver.findElement(By.xpath("//*[@name='uid']")).sendKeys(uid);
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(passwd);
        driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
    }

    @Then("An error is given")
    public void anErrorIsGiven() throws Exception {
        String sp=driver.switchTo().alert().getText();
        Assert.assertEquals("User or Password is not valid",sp);
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }


}

