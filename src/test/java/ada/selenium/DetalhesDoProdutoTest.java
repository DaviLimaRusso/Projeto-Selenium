package ada.selenium;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DetalhesDoProdutoTest {
    ChromeDriver driver;
    String BaseUrlProduto = "https://www.sephora.com.br/";

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Given("que estou na tela com o batom escolhido")
    public void Produtos() {
        driver.get(BaseUrlProduto);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("clico na imagem")
    public void ClicarImagem() {

    }

    @Then("é aplicado um zoom no produto")
    public void ZoomImagem() {

    }

    @When("clico em 'Avaliações'")
    public void ClicarAvaliacao() {

    }

    @Then("sou direcionado para 'Avaliações' com a classificação do produto")
    public void VisualizarAvaliacao() {

    }

    @When("clico em '?' após 'Beaty Club'")
    public void ClicarProgramaDePontos() {

    }

    @Then("abre um pop-up com texto informativo sobre o programa de pontos")
    public void VisualizarProgramaDePontos() {

    }

    @Given("que estou na tela com o batom escolhido")
    public void Batom() {
    }

    @When("clico no link 'Ver descrição completa' ao lado direito da tela, abaixo da imagem")
    public void ClicarDescricaoo() {

    }

    @Then("sou direcionado para o texto informativo, na mesma tela, com as descrições do produto")
    public void VisualizarDescricao() {

    }

    @When("clico emm 'Modo de usar', abaixo da imagem do produto")
    public void ClicarModoDeUsar() {

    }

    @Then("sou direcionado para o texto informativo, na mesma tela, de como utilizar o produt")
    public void VisualizarModoDeUsar() {

    }

    @Then("clico emm 'Especificações', abaixo da imagem do produto")
    public void ClicarEspecificacoes() {

    }

    @Then("sou direcionado para o texto informativo, na mesma tela, as especificações técnicas do produto")
    public void VisualizarEspecificacoes() {

    }

}