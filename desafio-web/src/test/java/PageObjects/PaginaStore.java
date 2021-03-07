package PageObjects;

import Utilitarios.Espera;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaStore {

    private WebDriver driver;
    private Espera espera;

    public PaginaStore(WebDriver driver) {

        this.driver = driver;
        espera = new Espera(driver);
    }

    public WebElement pegarBotaoAdicionarCarrinho(){

        return espera.visibilidadeDoElemento(By.xpath("//div/p[@id='add_to_cart']/button"));
    }

    public WebElement pegarTituloDoProduto(){

        return espera.visibilidadeDoElemento(By.xpath("//div[@class='layer_cart_product_info']/span[@class='product-name']"));
    }
}


