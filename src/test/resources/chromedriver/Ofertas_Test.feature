Feature: Ofertas
  Scenario: usuario visualiza apartados de ofertas 
   Given Usuario ingresa Mercado Libre
    When click en ofertas
    And visualiza apartados de ofertas disponibles
		Then visualiza apartado de ofertas 