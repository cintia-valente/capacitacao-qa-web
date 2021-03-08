package Tasks;

import PageObjects.PaginaLogin;
import org.openqa.selenium.WebDriver;

public class LoginTarefas {

    public static WebDriver driver;
    private static PaginaLogin cadastro;

    public LoginTarefas(WebDriver driver) {

        this.driver = driver;
        cadastro = new PaginaLogin(this.driver);
    }

    public void realizarCadastro(){
        cadastro.pegarInputEmailUsuario().sendKeys("cintiavalente@hotmail.com.br");
        cadastro.pegarBotaoCadastro().click();
        //cadastro.pegarGeneroUsuario().click();
        cadastro.pegarInputPrimeiroNomeUsuario().sendKeys("Cíntia");
        cadastro.pegarInputUltimoNomeUsuario().sendKeys("Valente");
        cadastro.pegarInputSenhaUsuario().sendKeys("minhasenha");
        //cadastro.pegarDiaNascimentoUsuario().click();
        //cadastro.pegarMesNascimentoUsuario().click();
        //cadastro.pegarAnoNascimentoUsuario().click();
        cadastro.pegarAceiteOfertas().click();
        cadastro.pegarInputPrimeiroNomeParaEndereco().sendKeys("Cíntia");
        cadastro.pegarInputUltimoNomeParaEndereco().sendKeys("Valente");
        cadastro.pegarInputEndereco().sendKeys("90 Bedford Street");
        cadastro.pegarInputCidade().sendKeys("Nova York");
        //cadastro.pegarInputEstado().click();
        cadastro.pegarInputCep().sendKeys("10014");
        cadastro.pegarInputCelular().sendKeys("95487-86820");
        cadastro.pegarInputEmailAlternativo().sendKeys("cintia@email.com");
    }

    public void continuaCadastro(){
        cadastro.pegarBotaoRegistro().click();
    }

}

