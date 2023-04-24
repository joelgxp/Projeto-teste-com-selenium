package ada.selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FiltrosStepDefinitions {
    WebDriver driver;
    ChromeOptions options;

    @Before
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
    }

    // Cenário: O filtro padrão deve ser "Praia"
    @Dado("que estou na página inicial")
    public void paginaInicial() {
        driver.get("https://www.airbnb.com.br/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
    }

    @Entao("o filtro carregado deve ser Praia")
    public void filtroPadraoPraia() {
        WebElement praiaFilter = driver.findElement(By.xpath("//span[text()='Praia']"));
        Assertions.assertTrue(praiaFilter.isSelected());
    }


    // Cenário: Devo poder alternar entre os filtros de propriedades, que devem me retornar hospedagens de acordo com o que procuro

    WebElement casteloFilter;
    WebElement microcasaFilter;
    @Quando("eu clicar no filtro 'Castelos'")
    public void clicarFiltroCastelos() {
        new WebDriverWait(driver, Duration.ofSeconds(6));
        casteloFilter = driver.findElement(By.xpath("//span[text()='Castelos']"));
    }

    @Então("a página deve mostrar propriedades do tipo Castelos")
    public void aPaginaDeveMostrarPropriedadesDoTipoCastelos() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        Assertions.assertTrue(casteloFilter.isSelected());
    }

    @E("quando eu clicar sobre o filtro 'Microcasas'")
    public void quandoEuClicarSobreOFiltroMicrocasas() {
        microcasaFilter = driver.findElement(By.xpath("//span[text()='Microcasas']"));
    }

    @Então("a página deve exibir propriedades do tipo Microcasas")
    public void aPaginaDeveExibirPropriedadesDoTipoMicrocasas() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Assertions.assertTrue(microcasaFilter.isSelected());
    }


    // Cenário: A aba de filtros deve fechar ao clicar sobre o 'x'

    @Dado("que abro a sessão de filtros")
    public void queAbroASessãoDeFiltros() {
        driver.get("https://www.airbnb.com.br/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement botaoFiltros = driver.findElement(By.tagName("category-bar-filter-button"));
        botaoFiltros.click();
    }

    @Quando("clico no {string} para fechar")
    public void clicoNoXParaFechar() {
        WebElement botaoX = driver.findElement(By.className("i1h5tsj6 dir dir-ltr"));
        new WebDriverWait(driver, Duration.ofSeconds(3));
        botaoX.click();
    }

    @Então("a aba de filtros se fecha")
    public void aAbaDeFiltrosSeFecha() {
        Assertions.assertFalse(driver.findElement(By.className("i1h5tsj6 dir dir-ltr")).isDisplayed());
    }
}

