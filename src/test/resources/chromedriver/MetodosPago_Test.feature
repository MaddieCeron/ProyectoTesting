Feature: Metodos pago
  Scenario: usuario desea conocer los distintos metodos de pago
    Given el usuario ingresa a mercado libre
    When click como pagar
    Then visualiza mercado pago
   
