package ada.selenium;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;


public class FiltrosDepartamentos {
    public ChromeDriver chromeDriver;
    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
    }

    @Given("Levar aos Perfumes mais vendidos")
    public void acessarSite() {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.sephora.com.br/");
        chromeDriver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @When("Acessar o site e clicar no departamento de Perfumes")
    public void acessarDepartamentoPerfumes() {
        chromeDriver.findElement(By.xpath("//*[@id=\"topCategoryLinkPerfumes\"]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]")).click();
    }

    @Then("Alterar para os produtos mais vendidos do departamento")
    public void alterarFiltro() {
        chromeDriver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]/option[2]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]/option[2]")).isDisplayed();
    }

}