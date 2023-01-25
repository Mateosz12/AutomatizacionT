Feature: Create a new booking


  @CreateBooking
  Scenario: Create a new booking in the API
    * url api.beginUrl
    * def jsonResponse = read('../json/listCreateBooking.json')
    * request jsonResponse
    * header Accept = 'application/json'
    Given path '/booking'
    When method Post
    Then status 200
    And match $.booking.firstname == '#string'
    And match $.booking.lastname == '#string'
    And match $.booking.totalprice == '#number'
    And match $.booking.depositpaid == '#boolean'
    And match $.booking.bookingdates == '#object'
    And match $.booking.additionalneeds == '#string'