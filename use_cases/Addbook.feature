Feature: Add book
  this feature for the action of add book

  @tag4
  Scenario Outline:  Add a book when the administrator is logged in 
    Given my account <username> and <password> I will add a book with <isbn> and <title> and <author> and <sig>
    When  I add a book 
    Then book well be added to the library 
    Examples:
    |username|password|isbn|title|author|sig|
    |"rewaa"|"1111"|"0140449116"|"hfhtft"|"kyyg"|"gffj"|
    
    

  @tag5
  Scenario Outline: Add a book when the administrator is not logged in
    Given my account <username> and <password> I will add a book with <isbn> and <title> and <author> and <sig>
    When   I add a book 
    Then  book will not be added to the library
    Examples:
     |username|password|isbn|title|author|sig|
    |"rekjiwaa"|"12111"|"1235"|"hfhtft"|"kyyg"|"gffj"|
    |"r5ewaa"|"1111"|"1235"|"hfhtft"|"kyyg"|"gffj"|
    