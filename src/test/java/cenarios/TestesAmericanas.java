package cenarios;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.ProdutoPage;
import page.ResultadoDaBuscaPage;

public class TestesAmericanas {
	WebDriver driver;
	HomePage homePage;
	ResultadoDaBuscaPage resultadoDabuscaPage;
	ProdutoPage produtoPage;
	
	@Before
	public void before() {
		verificaSistemaOperacionalESetaChromeDriver();
		configuraChromeDriver();
		homePage = new HomePage(driver);
		resultadoDabuscaPage = new ResultadoDaBuscaPage(driver);
		produtoPage = new ProdutoPage(driver);

	}

	@After
	public void fecharSite() {
		driver.quit();

	}

	@Test
	public void buscarNotebook() {
		String preco = "R$ 6.599,99";
		homePage.abrirUrl("http://www.americanas.com");
		homePage.realizarBuscaProdutoEClica("MacBook Air MQD32BZ/A");
		resultadoDabuscaPage.clicaNotebook();
		String valorSite = produtoPage.retornaValorProduto();
		System.out.println("Valor Retornado: " + valorSite);
		assertEquals("Valor diferente do que o esperado:", preco, valorSite);

	}
/**
 * Configura o Chrome Driver com espera Implicita de até 60 Segundos
 */
	private void configuraChromeDriver() {
		
		driver = new ChromeDriver();
		
		//Configura espera de até 60 Segundos qualquer elemento. 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		
		
	}

	private void verificaSistemaOperacionalESetaChromeDriver() {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					"chromedriver.exe");
		}else {
			System.setProperty("webdriver.chromer.driver",
					"chromedriver");
		}
	}

}
