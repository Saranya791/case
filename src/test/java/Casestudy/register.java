package Casestudy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class register {
	WebDriver driver;
	@Given("application is launch by guest user")
	public void application_is_launch_by_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Driver.configureDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://demowebshop.tricentis.com/");
	}

	@When("user clicks on register link available")
	public void user_clicks_on_register_link_available() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@href='/register']")).click();
	}

	@When("provides the required data such as {string} and {string} and {string} and {string} and {string} and {string}")
	public void provides_the_required_data_such_as_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		if(string.equals("Male")) {
			driver.findElement(By.xpath("//input[@value='M']")).click();
		}
		else if(string.equals("Female")) {
			driver.findElement(By.xpath("//input[@value='F']")).click();
		}
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(string3);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(string4);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(string5);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(string6);
	}

	@Then("user clicks on register button")
	public void user_clicks_on_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
	}
	

@Given("I will check on Login")
public void i_will_check_on_Login() {
	driver=Driver.configureDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
 driver.findElement(By.xpath("//a[@href='/login']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("I enter username {string} and password {string}")
public void i_enter_username_and_password(String email, String password) {
 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("click on submit button")
public void click_on_submit_button() {
 driver.findElement(By.xpath("//input[@value='Log in']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("User searches for the item")
public void user_searches_for_the_item() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
	//driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
	//Actions action=new Actions(driver);
	//WebElement cart=driver.findElement(By.xpath("//input[@id='myInput']"));
	//cart.sendKeys("l");cart.sendKeys("a");cart.sendKeys("p");cart.sendKeys("t");cart.sendKeys("o");cart.sendKeys("p");
	//Thread.sleep(3000); 
	//action.sendKeys(Keys.ARROW_DOWN).click();
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	driver.findElement(By.xpath("//a[@href='/fiction']")).click();
	
	
	
}

@Given("clicks on add to cart")
public void clicks_on_add_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
}


@Given("registered into app")
public void registered_into_app() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 //driver=utility.configureDriver("chrome");
  // driver.manage().window().maximize();
  // driver.get("http://demowebshop.tricentis.com/");
   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hujimuri@gmail.com");
  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("hujimuriz");
  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
}

@When("search a particular item like headphones")
public void search_a_particular_item_like_headphones() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
 search.sendKeys("j");
 search.sendKeys("e");
 search.sendKeys("w");
 search.sendKeys("e");
 //Actions act=new Actions(driver);
 //act.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]"))).click().build().perform();
 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
}

@When("try to proceed without adding any item to the cart")
public void try_to_proceed_without_adding_any_item_to_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
}

@Then("app doesnot display payement method")
public void app_doesnot_display_payement_method() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 String msg=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div[2]/div[2]/div")).getText();
 Assert.assertEquals(msg, "Your Shopping Cart is empty!");
 
 driver.close();
}

}
