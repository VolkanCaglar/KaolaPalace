Feature: Username text
  Background:
    Given navigate to koala

  Scenario: Username text
    Given text username to username
    When text password to password
    Then click to login
