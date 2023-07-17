#language: es
  @Cuevama3
  Característica: Comentar en una película de cuevana3
    @Prueba1
     Esquema del escenario: Accedo a la pagina de cuevana3
      Cuando accedo a la pagina
      Y busco una película "<pelicula>"
      Y seleccione la película
      Y reproduzco la película
      Y escribe un comentario "<comentario>"
      Y publico el comentario
      Entonces Valido que se comento
      Ejemplos:
      |pelicula|comentario|
      |batman  |Respíralo, eso es miedo|
      |Joker   |La locura es como la gravedad, basta con un pequeño empujón  |
