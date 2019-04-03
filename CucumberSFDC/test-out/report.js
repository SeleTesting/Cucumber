$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SF.feature");
formatter.feature({
  "line": 3,
  "name": "Salesforce Apllication",
  "description": "",
  "id": "salesforce-apllication",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "SFDC login scenario",
  "description": "",
  "id": "salesforce-apllication;sfdc-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "when user is on login homepage1",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user will be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.when_user_is_on_login_homepage1()"
});
formatter.result({
  "duration": 5346024297,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 351854392,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "duration": 962991756,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_will_be_on_home_page()"
});
formatter.result({
  "duration": 9010280858,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Create Account TC11",
  "description": "",
  "id": "salesforce-apllication;create-account-tc11",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "when user is on homepage2",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Click on the Accounts Tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click create new button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "fill form and click save button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Account name should be created",
  "keyword": "And "
});
formatter.match({
  "location": "TC11.when_user_is_on_homepage2()"
});
formatter.result({
  "duration": 4258770544,
  "status": "passed"
});
formatter.match({
  "location": "TC11.click_on_the_Accounts_Tab()"
});
formatter.result({
  "duration": 4898444605,
  "status": "passed"
});
formatter.match({
  "location": "TC11.click_create_new_button()"
});
formatter.result({
  "duration": 456173025,
  "status": "passed"
});
formatter.match({
  "location": "TC11.fill_form_and_click__save_button()"
});
formatter.result({
  "duration": 803630503,
  "status": "passed"
});
formatter.match({
  "location": "TC11.account_name_should_be_created()"
});
formatter.result({
  "duration": 234841261,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Edit Account TC12",
  "description": "",
  "id": "salesforce-apllication;edit-account-tc12",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "when user is on login homepage3",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Click on the Accounts Tab1",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Select view name from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on Edit and make changes and save",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "newly added details sould be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TC12.when_user_is_on_login_homepage3()"
});
formatter.result({
  "duration": 8244133415,
  "status": "passed"
});
formatter.match({
  "location": "TC12.Click_on_the_Accounts_Tab1()"
});
formatter.result({
  "duration": 6569388322,
  "status": "passed"
});
formatter.match({
  "location": "TC12.Select_view_name_from_dropdown()"
});
formatter.result({
  "duration": 52662985,
  "status": "passed"
});
formatter.match({
  "location": "TC12.Click_on_Edit_and_make_changes_and_save()"
});
formatter.result({
  "duration": 1671332474,
  "status": "passed"
});
formatter.match({
  "location": "TC12.newly_added_details_sould_be_displayed()"
});
formatter.result({
  "duration": 256680692,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "SFDC opotunities dropdown scenario TC15",
  "description": "",
  "id": "salesforce-apllication;sfdc-opotunities-dropdown-scenario-tc15",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "when user is on homepage4",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "click on opportunities Tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "click on opprotunities dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verify elements",
  "keyword": "Then "
});
formatter.match({
  "location": "TC15.when_user_is_on_homepage4()"
});
formatter.result({
  "duration": 3881151188,
  "status": "passed"
});
formatter.match({
  "location": "TC15.click_on_opportunities_Tab()"
});
formatter.result({
  "duration": 6528847711,
  "status": "passed"
});
formatter.match({
  "location": "TC15.click_on_opprotunities_dropdown()"
});
formatter.result({
  "duration": 98179836,
  "status": "passed"
});
formatter.match({
  "location": "TC15.verify_elements()"
});
formatter.result({
  "duration": 331656491,
  "status": "passed"
});
});