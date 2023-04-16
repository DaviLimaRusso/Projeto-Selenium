package ada.selenium;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FiltrosDepartamentos {
    public ChromeDriver chromeDriver;
    public FiltrosDepartamentos() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chromeDriver = new ChromeDriver(options);
    }

    @Test
    public void acessarDepartamentoPerfumes() {

        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.sephora.com.br/");
        chromeDriver.findElement(By.xpath("//*[@id=\"topCategoryLinkPerfumes\"]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"grid-sort-header\"]/option[2]")).click();

    }
}

//HG2R2 - Filtro por departamentos
//Como usuário, mesmo que não esteja logado
//Quero realizar buscar produtos por departamentos
//Para encontrar produtos do departamento que tenho interesse
//r1: Ao selecionar um departamento, deve redirecionar (na mesma aba) para produtos do departamento selecionado
//r2: Deve exibir lista de produtos mais vendidos da categoria
//r3: Dentro da tela de resultados da categoria, devem haver tipos de produtos para que o usuário possa afunilar ainda mais a busca (ex: Eletrodomésticos > Airfryer)