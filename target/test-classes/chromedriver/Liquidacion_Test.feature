Feature: Ofertas
  Scenario: usuario visualiza apartados de ofertas 
   Given Usuario ingresa Mercado Libre
    When click en ofertas
    And click en liquidacion
    And visualiza apartados de liquidacion
		Then visualiza apartado de liquidacion