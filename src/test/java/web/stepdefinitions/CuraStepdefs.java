package web.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import web.steps.CuraSteps;

public class CuraStepdefs {
    CuraSteps curaSteps=new CuraSteps();
    @Dado("acceder a  la pagina Cura")
    public void accederALaPaginaCura()throws InterruptedException  {
        curaSteps.OpenPage();
        curaSteps.BtnLogin();

    }

    @Cuando("escribo usuario {string}")
    public void escriboUsuario(String usuario)throws  InterruptedException {

        curaSteps.escribirUsername(usuario);
    }

    @Y("escribo contraseña {string}")
    public void escriboContraseña(String contraseña) throws InterruptedException {
        curaSteps.escribirContraseña(contraseña);
    }
    @Y("select el Login")
    public void selectElLogin()throws InterruptedException {
        curaSteps.BtnLogin();
    }


    @Entonces("Valido el usuario")
    public void validoElUsuario() throws InterruptedException{
        Assert.assertFalse(curaSteps.validarLogin());
    }


    @Dado("iniciado sesión procedo realizar solicitud")
    public void iniciadoSesiónProcedoRealizarSolicitud()  {
        curaSteps.OpenPage2();
    }

    @Cuando("seleciono el checkbox")
    public void selecionoElCheckbox()  throws InterruptedException{
        curaSteps.selectfacultad();
    }

    @Y("el programa")
    public void elPrograma() throws InterruptedException{
        curaSteps.selectProgram();
    }

    @Y("realizo un comentario{string}")
    public void realizoUnComentario(String comentario) throws InterruptedException {
        curaSteps.ingresoComentario(comentario);
    }

    @Y("doy click en registrar")
    public void doyClickEnRegistrar() throws InterruptedException{
        curaSteps.registrar();
    }
    @Entonces("Registro la solicitud")
    public void registroLaSolicitud() throws InterruptedException {
        curaSteps.registrar();
    }


}
