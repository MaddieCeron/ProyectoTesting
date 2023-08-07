Feature: Agregar Producto Carrito
  Scenario: usuario agrega un producto al carrito
    Given usuario ingresa Mercado Libre
    When usuario busca un producto
    And usuario selecciona marca producto
    And usuario ingresa rango precio
    Then visualiza pagina de productos