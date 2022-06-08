Feature: Adquirir un seguro de vida

  @Compra
  Scenario: Solicitud para realizar compra del seguro de vida digital por medio de la pagina web sura
    Given el cliente ingresa a la pagina web para realizar la compra del seguro de vida
    When diligencia completamente el formulario de compra con los datos personales y responde preguntas obligatorias
    Then el cliente realiza la compra del producto de manera exitosa