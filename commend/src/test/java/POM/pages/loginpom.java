package POM.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




@SuppressWarnings("unused")
public class loginpom {
	WebDriver driver;

	@FindBy(how = How.ID, using = "eud")
	public WebElement name;
	@FindBy(how = How.ID, using = "epd")
	public WebElement password;
	@FindBy(how = How.ID, using = "login")
	public WebElement Logi_btn;
	@FindBy(how = How.ID, using = "msglogin")
	public WebElement errormsg;
	/*Forgot-Password*/
	@FindBy(id = "fgpd")
	public WebElement forgot_password;
	@FindBy(id = "fgpd-confirm")
	public WebElement forgot_password_confrim; // msglogin
	@FindBy(id = "msglogin")
	public WebElement forgot_password_errorMsg;
	/*SignOut*/
	@FindBy( how=How.ID ,using = "signOutBtn")
	public WebElement sign_Out;
	@FindBy(xpath = "//a[@class=\"nav-link\" and @title='Profile' and @style = 'text-decoration-color:red']")
	public WebElement signOut_proceed;
	@FindBy(xpath = "/html/body/div[1]/div/div/div[2]")
	public WebElement  signout_Msg;
	/** SignUp**/
	@FindBy(id = "signUp")
	public WebElement Sign_Up;

	By signUP_email_address = By.id("ud");
	By signUP_user_name_fn = By.id("fn");
	By signUP_user_name_ln = By.id("ln");
	By signUP_title = By.id("utitle");
	By signUP_logon_ID = By.id("user-actual-id");
	By signUp_password = By.id("pd");
	By signUP_password_confirm = By.id("pd-again");
	By signUP_register= By.id("register");
	By signUP_error_message_1= By.id("message");
	By signUP_error_message_2= By.id("msg");
	By SignIn= By.id("signIn");
	By SignOut= By.id("signOutBtn");
	By SignOut_proceed= By.id("signOutProceed");
	
	
	public loginpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void name(String str) {

		name.sendKeys(str);
		System.out.println("Entering name");

	}

	public void password(String input) {

		password.sendKeys(input);
		System.out.println("Entering Password");

	}

	public void userName_Password_clr() {

		name.clear();
		password.clear();
		System.out.println("UserName and password is Cleared");

	}

	public void login_btn() {

		Logi_btn.click();
		System.out.println("Clicking login");

	}

	public void errormsg() {

		String error_msg = errormsg.getText();
		System.out.println(error_msg);

	}

	public void forgot_password() {

		forgot_password.click();
		System.out.println("Forgot button is clicked");

	}

	public void forgot_password_confirm() {

		forgot_password_confrim.click();
		System.out.println("Forgot button confirmed");

	}

	public void forgot_password_errorMsg() {

		String Forgot_password_error_msg = forgot_password_errorMsg.getText();
		System.out.println("Error Message:" + Forgot_password_error_msg);

	}

	public void Signout() {

		WebElement signout = driver.findElement(SignOut);
		WebElement signOut_proceed = driver.findElement(SignOut_proceed);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();", signout);
		JavascriptExecutor ex__1= (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();", signOut_proceed);
		System.out.println("Signed Out Successfully");
	}

	public void Signout_proceed() {
		signOut_proceed.click();
		System.out.println("Signed Out Successfully");
	}
	public void Signout_Msg() {
		String signOut_msg = signout_Msg.getText();
		System.out.println(signOut_msg);
	}
	public void Sign_Up() {
		Sign_Up.click();
	}
	public void SignIn() {
		driver.findElement(SignIn).click();
		System.out.println("SignIn Page of the application");
		
	}
	public void signup_emailAddress(String emailaddress) {
		driver.findElement(signUP_email_address).sendKeys(emailaddress);
		System.out.println("Entering Email address");
	}
	public void signup_emailAddress_clear() {
		driver.findElement(signUP_email_address).clear();
		System.out.println("Clearing Email address");
	}
	public void signUP_user_name_fn(String firstName) {
		WebElement fn = driver.findElement(signUP_user_name_fn);
		fn.sendKeys(firstName);
		System.out.println("Entering Firstname");
	}
	public void signUP_user_name_fn_clear() {
		 driver.findElement(signUP_user_name_fn).clear(); System.out.println("Clearing Firstname");
	}
	public void signUP_user_name_ln(String lastName) {
		WebElement ln = driver.findElement(signUP_user_name_ln);
		ln.sendKeys(lastName); System.out.println("Entering lastName");
	}
	public void signUP_user_name_ln_clear() {
		driver.findElement(signUP_user_name_ln).clear(); System.out.println("clearing lastName");
	}
	public void signUP_title(String title) {
		WebElement signUp_title = driver.findElement(signUP_title);
		signUp_title.sendKeys(title); System.out.println("Entering Title");
	}
	public void signUP_title_clear() {
		WebElement signUp_title = driver.findElement(signUP_title);
		signUp_title.clear(); System.out.println("Clearing Title");
	}
	public void signUP_logon_ID(String input) {
		WebElement signUp_logon_id = driver.findElement(signUP_logon_ID);
		signUp_logon_id.sendKeys(input); System.out.println("Entering LogonID");
	}
	public void signUP_logon_Id_clear() {
		WebElement signUp_logon_id = driver.findElement(signUP_logon_ID);
		signUp_logon_id.clear(); System.out.println("clearing LogonID");
	}
	public void signUp_password(String input) {
		WebElement signup_password = driver.findElement(signUp_password);
		signup_password.sendKeys(input); System.out.println("Entering Signup password");
	}
	public void signUp_password_clear() {
		WebElement signup_password = driver.findElement(signUp_password);
		signup_password.clear(); System.out.println("Clearing Signup password");
	}
	public void signUp_password_confirm(String input) {
		WebElement signup_password_confirm = driver.findElement(signUP_password_confirm);
		signup_password_confirm.sendKeys(input); System.out.println("Entering Signup password confirmation");
	}
	public void signUp_password_confirm_clr() {
		WebElement signup_password_confirm = driver.findElement(signUP_password_confirm);
		signup_password_confirm.clear(); System.out.println("Clearning Signup password confirmation");
	} 
	public void signUP_register() {
		WebElement register = driver.findElement(signUP_register);
		register.click(); System.out.println("Clicking Signup ");
	}
	public void signUP_error_message() {
		String error_msg = driver.findElement(signUP_error_message_1).getText();
		System.out.println("Password Error message" + error_msg );
		
	}
	public void signUP_alert_message() {
		String error_msg = driver.findElement(signUP_error_message_2).getText();
		System.out.println("User Error message" + error_msg );
		
	}
	

	
}

