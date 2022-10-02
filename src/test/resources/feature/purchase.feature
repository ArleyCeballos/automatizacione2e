Feature: Purchase
  //se añade en este espacio una descripcion, generalmente se pone la historia de usuario

  As a registered user
  I want to add products
  To make a purchase

  Scenario: Purchase products from the shopping car succesfully
    Given Juan is authenticated
    And add from laptops a MackBook air
    And add from Monitor an Apple monitor 24
    When Juan makes the purchase
    Then Juan should see the message Thank for your purchase


