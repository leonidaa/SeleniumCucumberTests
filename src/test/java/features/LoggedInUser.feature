Feature: LoggedIn User View
  Scenario: Validate user is able to view after log in
    Given User navigates to login page
    When User succesfully logs in
    Then User should be able to see product category page