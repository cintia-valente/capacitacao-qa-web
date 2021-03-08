package Suporte;

import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    private static final String PATH_SCREENSHOT = GeradorRelatorio.PATH_REPORT + File.separator + "Screenshot";

    public static MediaEntityModelProvider capture(WebDriver driver) {

        try {
            CriarPasta.criarPastaDoRelatorio(PATH_SCREENSHOT);
            File scrshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String caminhoCapturaTela = PATH_SCREENSHOT + File.separator + "Imagem_" + ConfiguraData.pegarDataFormatadaCapturaTela() + ".png";
            FileUtils.copyFile(scrshot, new File(caminhoCapturaTela));
            return MediaEntityBuilder.createScreenCaptureFromPath(caminhoCapturaTela).build();
        } catch (IOException e) {
            String mensagem = "Ocorreu uma falha na captura de tela.";
            Relatorio.log(Status.WARNING, mensagem);
        }

        return null;
    }

    public static MediaEntityModelProvider fullPageBase64(WebDriver driver) {
        try {
            PageSnapshot capturaTela = Shutterbug.shootPage(driver);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();

            ImageIO.write(capturaTela.getImage(), "png", stream);
            String imagemBase64 = Base64.encodeBase64String(stream.toByteArray());

            return MediaEntityBuilder.createScreenCaptureFromBase64String(imagemBase64).build();
        } catch (ScreenshotException | IOException e) {
            String mensagem = "Ocorreu uma falha na captura de tela.";
            Relatorio.log(Status.WARNING, mensagem);
        }

        return null;
    }
}
