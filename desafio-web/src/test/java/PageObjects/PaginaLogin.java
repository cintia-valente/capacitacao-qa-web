package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaLogin {

    private WebDriver driver;
    private Espera espera;

    public PaginaLogin(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarInputEmailUsuario(){
        WebElement inputEmailUsuario = driver.findElement(By.id("email_create"));
        return inputEmailUsuario;
    }

    public WebElement pegarBotaoCadastro(){

        return driver.findElement(By.id("SubmitCreate"));
    }

    public WebElement pegarGeneroUsuario(){

        return espera.visibilidadeDoElemento(By.id("uniform-id_gender2"));
    }

    public WebElement pegarInputPrimeiroNomeUsuario() {

        return espera.visibilidadeDoElemento(By.id("customer_firstname"));
    }

    public WebElement pegarInputUltimoNomeUsuario(){

        return espera.visibilidadeDoElemento(By.id("customer_lastname"));
    }

    public WebElement pegarInputSenhaUsuario(){

        return espera.visibilidadeDoElemento(By.id("passwd"));
    }

    public Select pegarDiaNascimentoUsuario(){

        return new Select(driver.findElement(By.id("days")));
    }

    public Select pegarMesNascimentoUsuario(){

        return new Select(driver.findElement(By.id("months")));
    }

    public Select pegarAnoNascimentoUsuario(){

        return new Select(driver.findElement(By.id("years")));
    }

    public WebElement pegarAceiteOfertas(){

        return driver.findElement(By.id("optin"));
    }

    public WebElement pegarInputEndereco(){

        return espera.visibilidadeDoElemento(By.id("address1"));
    }

    public WebElement pegarInputCidade(){

        return driver.findElement(By.id("city"));
    }

    public Select pegarInputEstado(){

        return new Select(driver.findElement(By.id("id_state")));
    }

    public WebElement pegarInputCep(){

        return driver.findElement(By.id("postcode"));
    }

    public WebElement pegarInputCelular(){

        return driver.findElement(By.id("phone_mobile"));
    }

    public WebElement pegarInputEmailAlternativo(){

        return driver.findElement(By.id("alias"));
    }

    public WebElement pegarBotaoRegistro(){

        return espera.visibilidadeDoElemento(By.id("submitAccount"));
    }


}
