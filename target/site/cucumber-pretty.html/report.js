$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Automation%20Login.feature");
formatter.feature({
  "name": "Login function testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.scenario({
  "name": "As a user, must do succefull login with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@TC_001"
    }
  ]
});
formatter.step({
  "name": "Open a browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.open_a_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to application URL",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.go_to_application_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "put user name",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.put_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "put password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.put_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.click_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate login was success",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.check_sign_otu_button_there_or_not()"
});
formatter.result({
  "status": "passed"
});
});