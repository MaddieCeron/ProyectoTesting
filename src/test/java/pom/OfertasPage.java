package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfertasPage extends Base {
	 public OfertasPage(WebDriver driver) {
	        super(driver);
	 }
	 	// Definir los localizadores de los elementos necesarios
	 	By BtnOfertas = By.xpath("(//a[@class='nav-menu-item-link'])[1]");
		By BtnEnvioGratis = By.xpath("(//a[@class='list_element '])[28]");
		By BtnLiquidacion = By.xpath("(//div[@class='carousel_item '])[4]");
		By ImgOfertas = By.xpath("//img[@src='https://http2.mlstatic.com/storage/splinter-admin/o:f_webp,q_auto:best/1583341146061-todas-las-ofertas@3x.png']");
		
		//Acciones dentro de la pagina
	    public void clickOfertas() throws InterruptedException {
	        Thread.sleep(2000);
	        click(BtnOfertas);
	    }
		
		public void clickCostoEnvioGratis() {
			scrollHacia(BtnEnvioGratis);
			click(BtnEnvioGratis);
		}
		
		public void clickSeccLiquidacion() {
			click(BtnLiquidacion);
		}
		
		 public boolean PaginaOfertas(){
		        if(isDisplayed(ImgOfertas)){
		            System.out.println("Estas en el apartado de Ofertas");
		            return true;
		        } else {
		            System.out.println("Elemento no encontrado");
		            return false;
		        }
		    }
		

}
