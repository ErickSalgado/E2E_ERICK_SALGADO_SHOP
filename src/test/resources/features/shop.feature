Feature: Compra de productos

  @happyTest
  Scenario: Proceso de comprar productos
    Given Inicio sesion

    Given Selecciono dos productos del catalogo
    Then Ingreso al carrito de compras
    And Completo el formulario de compra
    And Finalizo la compra