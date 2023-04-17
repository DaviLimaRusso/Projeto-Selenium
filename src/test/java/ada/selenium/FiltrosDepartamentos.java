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