package ada.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FiltrosStepDefinitions {
    public static void main(String[] args) {
        // Inicializa o driver do Firefox
        WebDriver driver = new FirefoxDriver();

        // Navega para a páginado Airbnb
        driver.get("https://www.airbnb.com.br/");

        // Seleciona a opção de filtro de preço "R$0 a R$100"
        WebElement preco = driver.findElement(By.cssSelector("[aria-controls='menuItemComponent-range_price-0-100']"));
        preco.click();

        // Resto do código aqui...
    }
}

//public class FiltrosStepDefinitions {
//    @Dado("que estou na página inicial do site www.airbnb.com")
//    public void anExampleScenario() {
//
//    }
//
//    @Quando("verifico o filtro padrão inicial")
//    public void allStepDefinitionsAreImplemented() {
//
//    }
//
//    @Entao("a página deve exibir habitações e estadias em frente à praia")
//    public void theScenarioPasses() {
//
//    }
//}

