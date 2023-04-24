package ada.selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Entao;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.security.Key;


/**
 * @author CrisMoura on 16/04/2023
 */

public class BuscaProdutosStepDefinitions {
    static WebDriver driver;
    ChromeOptions options;

    @Before
    public void setupTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
    }
    @After
    public void tearDown() {
          driver.quit();
    }
    @Given("que estou na página inicial da Sephora")
    public void que_estou_na_página_inicial_da_sephora_com() throws InterruptedException {
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 20000)");
        Thread.sleep(2000);
        driver.get("https://www.sephora.com.br/");
    }
    @When("Digitar o nome do produto na barra de busca")
    public void digitar_o_nome_do_produto_na_barra_de_busca() {
        WebElement nomeProduto = driver.findElement(By.cssSelector("div[class=\"header-search search-auto-complete\"]"));
        nomeProduto.click();
        nomeProduto.findElement(By.cssSelector("impulse-autocomplete")).sendKeys("Perfumes Masculinos", Keys.ENTER);
    }
    @Then("nao efetuar a busca")
    public void nao_efetuar_a_busca() {
    }
    @Then("Deve listar os produtos de busca relacionadas")
    public void deve_listar_os_produtos_de_busca_relacionadas() {
        String listaProduto = "https://www.sephora.com.br/busca/?q=Perfumes%20Masculinos";
        Assertions.assertEquals(listaProduto,driver.getCurrentUrl());
    }
    @When("Digitar o produto desejado na barra de busca")
    public void digitar_o_produto_desejado_na_barra_de_busca() {
        WebElement digitarProduto = driver.findElement(By.cssSelector("div[class=\"header-search search-auto-complete\"]"));
        digitarProduto.click();
        digitarProduto.findElement(By.cssSelector("impulse-autocomplete")).sendKeys("batom", Keys.ENTER);
    }
    @When("Apertar a tecla enter")
    public void apertar_a_tecla_enter() {

    }
    @Then("Devera abrir a tela de resultados da busca")
    public void devera_abrir_a_tela_de_resultados_da_busca() {
        String telaEsperada = "https://www.sephora.com.br/busca/?q=batom";
        String telaAtual = driver.getCurrentUrl();
        Assertions.assertEquals(telaEsperada, telaAtual);

    }

    @Given("que estou na pagina de resultados de busca do produto")
    public void que_estou_na_pagina_de_resultados_de_busca_do_produto(){
        driver.manage().window().maximize();
        driver.get("https://www.sephora.com.br/");
        WebElement digitarProduto = driver.findElement(By.cssSelector("div[class=\"header-search search-auto-complete\"]"));
        digitarProduto.click();
        digitarProduto.findElement(By.cssSelector("impulse-autocomplete")).sendKeys("bolsas", Keys.ENTER);
        String telaEsperada = "https://www.sephora.com.br/busca/?q=bolsas";
        String telaAtual = driver.getCurrentUrl();
        Assertions.assertEquals(telaEsperada, telaAtual);
    }

//    @Entao("Deve ver a quantidade de produtos retornados na pagina")
//    public void deve_ver_a_quantidade_de_produtos_retornados_na_pagina() {
//        WebElement produtos = driver.findElement(By.className("quantity"));
//        Assertions.assertNotNull(produtos);
//    }

//    @Entao("devo ver sugestoes de busca relacionadas ao {string}")
//    public void devo_ver_sugestoes_de_busca_relacionadas_ao(String string) {
//        WebElement produtos = driver.findElement(By.className("quantity"));

//        Assertions.assertEquals(telaEsperada, telaAtual);
   // }
}
