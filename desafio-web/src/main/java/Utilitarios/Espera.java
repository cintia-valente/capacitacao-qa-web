package Utilitarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Espera {

    private WebDriver driver;

    public Espera(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement visibilidadeDoElemento(By by) {

        WebDriverWait espera = new WebDriverWait(driver, 20);

        return espera.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public WebElement carregarElemento(WebElement elemento) {
        try {

            return new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(elemento));

        } catch (WebDriverException e) {

            return elemento;
        }
    }
}

