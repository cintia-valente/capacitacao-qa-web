package Tasks;

import PageObjects.PaginaLogin;
import Utilitarios.Espera;
import org.openqa.selenium.WebDriver;

public class LoginTarefas {

    public static WebDriver driver;
    private static PaginaLogin cadastro;
    private Espera espera;

    public LoginTarefas(WebDriver driver) {

        this.driver = driver;
        cadastro = new PaginaLogin(this.driver);
        espera = new Espera(this.driver);
    }

    public void realizarCadastro(){
        cadastro.pegarInputEmailUsuario().sendKeys("wwwww@hotmail.com");
        cadastro.pegarBotaoCadastro().click();
        espera.carregarElemento(cadastro.pegarGeneroUsuario()).click();
        cadastro.pegarInputPrimeiroNomeUsuario().sendKeys("Cíntia");
        cadastro.pegarInputUltimoNomeUsuario().sendKeys("Valente");
        cadastro.pegarInputSenhaUsuario().sendKeys("minhasenha");
        cadastro.pegarDiaNascimentoUsuario().selectByValue("28");
        cadastro.pegarMesNascimentoUsuario().selectByValue("8");
        cadastro.pegarAnoNascimentoUsuario().selectByValue("1990");
        cadastro.pegarAceiteOfertas().click();
        cadastro.pegarInputEndereco().sendKeys("90 Bedford Street");
        cadastro.pegarInputCidade().sendKeys("Nova York");
        cadastro.pegarInputEstado().selectByValue("32");
        cadastro.pegarInputCep().sendKeys("10014");
        cadastro.pegarInputCelular().sendKeys("95487-86820");
        cadastro.pegarInputEmailAlternativo().sendKeys("cintia@email.com");
        espera.carregarElemento(cadastro.pegarBotaoRegistro()).click();
    }


}

