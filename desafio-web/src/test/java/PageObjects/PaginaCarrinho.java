package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaCarrinho {

    private WebDriver driver;
    private Espera espera;

    public PaginaCarrinho(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarBotaoCheckout(){
        return espera.visibilidadeDoElemento(By.xpath("//div[@class='button-container']/a[@class='btn btn-default button button-medium']"));
    }

    public WebElement adicionarMaisProduto(){
        return espera.visibilidadeDoElemento(By.xpath("//div[@class='cart_quantity_button clearfix']/a[@class='cart_quantity_up btn btn-default button-plus']"));
    }

    public WebElement pegarProximoBotaoCheckout(){
        return espera.visibilidadeDoElemento(By.xpath("//p[@class='cart_navigation clearfix']/a[@class='button btn btn-default standard-checkout button-medium']"));
    }


}


