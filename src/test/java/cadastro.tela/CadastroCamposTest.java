package cadastro.tela;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CadastroCamposTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://netorgft4015814-my.sharepoint.com/:u:/g/personal/joao_vieck_warmupweb_com/ERI0uONwcihAgMqxIKzPw7QBcTh2M9B6DhlSJbp4dRasNg");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void CadastroPreenchimentoAll() throws InterruptedException {
        Thread.sleep(1000);

        driver.switchTo().frame(0);
        WebElement nomeCompleto = driver.findElement(By.xpath("//input[@id='nome_completo']"));
        WebElement telefoneUsuario = driver.findElement(By.xpath("//input[@id='telefone']"));
        WebElement nomeRua = driver.findElement(By.xpath("//input[@id='nome_rua']"));
        WebElement numeroCasa = driver.findElement(By.xpath("//input[@id='numero']"));
        WebElement complemento = driver.findElement(By.xpath("//input[@id='complemento']"));
        WebElement bairro = driver.findElement(By.xpath("//input[@id='bairro']"));
        WebElement cidade = driver.findElement(By.xpath("//input[@id='cidade']"));
        WebElement estado = driver.findElement(By.xpath("//input[@id='estado']"));
        WebElement cepEndereco = driver.findElement(By.xpath("//input[@id='cep']"));
        WebElement botaoSalvar = driver.findElement(By.xpath("//button[@type='submit']"));

        nomeCompleto.sendKeys("Ricardo Teste");
        telefoneUsuario.sendKeys("84999990000");
        nomeRua.sendKeys("Rua Bom Pastor");
        numeroCasa.sendKeys("2224");
        complemento.sendKeys("6 Andar, Sala 611");
        bairro.sendKeys("Ipiranga");
        cidade.sendKeys("São Paulo");
        estado.sendKeys("SP");
        cepEndereco.sendKeys("04203022");
        Thread.sleep(2000);
        botaoSalvar.click();
        Thread.sleep(2000);
    }


}
