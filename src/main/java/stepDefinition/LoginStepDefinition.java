package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^launch the url$")
	public void launch_the_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD_Workspace\\HopscotchBDDFramework\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.qa.hopscotch.in/");
		driver.manage().window().maximize();
	}

	@When("^user verifies title of the login page$")
	public void title_of_the_login_page() throws InterruptedException {
		String expectedTitle = driver.getTitle();
		String actualTitle = "Kids Wear | Buy Kids Clothes Online in India";
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("we have successfully launched the hopscotch landing page");
	}

	@Then("^user clicks on account button$")
	public void user_clicks_on_account_button() {
		driver.findElement(By.xpath("//a[contains(@href,'Account')]")).click();
		String expectedTitleLoginPage = driver.getTitle();
		String actualTitleLoginPage = "Kids Fashion Online | Baby Products Online in India at Hopscotch.in";
		Assert.assertEquals(expectedTitleLoginPage, actualTitleLoginPage);
		System.out.println("we are on the exact login page");
		driver.close();
		
	}
	
}
