package Tasks;

import PageObjects.PaginaStore;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreTarefas {

    public static WebDriver driver;
    private static PaginaStore store;

    public StoreTarefas(WebDriver driver) {
        this.driver = driver;
        store = new PaginaStore(this.driver);
    }

    public void adicionaProduto(){
        store.pegarBotaoAdicionarCarrinho().click();
        validaBotaoAdicionarCarrinho();
    }

    private void validaBotaoAdicionarCarrinho(){
        Assertions.assertTrue(store.pegarTituloDoProduto().isEnabled());
        Assertions.assertEquals(store.pegarTituloDoProduto().getText(), "Blouse");
    }

}

