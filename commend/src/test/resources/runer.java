package src.commend;

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

		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\selenium_automation_Browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("https://10.11.144.178:8107/home/login/1/");
		driver.manage().window().maximize();
		driver.findElement(By.id("eud")).sendKeys("1999002");
		driver.findElement(By.id("epd")).sendKeys("Tcs#1234");
		driver.findElement(By.id("login")).click();
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
