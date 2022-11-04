Feature: Register
  I as user, I need register in the page



  Scenario: Register
    Given he user enters in the page
    When he user fills in the corresponding
      | id     | email                  | password      |
      | 012358 | scastanomo@yopmail.com | Sarcasmo1902* |
    Then the account is successfully created