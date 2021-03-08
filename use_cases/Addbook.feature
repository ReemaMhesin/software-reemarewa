
Feature: add book
  this feature for the action of add book

  @tag4
  Scenario Outline:  Add a book when the administrator is logged in
    Given I am the admin and I am logged in
    When I add book with <isbn> and <title> and <auther> and <sig>
    Then book will be added successfuly 

Examples:
|isbn|title|auther|sig|
|"1250237351"|"The Hospital"|"Brian Alexander"|"Historybook"|
|"0439165873"|"A Ray of Light"|"Walter Wick"|"Photograghybook"|	
 

 @tag5
  Scenario Outline:  Add a book when the administrator is not logged in
    Given  the admin is not logged in
    When  I add book with <isbn> and <title> and <auther> and <sig>
    Then book will not be added successfuly 

Examples:
|isbn|title|auther|sig|
|"1250237351"|"The Hospital"|"Brian Alexander"|"Historybook"|
 
