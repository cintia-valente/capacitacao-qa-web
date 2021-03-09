package Tasks;

import PageObjects.PaginaPagamento;
import Utilitarios.Espera;
import org.openqa.selenium.WebDriver;

public class PagamentoTarefas {

    public static WebDriver driver;
    private static PaginaPagamento pagamento;
    private Espera espera;

    public PagamentoTarefas(WebDriver driver) {
        this.driver = driver;
        pagamento = new PaginaPagamento(driver);
        espera = new Espera(this.driver);
    }

    public void confirmaPagamento(){
        espera.carregarElemento(pagamento.pegarMetodoPagamento()).click();

    }

}

