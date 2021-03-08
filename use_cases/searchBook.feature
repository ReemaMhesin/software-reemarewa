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
Feature: search book
  this feature for the action of search

  @tag6
  Scenario Outline: Searching for a substring of the title 
    Given I want to searches for book by providing a <substring> of the title
    When I enter a the substring of that book title then press enter
    Then I will see the full title,author,signature,and the ISBN of that book  

Examples:
|substring|
|"Hospital"|
 
 
  @tag7
 Scenario Outline: Searching for a substring of the author 
     Given I want to searches for book by providing a <substring> of the author
    When I enter a the substring of that book author then press enter
    Then I will see the full title,author,signature,and the ISBN of that book  

Examples:
|substring|
|"Walter"|
 
  @tag8
Scenario Outline: Searching for a substring of the ISBN 
    Given I want to searches for book by providing a <substring> of the ISBN
    When I enter a substring of that book ISBN then press enter
    Then I will see the full title,author,signature,and the ISBN of that book  

Examples:
|substring|
|"125"|
 
   @tag9
Scenario Outline: : Searching also works when the user/administrator is logged in 
    Given  administrator is logged in 
    When I enter string to search for book by providing a <substring> of the <kindofsearch>
    Then I will see the full title,author,signature,and the ISBN of that book  

Examples:
|substring|kindofsearch|
|"Walter"|"author"|
    
 @tag10
Scenario Outline: : No books match the criteria (substring)
    Given I want to searches for book by providing a <substring> of the title for examble
    When I enter a substring of that book title then press enter
    Then I cant see any book in the list and a message of this library doesnt have this book will appear  

Examples:
|substring|
|"Hosp"|   