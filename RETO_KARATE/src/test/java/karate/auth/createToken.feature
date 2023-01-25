Feature: Create a new authentication token that will be used to access PUT

  Background:
    * url api.beginUrl
    * def jsonResponse = read('../json/credentials.json')
    * def username = jsonResponse.username
    * def password = jsonResponse.password


  @TokenCreation
  Scenario: Create a new authentication token
    * header 'Content-Type' = 'application/json'
    * request jsonResponse
    Given path '/auth'
    When method Post
    Then status 200
    And match $.token == '#string'

  @TokenCreationFailed
  Scenario: Create authentication token failed
    * header 'Content-Type' = 'application/json'
    * def incorrect_Password = 'Pass5555'
    Given path '/auth'
    And request {    "username" : "#(username)" , "password" : "#(incorrect_Password)"}
    When method Post
    Then status 200
    And match $.reason == 'Bad credentials'