#language:es
  @Cura
  Característica: Realizar solicitud en la pagina Cura
    @Prueba1
    Escenario: Iniciar session en paginaCura
      Dado acceder a  la pagina Cura
      Cuando escribo usuario "John Doe"
      Y escribo contraseña "ThisIsNotAPassword"
      Y select el Login
      Entonces Valido el usuario
    @Prueba2

    Esquema del escenario: una vez iniciado la sesión realizo una solicitud
      Dado  iniciado sesión procedo realizar solicitud
      Cuando  seleciono el checkbox
      Y  el programa
      Y realizo un comentario"<comentario>"
      Y doy click en registrar
      Entonces Registro la solicitud
      Ejemplos:
        | comentario |
        |Dolor de cabeza|


