Feature: Oportunidades laborales
  Scenario: usuario busca oportunidades laborales
    Given usuario ingresa mercado Libre
    When usuario busca trabajo
    And selecciona ver oportunidades
    And selecciona Postularse
    And completa sus datos
    And click en continuar
    Then visualiza pagina de oportunidades