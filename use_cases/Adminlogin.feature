#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Admin login
  this feature for the action of login 

  @tag1
  Scenario: Administrator can log in with valid credentials 
    Given I have an account with user name and password  
    When I enter the user name and password in correct way then press enter
    Then I will be inside the website successfuly 

  @tag2
  Scenario: Administrator has the wrong password 
    Given I have an account with user name and password 
    When I enter the user name and a wrong password then press enter
    Then An error message appear beacause of the failed login process
    
  
