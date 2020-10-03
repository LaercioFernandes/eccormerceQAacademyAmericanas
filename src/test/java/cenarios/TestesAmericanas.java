package cenarios;

import static org.junit.Assert.assertEquals;

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
		driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();		
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
		String preco = "R$1.759,99";
		String valorFrete = "";
		homePage.abrirUrl("http://www.americanas.com");
		homePage.realizarBuscaProdutoEClica("MacBook Air MQD32BZ/A");
		resultadoDabuscaPage.clicaNotebook();
		String valorSite = produtoPage.retornaValorProduto();
		System.out.println("Valor Retornado: " + valorSite);
		assertEquals("Valor diferente do que o esperado:", preco, valorSite);

	}

	private void configuraChromeDriver() {
		
	}

	private void verificaSistemaOperacionalESetaChromeDriver() {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Laercio\\eclipse-workspace-Iterasys\\siteIterasys2\\Drivers\\chromedriver.exe");
		}else {
			System.setProperty("webdriver.chromer.driver",
					"chromedriver");
		}
	}

}
