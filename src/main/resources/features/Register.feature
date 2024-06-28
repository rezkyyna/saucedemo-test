Feature: Activity

#TCC.HW.001
  Scenario: Show Activity Menu
    Given User enter URL Event
    When User Login
    Then user get txt

    #TCC.HW.002
  Scenario: Add To Cart
    When user click add cart
    Then user get txt cart
    Then user logout
    Then user get txt logout


