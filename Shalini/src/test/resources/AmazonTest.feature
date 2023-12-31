@AmazonTest
Feature:  Amazon

@AddAddress
Scenario:Validate Add Address Functionality
Given User opens browsew and application
Given User login into application
When User navigates to your account page
When User navigates to your address page
When User navigated to add address page
Then Enter address and submit
Then Validate address


@Editaddress
Scenario: Validate Edit Address Functionality
Given User opens browser and application
Given User login into application
When User navigates to your account page
When User navigates to your address page
When User navigated to Edit address page
Then update address and submit

