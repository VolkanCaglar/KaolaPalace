Feature: Add User Functionality

  Background:
    Given navigate to koala
    Given text username to username
    When text password to password
    Then click to login

    Scenario: Add user
      Given click add user button
      When create username
      When create password
      When create email
      When create full name
      When create phone no
      When create driving licence
      When create social security
      When select country on register form
      When create State to register form
      When create Address to register from
      When select Date of Birth on register from
      When create WorkingSector on register from
      When select Role on register from
      When select Approved on register from
      Then success text message should be displayed
