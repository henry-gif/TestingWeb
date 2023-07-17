package web.steps;

import io.cucumber.java.bs.I;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import web.pages.LoginPage;


import java.util.concurrent.TimeUnit;

public class CuraSteps {
    WebDriver webDriver;
    private LoginPage LoginPage(){
        return new LoginPage(webDriver);
    }

    public void OpenPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/win/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver= new ChromeDriver(chromeOptions);
        webDriver.get("https://katalon-demo-cura.herokuapp.com/");
        webDriver.manage().window().maximize();
        BtnLogin();

    }
    public void OpenPage2()  {
        System.setProperty("webdriver.chrome.driver","driver/win/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        webDriver= new ChromeDriver(chromeOptions);
        webDriver.get("https://katalon-demo-cura.herokuapp.com/#appointment");
        webDriver.manage().window().maximize();


    }

    public void BtnLogin() throws InterruptedException{

        LoginPage().getBtn().click();
        TimeUnit.SECONDS.sleep(5);
    }
    public  void escribirUsername(String usuario) throws InterruptedException{

    LoginPage().getInputUser().sendKeys(usuario);
        TimeUnit.SECONDS.sleep(5);
    }
    public  void escribirContraseña(String contraseña) throws InterruptedException{

        LoginPage().getInputPassword().sendKeys(contraseña);
        TimeUnit.SECONDS.sleep(5);
    }
    public  void iniciarSesión() throws InterruptedException{

        LoginPage().getBotonLogin().click();
        TimeUnit.SECONDS.sleep(5);


    }
    public  void selectProgram() throws InterruptedException{

        LoginPage().getProgram().click();
        TimeUnit.SECONDS.sleep(5);
    }
    public  void selectfacultad() throws InterruptedException{

        LoginPage().getCheckbox().click();
        TimeUnit.SECONDS.sleep(5);
    }
    public void  ingresoComentario(String comentario) throws InterruptedException{

        LoginPage().getComentario().sendKeys(comentario );
        TimeUnit.SECONDS.sleep(5);

    }

    public boolean validarLogin(){
        String actualURL = webDriver.getCurrentUrl();

        return actualURL.contains("https://katalon-demo-cura.herokuapp.com/#appointment");


    }
    public boolean validarRegistro(){
        String actualURL = webDriver.getCurrentUrl();

        return actualURL.contains("https://katalon-demo-cura.herokuapp.com/#appointment");

    }
    public  void registrar() throws InterruptedException{

        LoginPage().getbtnSolictud().click();
        TimeUnit.SECONDS.sleep(5);
    }




}
