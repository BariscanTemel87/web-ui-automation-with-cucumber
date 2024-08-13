Feature: Add Record Test

  Scenario: Add and edit a record
    Given I am on the Web Tables page
    When I add a new record with first name "Bariscan", last name "TEMEL", age "37", email "bariscan.temel@gmail.com", salary "10000", and department "IT"
    And I edit the record to have age "38"
    Then I should see the updated age as "38"