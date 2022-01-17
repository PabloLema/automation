Feature: SIR
  Scenario Outline: Automatización de pruebas del SISTEMA DE INFORMACIÓN DE RIESGO INTEGRAL SIR
    Given Abrimos Chrome
    And Ingresamos el usuario y contraseña
    And Seleccionamos el MÓDULO DE RIESGO DE MERCADO Y LIQUIDEZ
    And Entramos a monitor de liquidez
    And Agregamos una odservacion
    Then Hacemos una consulta en el rango de fechas 1 de enero del 2019 hasta 12 de enero del 2022
    And Descargamos las graficas
    Then Seleccionamos la pestaña DATOS HISTORICOS
    And Descargamos los datos historicos
    Then Regresamos al menu principal
    Examples:
      |Pruebas|
      |1|
