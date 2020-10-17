package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

public HomePage(WebDriver driver) {
		super(driver);
	}

public void abrirUrl(String url) {
	driver.get(url);

}

public void realizarBuscaProdutoEClica(String produto) throws IOException {
	
		driver.findElement(By.cssSelector("#h_search-input")).sendKeys(produto);
		driver.findElement(By.xpath("//button[@id='h_search-btn']")).click();
		takeScreenShot("realizarBuscaProdutoEClica");

}

		
}
