package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MetodosPagoPage extends Base{
	public MetodosPagoPage(WebDriver driver) {
        super(driver);
    }
	
	// Definir los localizadores de los elementos necesarios
	 By BtnComoPagar = By.xpath("//a[normalize-space()='Cómo pagar con Mercado Pago']");
	 By ImgMercadoPago = By.xpath("//*[@href='https://www.mercadopago.com.mx']");
	 By BtnConoceCuentas = By.xpath("//*[@href='/cuenta#from=home_landing']");
	 By TxtMercadoPago = By.linkText("Mercado Pago");
	 
	 //Acciones dentro de la pagina
	 public void clickComoPagar() throws InterruptedException {
	        Thread.sleep(2000);
	        click(BtnComoPagar);

	    }
	 
	 public void clickMercadoPago() throws InterruptedException{
		 Thread.sleep(2000);
		 click(ImgMercadoPago);
	 }
	 
	 public void clickCuentas() throws InterruptedException{
		 Thread.sleep(2000);
		 click(BtnConoceCuentas);
	 }
	 
	 //Validar que el usuario se encuentra en el home de Mercado Pago
	    public boolean MercadoPago() {
	        if(isDisplayed(TxtMercadoPago)){
	            System.out.println("Mercado Pago");
	            return true;
	        } else {
	            System.out.println("Elemento no encontrado");
	            return false;
	        }
	    }

	    //Validar que el usuario ingreso al apartado de Mercado Pago
	    public boolean validarMercadoPago () {
	        if(isDisplayed(ImgMercadoPago)){
	            System.out.println("Metodo de pago por Mercado Pago");
	            return true;
	        } else {
	            System.out.println("Elemento no encontrado");
	            return false;
	        }
	    }
}
