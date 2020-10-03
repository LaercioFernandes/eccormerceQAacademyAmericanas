package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoDaBuscaPage {
	WebDriver driver;
	
	public ResultadoDaBuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicaNotebook() {
		driver.findElement(By.xpath("contains(text(),'MacBook Air MQD32BZ/A com Intel Core i5 Dual Core 8GB 128GB SSD 13'' Prata - Apple')]")).click();
	}
}
