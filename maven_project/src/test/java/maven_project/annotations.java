package maven_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class annotations {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1925566\\Downloads\\selenium_automation_Browsers\\chromedriver-win64\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("disable-popup-blocking");
	       options.addArguments("start-maximized");
	       options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.get("https://10.11.144.178:8010/Home/Login/0");
		driver.manage().window().maximize();
		System.out.println("BeforeTest Executed");
	}
 
	@BeforeClass
	public void titleTest(){
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		System.out.println("BeforeClass Executed");
	}
	@Test
	@Parameters({"username","password"})
	public void logintest(String uname, String pswd) throws InterruptedException, IOException {
		driver.findElement(By.id("eud")).sendKeys(uname);
		driver.findElement(By.id("epd")).sendKeys(pswd);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		System.out.println("Login Passed");
		
		//screenShot
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\1925566\\eclipse-workspace\\maven_project\\src\\test\\resources\\scr.png");
		FileUtils.copyFile(srcFile, DestFile);
		
		
	}

}
