package TestCase;

//import Suporte.CapturaDeTela;
//import Suporte.Relatorio;
import Suporte.TesteBase;
//import Suporte.TipoRelatorio;
//import Tarefas.CarrinhoTarefas;
//import Tarefas.DetalhaProdutoTarefas;
//import Tarefas.HomeTarefas;
//import Tarefas.LoginTarefas;
//import Utilitarios.EsperaFixa;
//import com.aventstack.extentreports.Status;
import Tasks.LoginTarefas;
import Tasks.CarrinhoTarefas;
import Tasks.StoreTarefas;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealizarCompraComSucesso extends TesteBase {

    private WebDriver driver = this.pegarDriver();
    StoreTarefas store = new StoreTarefas(driver);
    CarrinhoTarefas carrinho = new CarrinhoTarefas(driver);
    LoginTarefas cadastro =  new LoginTarefas(driver);
    /*HomeTarefas homePage = new HomeTarefas(driver);
    DetalhaProdutoTarefas produto = new DetalhaProdutoTarefas(driver);
    CarrinhoTarefas carrinho = new CarrinhoTarefas(driver);

*/
    @Test
    public void realizarCompraComSucesso()  {

        store.adicionaProduto();
        carrinho.adicionaCheckout();
        carrinho.continuaCheckout();
        cadastro.realizarCadastro();
        cadastro.continuaCadastro();
    }

    /*
    @Test
    public void realizaCompraComSucesso()  {

        Relatorio.criaTeste("Realizar Compra com Sucesso", TipoRelatorio.SINGLE);

        EsperaFixa.aguardaEmSegundos(2);
        login.realizarLogin();
        homePage.selecionaProduto();
        produto.adicionaProduto();
        carrinho.realizarChekout();
    }*/

    @Test
    public void carregaGoogle() throws InterruptedException {

        driver.get("http://www.google.com");

// Get search box element from webElement 'q' using Find Element
        WebElement searchBox = driver.findElement(By.name("q"));

        Thread.sleep(2000);
        searchBox.sendKeys("webdriver");
        Thread.sleep(4000);
    }


}
