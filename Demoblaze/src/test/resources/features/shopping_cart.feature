Feature: Search and add products to the shopping cart



  Scenario: Add and search products to shopping cart
    When Selects products from each category to add it to shopping cart
    Then the products is displayed in shopping cart with the total price of the products
