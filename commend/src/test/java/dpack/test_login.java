package dpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


@Test(priority = 1, description = "Search Module")
public class test_login {

	

	WebDriver driver;
	public void BaseValidLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1925566\\Downloads\\selenium_automation_Browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.navigate().to("https://10.11.144.178:8107/home/login/1");;
		driver.manage().window().maximize();
		driver.findElement(By.id("eud")).sendKeys("1999002");
		driver.findElement(By.id("epd")).sendKeys("Tcs#1234");
		driver.findElement(By.id("login")).click();
	}
}
