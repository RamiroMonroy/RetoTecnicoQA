#Author: Ramiro Monroy Ramos


Feature: test the functionality of the page exito.com
  I as a PO want to validate that when buying items from the page, the name,
  quantity and value are correct in the shopping cart


  Scenario: validate product data in the shopping cart

    Given that the user is on the web page
    When  choose five products at random each product has random quantities between one and ten
    Then the name of the added products are the same as in the shopping cart
    Then the price of the added products are the same as in the shopping cart


