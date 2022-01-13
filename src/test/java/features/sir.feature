Feature: SIR
  Scenario Outline: Automatización de pruebas del SISTEMA DE INFORMACIÓN DE RIESGO INTEGRAL SIR
    Given Abrimos Chrome
    And Ingresamos el usuario y contraseña
    And Seleccionamos el MÓDULO DE RIESGO DE MERCADO Y LIQUIDEZ
    And Entramos a monitor de liquidez
    Examples:
      |Pruebas|
      |1|
