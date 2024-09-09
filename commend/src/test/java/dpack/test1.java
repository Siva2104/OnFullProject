package dpack;
import  org.openqa.selenium.interactions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

	WebDriver driver;
	@Test
	  public void f() {

	  }
	  @BeforeClass
	  public void BeforeClass() {
	    System.out.println("before class ");
	  }
	  @AfterClass
	  public void Afterclass() {
	    System.out.println("After class ");
	  }
	  @BeforeMethod
	  public void login() {
		  System.out.println("Login Browser");

	  }

	  @AfterMethod
	  public void logout() {
	    System.out.println("logout browser");
	  }

}
