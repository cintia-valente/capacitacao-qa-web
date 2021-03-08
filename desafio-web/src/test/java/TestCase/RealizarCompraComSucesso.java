package TestCase;

import Suporte.Relatorio;
import Suporte.Screenshot;
import Suporte.TesteBase;
import Suporte.TipoRelatorio;
import Tasks.*;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Suporte.Relatorio.log;

public class RealizarCompraComSucesso extends TesteBase {

    private WebDriver driver = this.pegarDriver();

    StoreTarefas store = new StoreTarefas(driver);
    CarrinhoTarefas carrinho = new CarrinhoTarefas(driver);
    LoginTarefas cadastro =  new LoginTarefas(driver);
    EnvioTarefas envio = new EnvioTarefas(driver);
    PagamentoTarefas pagamento = new PagamentoTarefas(driver);
    ConfirmaPedidoTarefas pedido = new ConfirmaPedidoTarefas(driver);

    @Test
    public void realizarCompraComSucesso()  {

        try {
            Relatorio.createTest("Realizar Compra com Sucesso" , TipoRelatorio.INDIVIDUAL);

            store.adicionaProduto();
            carrinho.adicionaCheckout();
            carrinho.continuaCheckout();
            cadastro.realizarCadastro();
            envio.confirmaEnvio();
            pagamento.confirmaPagamento();
            pedido.confirmaPedido();

        }catch (Exception e){
            log(Status.ERROR, e.getMessage(), Screenshot.fullPageBase64(driver));
        }
    }

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
