package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    By inputUser=By.xpath("//input[@id='txt-username']");
    By inputPassword=By.xpath("//input[@id='txt-password']");
    By btnIniciarSesion=By.xpath("//div/button[@id='btn-login']");

    By btnSolicitud=By.xpath("//div/a[@id='btn-make-appointment']");

    By checkbox= By.xpath("//input [@type='checkbox']");
    By Program=By.xpath("//input [@id='radio_program_medicaid']");
    By Date=By.xpath("//input [@id='txt_visit_date']");
    By comentario=By.xpath("//div/textarea [@id='txt_comment']");

    By BtnSolicitud= By.xpath("//div/button [@id='btn-book-appointment']");

    public WebElement getCheckbox(){
        return driver.findElement(checkbox);
    }

    public WebElement getProgram(){
        return driver.findElement(Program);
    }
    public WebElement getDate(){
        return driver.findElement(Date);
    }
    public WebElement getComentario(){
        return driver.findElement(comentario);
    }
    public WebElement getbtnSolictud(){
        return driver.findElement(BtnSolicitud);
    }


    public WebElement getBtn(){
        return driver.findElement(btnSolicitud);
    }

    public WebElement getInputUser(){
        return driver.findElement(inputUser);
    }
    public WebElement getInputPassword(){
        return driver.findElement(inputPassword);
    }
    public WebElement getBotonLogin(){
        return driver.findElement(btnIniciarSesion);
    }
}
