package ada.selenium;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AnuncianteStepDefinitions {
    WebDriver driver;
    ChromeOptions options;

    @Before
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
    }

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


}


