package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAdressPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='ya-myab-plus-address-icon']")
	public WebElement AddAddress;
	
	@FindBy(id="ya-myab-address-edit-btn-0")
	public WebElement EditAddress; 
	
	@FindBy(id="ya-myab-address-delete-btn-0")
	public WebElement RemoveAddress;
	
	public YourAdressPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
			

	
	public void navigateToAddAddress() 
	{
		AddAddress.click();
	}
	public void navigatToEditAddress()
	{
		EditAddress.click();
	}
	public void RemoveAddress()
	{
		RemoveAddress.click();
	}
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"ya-myab-plus-address-icon\"]")).click();
	
}
