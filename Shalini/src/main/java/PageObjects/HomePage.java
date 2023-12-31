package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")
	public WebElement AccountandList;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")
	public WebElement AccoundandLinkList;
	
	public HomePage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void navigatetosignin()
	{
		AccountandList.click();
	}
	
	public void navigateToYourAccount()
	{
		AccoundandLinkList.click();
	}
	
	
}
