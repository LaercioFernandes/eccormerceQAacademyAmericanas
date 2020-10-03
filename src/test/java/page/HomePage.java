package page;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	String url;
	WebDriver driver;

	@Before
	public void abrirSite() {

		url = "http://www.americanas.com";
		System.setProperty("webdriver.chromer.driver",
				"C:\\Users\\Laercio\\eclipse-workspace-Iterasys\\siteIterasys2\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

	}
	
	@After
	public void fecharSite() {
		driver.quit();

	}

	@Test
	public void consultarItem() {
		driver.get(url);
		driver.findElement(By.cssSelector("#h_search-input")).sendKeys("notebook");
		driver.findElement(By.xpath("//button[@id='h_search-btn']")).click();
		
		driver.findElement(By.cssSelector("div.ViewUI-sc-1ijittn-6.iXIDWU div.container:nth-child(3) div.row div.col-lg-10.col-lg-push-2.col-md-9.col-md-push-3.col-xs-12 div.row:nth-child(2) div.col-md-12.col-xs-12:nth-child(6) div.row.product-grid.no-gutters.main-grid:nth-child(1) div.product-grid-item.ColUI-gjy0oc-0.hFbhrr.ViewUI-sc-1ijittn-6.iXIDWU:nth-child(2) div.product-v2__ProductCardV2-sc-19wdoj3-0.eyBjmn.Wrapper-bwhjk3-0.kshSRb.ViewUI-sc-1ijittn-6.iXIDWU div.RippleContainer-sc-1rpenp9-0.dMCfqq a.Link-bwhjk3-2.iDkmyz.TouchableA-p6nnfn-0.joVuoc section.SectionUI-bwhjk3-3.hcnsuQ.ViewSection-sc-1ijittn-2.jMrcKt div.product-card-photo.Photo-bwhjk3-4.feDKYY.ViewUI-sc-1ijittn-6.iXIDWU div.LazyImageWrapper-kse9g2-0.eTqSNU.ViewUI-sc-1ijittn-6.iXIDWU > div.WrapperPicture-sc-9rtsvr-2.iGANWj.ViewUI-sc-1ijittn-6.iXIDWU")).click();
		
		
		String preco="R$1.759,99";
		String valorSite =" ";
		String valorFrete=" ";
		
		
		
		valorSite = driver.findElement(By.cssSelector("div.ViewUI-sc-1ijittn-6.iXIDWU div.product-page__ViewUI-b5yzc3-0.gMBnqh.ViewUI-sc-1ijittn-6.iXIDWU div.GridUI-wcbvwm-0.idBPEj.ViewUI-sc-1ijittn-6.iXIDWU:nth-child(3) div.ColUI-gjy0oc-0.fOIaix.ViewUI-sc-1ijittn-6.iXIDWU section.product-main-area__CardProduct-sc-1xcgrsz-3.chekAC.CardUI-sc-1eg6n71-0.jxqtmm div.GridUI-wcbvwm-0.gZNans.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area__ProductMainAreaUI-sc-1xcgrsz-0.kcqktA.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__Wrapper-sc-1hat60-0.dKwBwA.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__ContentWrapper-sc-1hat60-1.jZtghT.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__BigSection-sc-4z0zqv-1.itEiUd.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__Section-sc-4z0zqv-2.dFlTFX.ViewUI-sc-1ijittn-6.iXIDWU:nth-child(1) div.main-offer__MainOfferView-sc-1c7pzd1-1.hKiULx.ViewUI-sc-1ijittn-6.iXIDWU div.main-offer__ContainerUI-sc-1c7pzd1-0.fjQzCD.ViewUI-sc-1ijittn-6.iXIDWU div.ViewUI-sc-1ijittn-6.iXIDWU div.price__ParagraphUI-ej7lo8-0.iAAPzD.ViewUI-sc-1ijittn-6.iXIDWU > span.price__SalesPrice-ej7lo8-2.kjGSBk.TextUI-sc-12tokcy-0.bLZSPZ")).getText();			
		System.out.println(valorSite);
		preco=valorSite;
		assertEquals("Valor diferente do que o esperado:", preco, valorSite);
		driver.findElement(By.xpath("//input[@id='freight-field']")).sendKeys("05346-000");
		driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
		
			
		
		
		
		
	}

		
}
