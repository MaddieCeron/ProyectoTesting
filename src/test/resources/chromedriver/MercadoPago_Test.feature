Feature: Metodos pago de Mercado Pago
  Scenario: usuario desea conocer los distintos metodos de pago
    Given el usuario ingresa a mercado libre
    When click como pagar
    And click en mercado pago
    And click conocer las cuentas
    Then visualiza mercado pago