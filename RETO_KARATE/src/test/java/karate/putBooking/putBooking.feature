Feature: Updates a booking by id


  @UpdateBooking
  Scenario: Update a booking by id
    * url  api.beginUrl
    * def getID = call read('../getBooking/getBooking.feature@GetBookingSU')
    * def PutID = getID.IDBooking
    * def authToken = call read('../auth/createToken.feature@TokenCreation')
    * header Accept = 'application/json'
    * header 'Content-Type' = 'application/json'
    * header Cookie = 'token=' + authToken.response.token
    * def jsonResponse = read('../json/putBooking.json')
    * request jsonResponse
    * print PutID
    Given path '/booking' , PutID
    When method Put
    Then status 200
    And match $.firstname == 'jessi'
    And match $.lastname == 'villa'
    And match $.totalprice == 1000
    And match $.depositpaid == false
    And match $.bookingdates.checkin == '2025-03-25'
    And match $.bookingdates.checkout == '2026-11-01'
    And match $.additionalneeds == 'Borojo juice'