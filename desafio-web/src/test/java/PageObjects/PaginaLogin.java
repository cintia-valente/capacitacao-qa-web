package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

/*
    public WebElement pegarGeneroUsuario(){

        return driver.findElement(By.id("id_gender2"));
        //return espera.visibilidadeDoElemento(By.xpath("//div[@class='radio-inline']/label/div[@id=uniform-id_gender2']/span"));
    }

*/
    public WebElement pegarInputPrimeiroNomeUsuario() {
        WebElement inputPrimeiroNomeUsuario = driver.findElement(By.id("customer_firstname"));
        return inputPrimeiroNomeUsuario;
    }

    public WebElement pegarInputUltimoNomeUsuario(){
        WebElement inputUltimoNomeUsuario = driver.findElement(By.id("customer_lastname"));
        return inputUltimoNomeUsuario;
    }

    public WebElement pegarInputSenhaUsuario(){
        return espera.visibilidadeDoElemento(By.xpath("//div[@class='required password form-group form-error']/input[@class='is_required validate form-control']"));
    }

    public WebElement pegarDiaNascimentoUsuario(){
        WebElement inputDiaNascimentoUsuario = driver.findElement(By.cssSelector("div#uniform-days option:nth-of-type(28)"));
        return inputDiaNascimentoUsuario;
    }

    public WebElement pegarMesNascimentoUsuario(){
        WebElement inputMesNascimentoUsuario = driver.findElement(By.cssSelector("div#uniform-months option:nth-of-type(8)"));
        return inputMesNascimentoUsuario;
    }

    public WebElement pegarAnoNascimentoUsuario(){
        WebElement inputAnoNascimentoUsuario = driver.findElement(By.cssSelector("div#uniform-years option:nth-of-type(1990)"));
        return inputAnoNascimentoUsuario;
    }

    public WebElement pegarAceiteOfertas(){

        return driver.findElement(By.id("optin"));
    }

    public WebElement pegarInputPrimeiroNomeParaEndereco(){
        WebElement inputPrimeiroNomeParaEndereco = driver.findElement(By.id("firstname"));
        return inputPrimeiroNomeParaEndereco;
    }

    public WebElement pegarInputUltimoNomeParaEndereco(){
        WebElement inputUltimoNomeParaEndereco = driver.findElement(By.id("lasttname"));
        return inputUltimoNomeParaEndereco;
    }

    public WebElement pegarInputEndereco(){
        WebElement inputEndereco = driver.findElement(By.id("address1"));
        return inputEndereco;
    }

    public WebElement pegarInputCidade(){
        WebElement inputCidade = driver.findElement(By.id("city"));
        return inputCidade;
    }
/*
    public WebElement pegarInputEstado(){
        WebElement inputEstado = driver.findElement(By.cssSelector("div#uniform-id_state option:nth-of-type(32)"));
        return inputEstado;
    }*/

    public WebElement pegarInputCep(){
        WebElement inputCep = driver.findElement(By.id("postcode"));
        return inputCep;
    }

    public WebElement pegarInputCelular(){
        WebElement inputCelular = driver.findElement(By.id("phone_mobile"));
        return inputCelular;
    }

    public WebElement pegarInputEmailAlternativo(){
        WebElement inputEmailAlternativo = driver.findElement(By.id("alias"));
        return inputEmailAlternativo;
    }

    public WebElement pegarBotaoRegistro(){

        return driver.findElement(By.id("submitAccount"));
    }

}
