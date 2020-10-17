package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {
	@Rule 
	public TestName testName = new TestName();
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void takeScreenShot(String nomeMetodo) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver; // Criando um obj do TakesScreenshot, recebendo um driver
		File arquivo = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("output" + File.separator +File.separator + nomeMetodo + ".jpg"));

	}

}
