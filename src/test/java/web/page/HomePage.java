package web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    By busqueda= By.xpath("//input[@type ='search']");
    By BtnBusqueda=By.xpath("//span/button[@id='searchsubmit']");

    By pelicula=By.xpath("");

    ////h2[@class='Title']//img[@class='lazy attachment-thumbnail size-thumbnail wp-post-image']//

    By reproductor=By.xpath("//a[@class='link']");

    By like=By.xpath("//a[@class='fa-thumbs-up votar_com']");
    By comentar=By.xpath("//textarea");

    By publicar=By.xpath("//button[contains(text(), 'Publicar')]");
    public WebElement getBusqueda(){
         return driver.findElement(busqueda);
    }
    public WebElement getPelicula(){
        return driver.findElement(pelicula);
    }
    public WebElement getReproductor(){
        return driver.findElement(reproductor);
    }
    public WebElement getLike(){
        return driver.findElement(like);
    }
    public  WebElement  getComentario(){
        return driver.findElement(comentar);
    }
    public  WebElement  getbtnBusqueda() {
        return driver.findElement(BtnBusqueda);
    }
    public WebElement getBtnPublicar(){
        return driver.findElement(publicar);
    }

}
