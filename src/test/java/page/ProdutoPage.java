package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {
	WebDriver driver;
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String retornaValorProduto() {
		return driver.findElement(By.cssSelector("div.ViewUI-sc-1ijittn-6.iXIDWU div.product-page__ViewUI-b5yzc3-0.gMBnqh.ViewUI-sc-1ijittn-6.iXIDWU div.GridUI-wcbvwm-0.idBPEj.ViewUI-sc-1ijittn-6.iXIDWU:nth-child(3) div.ColUI-gjy0oc-0.fOIaix.ViewUI-sc-1ijittn-6.iXIDWU section.product-main-area__CardProduct-sc-1xcgrsz-3.chekAC.CardUI-sc-1eg6n71-0.jxqtmm div.GridUI-wcbvwm-0.gZNans.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area__ProductMainAreaUI-sc-1xcgrsz-0.kcqktA.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__Wrapper-sc-1hat60-0.dKwBwA.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__ContentWrapper-sc-1hat60-1.jZtghT.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__BigSection-sc-4z0zqv-1.itEiUd.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__Section-sc-4z0zqv-2.dFlTFX.ViewUI-sc-1ijittn-6.iXIDWU:nth-child(1) div.main-offer__MainOfferView-sc-1c7pzd1-1.hKiULx.ViewUI-sc-1ijittn-6.iXIDWU div.main-offer__ContainerUI-sc-1c7pzd1-0.fjQzCD.ViewUI-sc-1ijittn-6.iXIDWU div.ViewUI-sc-1ijittn-6.iXIDWU div.price__ParagraphUI-ej7lo8-0.iAAPzD.ViewUI-sc-1ijittn-6.iXIDWU > span.price__SalesPrice-ej7lo8-2.kjGSBk.TextUI-sc-12tokcy-0.bLZSPZ")).getText();			

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
