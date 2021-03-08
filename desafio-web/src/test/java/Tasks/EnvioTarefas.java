package Tasks;

import PageObjects.PaginaEnvio;
import Utilitarios.Espera;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnvioTarefas {

    public static WebDriver driver;
    private static PaginaEnvio envio;
    private Espera espera;

    public EnvioTarefas(WebDriver driver) {
        this.driver = driver;
        envio = new PaginaEnvio(driver);
        espera = new Espera(this.driver);
    }

    public void confirmaEnvio(){
        espera.carregarElemento(envio.pegarPrimeiroBotaoCheckoutEnvio()).click();
        espera.carregarElemento(envio.pegarTermosServicos()).click();
        espera.carregarElemento(envio.pegarBotaoCheckoutEnvio()).click();
    }

}


