package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Stepdefs {


static WebDriver driver;
	
	@Given("testMe App is launched")
	public void testme_App_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");

  		driver=new ChromeDriver();
  		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
	}

	@Then("click on the  SignUp link")
	public void click_on_the_SignUp_link() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		 driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		
	}

	@Then("enter username  {string}")
	public void enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string);
	}

	@Then("enter firstname  {string}")
	public void enter_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("firstName")).sendKeys(string);
		
	}

	@Then("enter lastname  {string}")
	public void enter_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("lastName")).sendKeys(string);
	}

	@Then("enter password  {string}")
	public void enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);
	}

	@Then("enter confirmpassword  {string}")
	public void enter_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		 driver.findElement(By .name("confirmPassword")).sendKeys(string);
	}

	@Then("enter Gender")
	public void enter_Gender() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	}

	@Then("enter email  {string}")
	public void enter_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("emailAddress")).sendKeys(string);
	}

	@Then("enter mobilenumber  {string}")
	public void enter_mobilenumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("mobileNumber")).sendKeys(string);
	}

	@Then("enter dob  {string}")
	public void enter_dob(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("dob")).sendKeys(string);
	}

	@Then("enter address  {string}")
	public void enter_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("address")).sendKeys(string);
	}
	@Then("enter the securityquestion")
	public void enter_the_securityquestion() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("Default");
	}

	@Then("enter answer  {string}")
	public void enter_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .name("answer")).sendKeys(string);
	}
	@Then("click on the  Register button")
	public void click_on_the_Register_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("Submit")).click();
	}

	@Then("verify registration status")
	public void verify_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 String actual="Available";
		 String s1=driver.findElement(By .xpath("//*[@id=\"err\"]")).getText();
		 System.out.println(s1);
	}

	@Given("user enters valid username in login page")
	public void user_enters_valid_username_in_login_page() {

		 
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
	}

	@Given("user enters corresponding password")
	public void user_enters_corresponding_password() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By .name("password")).sendKeys("password123");
	}

	@Given("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By .name("Login")).click();
	}

	@Then("verifie login status")
	public void verifie_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  String a=driver.findElement(By .linkText("SignOut")).getText();
		  System.out.println(a);
		  String b="SignOut";
		  Assert.assertEquals(a,b);
	}

	@Given("Search for  a product in search field")
	public void search_for_a_product_in_search_field() {
		
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/a/span")).click();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
		 
	}

	@Then("click on  finddetails")
	public void click_on_finddetails() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		System.out.println("Goes to product page");
	}

	@Then("Add to  cart")
	public void add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 //addtocart
		  driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  //cart
		  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
		
		  driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		 
		  driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
		
	}

	@Then("User  proceeds to payment")
	public void user_proceeds_to_payment() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		   //click on continue
		   driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
		   //username
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("123456");
		   //password
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Pass@456");
		   //login
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@Then("Continue  the payment process")
	public void continue_the_payment_process() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).click();
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		   //paynow
		   driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		   driver.close();
	}

	@Given("Alex  logins to TestMeApp")
	public void alex_logins_to_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By .name("userName")).sendKeys("lalitha");
		   driver.findElement(By .name("password")).sendKeys("password123");
		   driver.findElement(By .name("Login")).click();
		   driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys("Headphone");
		   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("Alex  search a product like headphone")
	public void alex_search_a_product_like_headphone() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		
	}

	@When("Try to  proceed for payment without adding any item to the cart")
	public void try_to_proceed_for_payment_without_adding_any_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 boolean ex=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).isDisplayed();
		 Assert.assertFalse(ex);
	}

	@Then("TestMe  does not show the cart icon")
	public void testme_does_not_show_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		  System.out.println("Waring: No cart option in the page");
	}








}
