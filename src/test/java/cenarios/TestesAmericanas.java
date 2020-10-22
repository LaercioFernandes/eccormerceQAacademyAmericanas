package cenarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.MidiDevice.Info;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import exceptions.ElementoNaoEncontradoException;
import page.BasePage;
import page.HomePage;
import page.ProdutoPage;
import page.ResultadoDaBuscaPage;

public class TestesAmericanas {

	WebDriver driver;
	HomePage homePage;
	ResultadoDaBuscaPage resultadoDabuscaPage;
	ProdutoPage produtoPage;
	public static final Logger logger = Logger.getLogger(TestesAmericanas.class);

	
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
	public void buscarNotebook() throws IOException{
		try {
			String preco = "R$ 6.799,99";
			homePage.abrirUrl("http://www.americanas.com");
			homePage.realizarBuscaProdutoEClica("MacBook Air MQD32BZ/A");
			resultadoDabuscaPage.clicaCookies();
			resultadoDabuscaPage.clicaNotebook();
			String valorSite = produtoPage.retornaValorProduto();
			logger.info("Valor Retornado: " + valorSite);
			logger.info(preco);
			assertEquals("Valor diferente do que o esperado:", preco, valorSite);

		} catch (Exception e) {
			logger.info(e.getStackTrace() + " " + e.getMessage());
			fail();
		}
						
		

	}
/**
 * Configura o Chrome Driver com espera Implicita de até 60 Segundos
 */
	private void configuraChromeDriver() {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(
//				   "--headless",
				   "--disable-web-security",
				   "--ignore-certificate-errors",
				   "--disable-gpu",
				   "window-size=1200x600",
				   "disable-popup-blocking",
				   "disable-infobars"
				  );
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	private void verificaSistemaOperacionalESetaChromeDriver() {
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {
			System.setProperty("webdriver.chrome.driver",
					"chromedriver.exe");
		}else {
			System.setProperty("webdriver.chrome.driver",
					"chromedriver");
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
