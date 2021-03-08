package Suporte;

//import Utilitarios.FileOperations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TesteBase extends GerenciadorDriver{

    private static WebDriver driver;
    private String URL = "http://automationpractice.com/index.php?id_product=2&controller=product";

    public static WebDriver pegarDriver(){

        driver = pegarDriver(TipoDriver.CHROME);
        return driver;
    }

    @BeforeEach
    public void setUp(){

        //pegarDriver().get(URL);
        //String index = FileOperations.getPropriedades("url").getProperty("url");
        //configReportExtent();
        pegarDriver().get(URL);
    }

   @AfterEach
    public void encerraDrive(){

        //Relatorio.fecha();
        encerrarDriver();
    }

}
