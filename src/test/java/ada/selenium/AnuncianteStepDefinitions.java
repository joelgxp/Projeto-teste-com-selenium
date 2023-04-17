package ada.selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AnuncianteStepDefinitions {
    WebDriver driver;
    ChromeOptions options;

    @Before
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
    }
//    @After
//    public void after() {
//        driver.quit();
//    }

    @Dado("que usuario esta na homepage")
    public void que_usuario_esta_na_homepage() {
        driver.get("https://www.airbnb.com.br/");
    }
    @Quando("clicar sobre o botao anuncie seu espaco")
    public void clicar_sobre_o_botao_anuncie_seu_espaco() {
        driver.findElement(By.xpath("//*[@id=\"site-content\"]/div/div/div/header/div/div[3]/nav/div[1]/a")).click();
    }
    @Entao("deverá ser redirecionado para pagina do anunciante")
    public void deverá_ser_redirecionado_para_pagina_do_anunciante() {
        Assertions.assertEquals("https://www.airbnb.com.br/host/homes", driver.getCurrentUrl());
    }

    @Dado("que na tela de anunciantes")
    public void que_na_tela_de_anunciantes() {
        driver.get("http://www.airbnb.com.br/host/homes");
    }
    @Quando("clicar em simular o valor de hospedagens")
    public void clicar_em_simular_o_valor_de_hospedagens() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.className("_wwvtb8")));
        driver.findElement(By.className("_wwvtb8")).click();
    }
    @Entao("deverá ter os campos localização, tipo de espaço, quantidades de quartos")
    public void deverá_ter_os_campos_localização_tipo_de_espaço_quantidades_de_quartos() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()=\"Endereço ou região\"]")));
        WebElement element = driver.findElement(By.xpath("//h2[text()=\"Endereço ou região\"]"));
        Assertions.assertEquals("Endereço ou região", element.getText());

    }

    @Dado("qua na tela do anunciante")
    public void qua_na_tela_do_anunciante() {
        driver.get("http://www.airbnb.com.br/host/homes");
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
    }
    @Quando("clicar no botão Anuncio Facil AirBnb")
    public void clicar_no_botão_anuncio_facil_air_bnb() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("._ug2ysd9")));
        driver.findElement(By.cssSelector("._ug2ysd9")).click();
    }
    @Entao("devera abrir um modal Entrar ou cadastrar-se")
    public void devera_abrir_um_modal_entrar_ou_cadastrar_se() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._u72b34")));
        Assertions.assertEquals("Bem-vindo ao Airbnb", driver.findElement(By.cssSelector("._u72b34")).getText());
    }



}


