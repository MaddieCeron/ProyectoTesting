package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import pom.OfertasPage;

public class StepOfertas extends TestCase {
	//declarar mi driver
    private WebDriver driver;
    //invocar mis pages necesarios
    OfertasPage ofertasPage;
    
    //PRUEBA 5: USUARIO VISUALIZA TODAS LAS OFERTAS DISPONIBLES
    @Given("Usuario ingresa Mercado Libre")
    public void usuario_ingresa_mercado_libre() throws InterruptedException{
    	ofertasPage = new OfertasPage(driver);
        driver = ofertasPage.chromeDriverConnection();
        ofertasPage.visit("https://www.mercadolibre.com.mx/");
    }
	
	@When("click en ofertas")
	public void click_en_ofertas()throws InterruptedException {
	    ofertasPage.clickOfertas();
	}

	@When("visualiza apartados de ofertas disponibles")
	public void visualiza_apartados_de_ofertas_disponibles() throws InterruptedException{
	    ofertasPage.PaginaOfertas();
	}

	@Then("visualiza apartado de ofertas")
	public void visualiza_apartado_de_ofertas() {
	    
	}
	
	//PRUEBA 6: USUARIO VISUALIZA TODAS LAS OFERTAS PERTENECIENTES A LA CATEGORIA LIQUIDACION	
	@When("click en liquidacion")
	public void click_en_liquidacion() throws InterruptedException {
		ofertasPage.clickSeccLiquidacion();
	}
	
	@When("visualiza apartados de liquidacion")
	public void visualiza_apartados_de_liquidacion() throws InterruptedException {
	   ofertasPage.clickSeccLiquidacion();
	}

	@Then("visualiza apartado de liquidacion")
	public void visualiza_apartado_de_liquidacion() {
	   
	}
	
	//PRUEBA 7: USUARIO VISUALIZA TODAS LAS OFERTAS PERTENECIENTES AL FILTRO DE ENVIO GRATIS	
	@When("click en envio gratis")
	public void click_en_envio_gratis() throws InterruptedException {
	    ofertasPage.clickCostoEnvioGratis();
	}

	@Then("visualiza productos con envio gratis")
	public void visualiza_productos_con_envio_gratis() {
	    
	}

}
