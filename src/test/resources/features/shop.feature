Feature: Compra de productos

  @happyTest
  Scenario Outline: Proceso de comprar productos
    Given Inicio sesion <username> <password>

    Given Selecciono dos productos del catalogo <product1> <product2>
    Then Ingreso al carrito de compras
    And Completo el formulario de compra con <firstName> <lastName> <postalCode>
    And Finalizo la compra

    Examples:
      | username      | password     | product1                         | product2                              | firstName | lastName | postalCode |
      | standard_user | secret_sauce | #add-to-cart-sauce-labs-backpack | #add-to-cart-sauce-labs-fleece-jacket | Erick     | Salgado  | 170404     |