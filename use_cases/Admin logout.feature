Feature: Admin logout
  this feature for the action of logout

  @tag3
  Scenario: Administrator logout 
    Given  I logged in 
    When I press logout
    Then I will be outside the website 
