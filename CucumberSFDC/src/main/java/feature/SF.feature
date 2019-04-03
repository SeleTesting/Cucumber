

Feature: Salesforce Apllication 

  Scenario: SFDC login scenario
    Given when user is on login homepage1
    When user enters username and password
    And  clicks on login button
    Then user will be on home page
    

   
  Scenario:  Create Account TC11
Given when user is on homepage2
When Click on the Accounts Tab 
Then click create new button 
And fill form and click save button
And Account name should be created

Scenario: Edit Account TC12
Given when user is on login homepage3
When Click on the Accounts Tab1 
And Select view name from dropdown
And Click on Edit and make changes and save
Then newly added details sould be displayed

Scenario: SFDC opotunities dropdown scenario TC15
    Given when user is on homepage4
    When click on opportunities Tab
    And  click on opprotunities dropdown 
    Then verify elements
    
