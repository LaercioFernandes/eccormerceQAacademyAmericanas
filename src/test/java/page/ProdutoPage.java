package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage extends BasePage {
	
	final String PRECO_NOTEBOOK = "//body/div[@id='content']/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]";
	
	public ProdutoPage(WebDriver driver) {
		super(driver);
	}

	public String retornaValorProduto() throws IOException {
		takeScreenShot("Retorna Valor do Produto");
		return driver.findElement(By.xpath(PRECO_NOTEBOOK)).getText();			

	}
	
	public void preencheClicaCep() {
		driver.findElement(By.xpath("//input[@id='freight-field']")).sendKeys("05346-000");
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
		

	}
	
	public void confirmaVoltagemProduto() {
		driver.findElement(By.xpath("//span[contains(text(),'Sim, continuar')]"));

	}
	
	private void clicarComprarProduto() {
		driver.findElement(By.xpath("//span[contains(text(),'comprar')]"));
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
