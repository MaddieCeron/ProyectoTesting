Feature: Agregar Producto Carritoy filtrar su resultado
  Scenario: usuario agrega un producto al carrito
    Given usuario ingresa Mercado Libre
    When usuario busca un producto
    And selecciona filtro mas relevantes
    Then visualiza productos 