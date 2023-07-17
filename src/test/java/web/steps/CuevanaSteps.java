package web.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import web.page.HomePage;

import java.util.concurrent.TimeUnit;

public class CuevanaSteps {
    WebDriver driver;
    private HomePage homePage(){
        return new HomePage(driver);
    }
    public void OpenPage()  {
        System.setProperty("webdriver.chrome.driver","driver/win/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(chromeOptions);
        driver.get("https://w4.cuevana3.ai/");
        driver.manage().window().maximize();

    }
    public void seleccionarP()throws  InterruptedException{
        homePage().getBusqueda().click();
        TimeUnit.SECONDS.sleep(5);

    }
    public void escribirPelicula(String pelicula) throws InterruptedException{
        homePage().getBusqueda().sendKeys(pelicula);
        TimeUnit.SECONDS.sleep(5);
        seleccionarP();
    }

    public void seleccionarPelicula () throws InterruptedException{
        homePage().getbtnBusqueda().click();
        TimeUnit.SECONDS.sleep(5);
    }
    public void reproducir() throws  InterruptedException{
        homePage().getReproductor().click();
        TimeUnit.SECONDS.sleep(5);
    }
    public void  comentar(String comentario)throws InterruptedException{
        homePage().getComentario().sendKeys(comentario);
        TimeUnit.SECONDS.sleep(5);
    }

    public void publicar()throws InterruptedException{
        homePage().getBtnPublicar().click();
        TimeUnit.SECONDS.sleep(5);

    }
    public boolean validarPublicación(){
        String actualURL = driver.getCurrentUrl();
        driver.close();
        return actualURL.contains("https://w4.cuevana3.ai/55046/the-batman");

    }


}
