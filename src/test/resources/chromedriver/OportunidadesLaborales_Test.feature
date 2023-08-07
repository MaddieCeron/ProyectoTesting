Feature: Oportunidades laborales
  Scenario: usuario busca oportunidades laborales
    Given usuario ingresa mercado Libre
    When usuario busca trabajo
    And selecciona ver oportunidades
    Then visualiza pagina de oportunidades
