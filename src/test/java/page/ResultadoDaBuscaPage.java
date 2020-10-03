package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoDaBuscaPage {
	WebDriver driver;
	
	public ResultadoDaBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicaNotebook() {
		driver.findElement(By.xpath("//picture[1]/img[contains(@src,'https://images-americanas.b2w.io/produtos/01/00/offers/01/00/item/132490/7/132490742_1GG.png')]")).click();

	
	}
}
