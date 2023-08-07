package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import pom.MetodosPagoPage;


//PRUEBA 8: USUARIO INGRESA AL HOME DE MERCADO PAGO
public class StepMetodoPago extends TestCase{
	//declarar mi driver
    private WebDriver driver;
    //invocar mis pages necesarios
   MetodosPagoPage metodosPagoPage;
    
   @Given("el usuario ingresa a mercado libre")
   public void el_usuario_ingresa_a_mercado_libre() {
	   metodosPagoPage = new MetodosPagoPage(driver);
       driver = metodosPagoPage.chromeDriverConnection();
       metodosPagoPage.visit("https://www.mercadolibre.com.mx/");
   }

   @When("click como pagar")
   public void click_como_pagar()throws InterruptedException {
       metodosPagoPage.clickComoPagar();
   } 

   @Then("visualiza mercado pago")
   public void visualiza_mercado_pago() {
	   assertTrue(metodosPagoPage.validarMercadoPago());
   }
   
   //PRUEBA 9: USUARIO INGRESA AL APARTADO DETALLADO DE MERCADO PAGO  
   @When("click en mercado pago")
   public void click_en_mercado_pago() throws InterruptedException{
      metodosPagoPage.clickMercadoPago();
   }

   @When("click conocer las cuentas")
   public void click_conocer_las_cuentas()throws InterruptedException {
       metodosPagoPage.clickCuentas();
   }

}
