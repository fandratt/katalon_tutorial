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
@tag
Feature: Login di saucelabs
  I want to login to saucelabs

  @tag1
  Scenario Outline: standard_user bisa login ke saucelabs
    Given The saucelabs URL
    When I input <username> and <password> in the fields
    And I click on the signin button
    Then The burger menu button will be displayed

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |