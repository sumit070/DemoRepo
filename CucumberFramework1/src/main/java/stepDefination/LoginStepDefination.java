package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
//org.junit.Assert;
public class LoginStepDefination {


	WebDriver driver;
	
@Given("^user already on login page$")

public void user_already_on__login_page() {
	
	System.setProperty("webdriver.chrome.driver",
			"C://Users/user/Desktop/chromedriver_win32//chromedriver.exe");
	
	
	driver = new ChromeDriver();
	driver.get("https://freecrm.co.in/");
	}


@When("^title og login page is welcome$")

public void title_og_login_page_is_welcome(){
	
String title = driver.getTitle();
System.out.println(title);
Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);

}
@Then("^click on login button$")
public void click_on_login_button() {
	
//driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com/']")).click();

	WebElement loginButton =
			 driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com/']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginButton);
}

@Then("^user enter username and enter passsword$")
public void user_enter_username_and_enter_passsword() {
	
	driver.findElement(By.name("email")).sendKeys("sumitmishra0708@gmail.com");
    driver.findElement(By.name("password")).sendKeys("RAMjaishreeram");

}

@Then("^user click on login button$")
public void user_click_on_login_button() {
	
	WebElement loginBtn =
			 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
		 }
	

@Then("^user is on home page$")
public void user_is_on_home_page() {
	

	String title = driver.getTitle();
 System.out.println("Home Page title ::"+ title);
 Assert.assertEquals("CRMPRO", title);

}


}
