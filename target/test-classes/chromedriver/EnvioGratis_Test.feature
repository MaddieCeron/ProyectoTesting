Feature: Ofertas
  Scenario: usuario visualiza apartados de ofertas 
   Given Usuario ingresa Mercado Libre
    When click en ofertas
    And click en envio gratis
		Then visualiza productos con envio gratis
