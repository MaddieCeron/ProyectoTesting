Feature: Agregar Producto Carrito
  Scenario: usuario agrega un producto al carrito
    Given usuario ingresa Mercado Libre
    When usuario busca un producto
    And selecciona un producto
    And click en agregar a carrito
    Then visualiza pagina de ingreso cuenta
