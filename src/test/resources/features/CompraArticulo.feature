Feature: funcionalidad de compra
  Yo como suuario deerer
  para poder ver que se agrega

  Scenario Outline: Agregar un articulo al carro de compra

    Given que el usuario se encuewntra registrado
      |email|clave|producto|cantidad|formapago|resultado|
      |<email>|<clave>|<producto>|<cantidad>|<formapago>|<resultado>|
    When el usario desea comprar un articulo a traves de la pagina
    Then el puede ver que el articulo se agrego

    Examples:
      |email|clave|producto|cantidad|formapago|resultado|
      |cardona.gissela@gmail.com|qwer1234|faded Short|1|TC|Product successfully added to your shopping cart|


  Scenario Outline: agregar un solo articulo con cantidad mayor a 1

    Given que el usuario se encuewntra registrado
      |email|clave|producto|cantidad|formapago|resultado|
      |<email>|<clave>|<producto>|<cantidad>|<formapago>|<resultado>|
    When el usario desea comprar un articulo n veces
    Then el puede ver el valor total a pagar

    Examples:
      |email|clave|producto|cantidad|formapago|resultado|
      |cardona.gissela@gmail.com|qwer1234|faded Short|2|TC|Product successfully added to your shopping cart|
