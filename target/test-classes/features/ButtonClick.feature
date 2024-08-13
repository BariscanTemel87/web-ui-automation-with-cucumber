Feature: Click Button Test

  Scenario: Click the "Click Me" button
    Given I am on the Elements page
    When I click on the "Buttons" option
    And I click the "Click Me" button
    Then I should see the message "You have done a dynamic click"
