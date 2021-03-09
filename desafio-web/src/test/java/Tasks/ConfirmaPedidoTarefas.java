package Tasks;

import PageObjects.PaginaConfirmaPedido;
import Utilitarios.Espera;
import org.openqa.selenium.WebDriver;

public class ConfirmaPedidoTarefas {

    public static WebDriver driver;
    private static PaginaConfirmaPedido pedido;
    private Espera espera;

    public ConfirmaPedidoTarefas(WebDriver driver) {
        this.driver = driver;
        pedido = new PaginaConfirmaPedido(driver);
        espera = new Espera(this.driver);
    }

    public void confirmaPedido(){

        pedido.pegarBotaoConfirmaPedido().click();
    }

}
