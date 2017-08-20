Feature: Testing the signup feature of the facebook application

Scenario: Test signup with valid credentials

Given when the user is on the facebook homepage
When user enters first name
And user enters last name
And user enters mobile bumber
And user enters password
Then user should be able to sign up
