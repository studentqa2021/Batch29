@SmokeTest
Feature: Login function testing

@TC_001
Scenario: As a user, must do succefull login with valid credential
Given Open a browser
And go to application URL
When put user name
And put password
And click sign in button
Then Validate login was success