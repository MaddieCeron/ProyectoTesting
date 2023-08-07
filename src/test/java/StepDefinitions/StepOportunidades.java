package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import pom.OportunidadesLaboralesPage;

import org.openqa.selenium.WebDriver;

public class StepOportunidades extends TestCase{
	//declarar mi driver
    private WebDriver driver;
    //invocar mis pages necesarios
    OportunidadesLaboralesPage oportunidadesLaboralesPage;
    
    //PRUEBA 3: USUARIO VISUALIZA LA PAGINA DE OFERTAS LABORALES
    @Given("usuario ingresa mercado Libre")
    public void usuario_ingresa_mercado_libre() {
    	oportunidadesLaboralesPage = new OportunidadesLaboralesPage(driver);
        driver = oportunidadesLaboralesPage.chromeDriverConnection();
       oportunidadesLaboralesPage.visit("https://www.mercadolibre.com.mx/");
    }
    
    @When("usuario busca trabajo")
    public void usuario_busca_trabajo() throws InterruptedException{
        oportunidadesLaboralesPage.BusquedaTrabajo();
    }

    @When("selecciona ver oportunidades")
    public void selecciona_ver_oportunidades()throws InterruptedException {
        oportunidadesLaboralesPage.VerOportunidades();
    }

    @Then("visualiza pagina de oportunidades")
    public void visualiza_pagina_de_oportunidades() {
    	assertEquals("Oportunidades en MELI", oportunidadesLaboralesPage.MensajeConfirmarOportunidades());
    }

   //PRUEBA 4: USUARIO SE POSTULA PARA ALGUNA OFERTA LABORAL  
    @When("selecciona Postularse")
    public void selecciona_postularse() throws InterruptedException{
        oportunidadesLaboralesPage.Postularse();
    }

    @When("completa sus datos")
    public void completa_sus_datos()throws InterruptedException {
        oportunidadesLaboralesPage.CompleteData();
    }

    @When("click en continuar")
    public void click_en_continuar()throws InterruptedException {
       oportunidadesLaboralesPage.clickContinuar();
    }

    @Then("postulacion exitosa")
	public void postulacion_exitosa() {
	   
	}
}
