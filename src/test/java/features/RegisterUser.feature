Feature: Register User and Delete account

 Scenario:
    Given Launch browser
    And Navigate to url
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    And Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter
    And Select checkbox Receive special offers from our partners
    And First name, Last name, Company, Addresss, Country, State, City, Zipcode, Mobile Number
    And Click 'Create Account button
    And Verify that ACCOUNT CREATED is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED is visible and click continue button





