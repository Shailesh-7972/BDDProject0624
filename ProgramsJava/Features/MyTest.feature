Feature: Title of Flipcart

Scenario Outline: Verify login credentials of Guru99

    Given Open Guru99 login page with UserID Password and Buttons
    
    When Enter UserID "<userid>" and Password "<password>"
    
    Then Click on the Login button
    
    And Click on the New Account option
    
    And Enter Account details
    
    And Submit details

    Examples: 
      | userid  | password        |
      | mngr574594 | evetyjy       |
    