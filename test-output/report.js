$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/BDD_Workspace/HopscotchBDDFramework/src/main/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Hopscotch Login Feature",
  "description": "",
  "id": "hopscotch-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 164200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login test scenario",
  "description": "",
  "id": "hopscotch-login-feature;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user verifies title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on account button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on sign in button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters mobile number and clicks on send otp button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters received OTP",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page by clicking on home page icon",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.launch_the_url()"
});
formatter.result({
  "duration": 7938317400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_the_login_page()"
});
formatter.result({
  "duration": 7566200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_account_button()"
});
formatter.result({
  "duration": 4410647600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 62500,
  "status": "passed"
});
});