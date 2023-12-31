package TestCases;


import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.YourAccountPage;
import PageObjects.YourAdressPage;
import TestBase.Base;

public class EditAddress extends Base {

	@Test
	public void editAddress() {
		
		Base.Set_up();
			
		HomePage homepage=new HomePage(driver);
	    SignInPage Signinpage=new SignInPage(driver);
	    YourAccountPage youraccontpage=new YourAccountPage(driver);
	    YourAdressPage youraddresspage=new YourAdressPage(driver);
	    
	    homepage.navigatetosignin();
	    Signinpage.signIn();
	    homepage.navigateToYourAccount();
	    youraccontpage.navigateToYourSddress();
	    youraddresspage.navigatToEditAddress();
	    
	    
			
			
			
		}
		
		 
		      
	
	}
	
	
	


