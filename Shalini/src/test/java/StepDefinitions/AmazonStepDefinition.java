package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.YourAccountPage;
import PageObjects.YourAdressPage;
import TestBase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinition extends Base {
	
	@Given("User opens browsew and application")
	public void user_opens_browsew_and_application() {
		Base.Set_up();
	}

	@Given("User login into application")
	public void user_login_into_application() {
	    HomePage homepage=new HomePage(driver);
	    SignInPage Signinpage=new SignInPage(driver);
	    homepage.navigatetosignin();
	    Signinpage.signIn();
	}
	@When("User navigates to your account page")
	public void user_navigates_to_your_account_page() {
		HomePage homepage=new HomePage(driver);
		homepage.navigateToYourAccount();
	}

	@When("User navigates to your address page")
	public void user_navigates_to_your_address_page() {
		 YourAccountPage youraccontpage=new YourAccountPage(driver);
		 youraccontpage.navigateToYourSddress();
	}

	@When("User navigated to add address page")
	public void user_navigated_to_add_address_page() {
		 YourAdressPage youraddresspage=new YourAdressPage(driver);
		 youraddresspage.navigatToEditAddress();
	}
	@Then("Enter address and submit")
	public void enter_address_and_submit() {
	  }

	@Then("Validate address")
	public void validate_address() {
	    }
	
	@Given("User opens browser and application")
	public void user_opens_browser_and_application() {
	   
	}
	
	@When("User navigated to Edit address page")
	public void user_navigated_to_edit_address_page() {
		 YourAdressPage youraddresspage=new YourAdressPage(driver);
		 youraddresspage.navigatToEditAddress();
	}
	
	@Then("update address and submit")
	public void update_address_and_submit() {
	    
	}

}
