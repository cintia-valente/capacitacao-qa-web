package Tasks;

import PageObjects.PaginaCarrinho;
import org.openqa.selenium.WebDriver;

public class CarrinhoTarefas {

    public static WebDriver driver;
    private static PaginaCarrinho carrinho;

    public CarrinhoTarefas(WebDriver driver) {
        this.driver = driver;
        carrinho = new PaginaCarrinho(driver);
        //selecionaProduto = new PaginaHome(this.driver);
    }

    public void adicionaCheckout(){
        carrinho.pegarBotaoCheckout().click();
    }

}


