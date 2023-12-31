package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	@FindBy(id="ap_email")
	public WebElement UserNameField; 
	
	@FindBy(id="continue")
	public WebElement continuebtn;
	
	@FindBy(id="ap_password")
	public WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	public WebElement submitbtn;
	
	public SignInPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void signIn()
	{
		UserNameField.sendKeys("8494819664");
		continuebtn.click();
		passwordField.sendKeys("8494819664");
		submitbtn.click();
	}
	
	
	
	
	
	//.findElement(By.id("ap_email")).sendKeys(prop.getProperty("UserName"));
	
	//driver.findElement(By.id("continue")).click();
	
	//driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty(null));
	
	//driver.findElement(By.id("signInSubmit")).click();
	
}
