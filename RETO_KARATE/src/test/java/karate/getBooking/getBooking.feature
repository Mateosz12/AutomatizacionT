Feature: Get a reservation by means of a specific ID



  @GetBookingSU
  Scenario: Get booking by id
    * url api.beginUrl
    # traer id del create
    * def CBooking = call read('../createBooking/createBooking.feature@CreateBooking')
    * def IDBooking = CBooking.response.bookingid
    * header Accept = 'application/json'
    Given path '/booking' , IDBooking
    When method Get
    Then status 200
    And match $.firstname == 'Mateo'
    And match $.lastname == 'Sepulveda'
    And match $.totalprice == 500
    And match $.depositpaid == true
    And match $.bookingdates.checkin == '2023-12-02'
    And match $.bookingdates.checkout == '2023-12-03'
    And match $.additionalneeds == 'Breakfast'
