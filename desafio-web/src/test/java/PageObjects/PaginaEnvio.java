package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaEnvio {

    private WebDriver driver;
    private Espera espera;

    public PaginaEnvio(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarTermosServicos(){

        return espera.visibilidadeDoElemento(By.id("uniform-cgv"));
    }

    public WebElement pegarPrimeiroBotaoCheckoutEnvio(){

        return espera.visibilidadeDoElemento(By.xpath("//p[@class='cart_navigation clearfix']/button[@class='button btn btn-default button-medium']"));
    }

    public WebElement pegarBotaoCheckoutEnvio(){

        return espera.visibilidadeDoElemento(By.xpath("//p[@class='cart_navigation clearfix']/button[@class='button btn btn-default standard-checkout button-medium']"));
    }

}

