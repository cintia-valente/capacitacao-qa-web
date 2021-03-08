package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaPagamento {

    private WebDriver driver;
    private Espera espera;

    public PaginaPagamento(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarMetodoPagamento(){

        return espera.visibilidadeDoElemento(By.xpath("//div[@class='col-xs-12 col-md-6']/p[@class='payment_module']/a[@class='bankwire']"));
    }

//    public WebElement pegarTotalDaCompra(){
//
//        return espera.visibilidadeDoElemento(By.id("total_price"));
//    }

}
