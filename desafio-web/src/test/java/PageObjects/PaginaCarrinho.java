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


}


