package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OportunidadesLaboralesPage extends Base {
	public OportunidadesLaboralesPage(WebDriver driver) {
        super(driver);
	}
	// Definir los localizadores de los elementos
	By BtnOfertasTrabajo = By.xpath("//a[text()='Trabaja con nosotros']");
	By BtnVerOportunidades = By.xpath("(//span[@class='styles__Wrapper-sc-g49ob4-0 bpAbpc button button'])[1]");
	By TxtMeli = By.xpath("//*[@class='col-md-12 all-positions-header col-sm-12 col-xs-12 ']");
	By BtnPostularse = By.xpath("//button[@class='btn position-apply-button  ']");
	By BtnNombre = By.xpath("(//input[@class='form-control apply-form-text-input'])[1]");
	By BtnApellido = By.xpath("(//input[@class='form-control apply-form-text-input'])[2]");
	By BtnNumTel = By.xpath("(//input[@class='form-control apply-form-text-input'])[3]");
	By BtnConfirmacion = By.xpath("(//input[@class='select-input_wGbAi59 input-medium_vB9cAJb pill-shape_VI1Qnyg pill-shape-with-icon-button_Spo8nfv input-stretch_VZcUk0E right-icon_fyfzLub clear-not-visible_i3H98Bv'])[1]");
	By BtnCorreo = By.xpath("(//input[@class='form-control apply-form-text-input'])[4]");
	By BtnLinkdIn = By.xpath("(//input[@class='form-control apply-form-text-input'])[5]");
	By BtnContinuarPost = By.xpath("//button[@class='btn-sm btn-primary pointer position-apply-button']");
	By LblVerificarPostulacion = By.xpath("//p[@class='sub-title']");
	By BtnPrivacidad = By.xpath("(//button[@class='icon-button_n6jMJ_3 right-icon_fyfzLub button_ir66sw5 button-system-ui_u0RC0pq transparent_QpLDg_Y button-medium_wvT76RU round-shape_Xnr0CB8 icon-left_jwxTZMU'])[1]");
	By BtnConfirmarPrivacidad = By.xpath("(//button[@class='menu-item-button_G1RYpSC'])[1]");
	
	//Acciones dentro de la pagina
	public void BusquedaTrabajo() throws InterruptedException{
		scrollHacia(BtnOfertasTrabajo);
		Thread.sleep(2000);
		click(BtnOfertasTrabajo);
	}
	
	public void VerOportunidades() throws InterruptedException{
		Thread.sleep(2000);
		click(BtnVerOportunidades);
	}
	
	public String MensajeConfirmarOportunidades(){
    	isDisplayed(TxtMeli);
		String result = getText(TxtMeli);
		return result;
    }
	
	public void Postularse() throws InterruptedException{
		Thread.sleep(2000);
		click(BtnPostularse);
	}
	
	public void CompleteData() throws InterruptedException{
		Thread.sleep(2000);
		type("Dom", BtnNombre);
		type("Murphy", BtnApellido);
		type("5573928403", BtnNumTel);
		type("prueba@gmail.com", BtnCorreo);
		type("LinkdPrueba", BtnLinkdIn);
		
	}
	
	public void clickContinuar() throws InterruptedException {
		click(BtnPrivacidad);
		Thread.sleep(1000);
		click(BtnConfirmarPrivacidad);
		click(BtnContinuarPost);
	}
	
	public Boolean confPostulacion() {
		return isDisplayed(LblVerificarPostulacion);
	}
	
}

