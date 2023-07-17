package web.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import web.steps.CuevanaSteps;

public class CuevanaStepdefs {
    CuevanaSteps cuevanaSteps=new CuevanaSteps();
    @Dado("accedo a la pagina")
    public void accedoALaPagina()  {
        cuevanaSteps.OpenPage();
    }
    @Cuando("busco una película {string}")
    public void buscoUnaPelicula(String pelicula) throws InterruptedException{
        cuevanaSteps.escribirPelicula(pelicula);
    }

    @Y("reproduzco la película")
    public void reproduzcoLaPelicula() throws InterruptedException{
        cuevanaSteps.reproducir();
    }


    @Y("escribe un comentario {string}")
    public void escribeUnComentario(String comenetario) throws InterruptedException {
        cuevanaSteps.comentar(comenetario);
    }

    @Y("publico el comentario")
    public void publicoElComentario() throws InterruptedException {
        cuevanaSteps.publicar();
    }

    @Entonces("Valido que se comento")
    public void validoQueSeComento() {
        Assert.assertTrue(cuevanaSteps.validarPublicación());
    }

    @Y("seleccione la película")
    public void seleccioneLaPelícula() throws InterruptedException{
        cuevanaSteps.seleccionarPelicula();
    }
}
