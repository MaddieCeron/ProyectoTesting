package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import pom.AgregarCarritoPage;


public class Step extends TestCase{
	
	//declarar mi driver
    private WebDriver driver;
    //invocar mis pages necesarios
    AgregarCarritoPage agregarCarritoPage;
  
   
//PRUEBA 1: AGREGAR PRODUCTO A CARRITO DE COMPRA
    @Given("usuario ingresa Mercado Libre")
    public void usuario_ingresa_mercado_libre() {
    	agregarCarritoPage = new AgregarCarritoPage(driver);
        driver = agregarCarritoPage.chromeDriverConnection();
        agregarCarritoPage.visit("https://www.mercadolibre.com.mx/");
    }
    
    @When("usuario busca un producto")
    public void usuario_busca_un_producto() throws InterruptedException {
        agregarCarritoPage.BusquedaProducto();
    }

    @When("selecciona un producto")
    public void selecciona_un_producto() throws InterruptedException {
        agregarCarritoPage.AgregarProducto();
    }

    @When("click en agregar a carrito")
    public void click_en_agregar_a_carrito() throws InterruptedException {
        agregarCarritoPage.AgregarCarrito();
    }

    @Then("visualiza pagina de ingreso cuenta")
    public void visualiza_boton_de_agregar_carrito() {
    	assertEquals("¡Hola! Para agregar al carrito, ingresa a tu cuenta", agregarCarritoPage.MensajeConfirmarCuenta());
    }

    //PRUEBA 2: A PARTIR DE BUSCAR UN PRODUCTO, FILTRAR POR MARCA Y RANGO DE PRECIOS
    @When("usuario selecciona marca producto")
    public void usuario_selecciona_marca_producto() throws InterruptedException {
        agregarCarritoPage.BusquedaMarca();
    }

    @When("usuario ingresa rango precio")
    public void usuario_ingresa_rango_precio() throws InterruptedException {
        agregarCarritoPage.BusquedaRangoPrecio();
    }

    @Then("visualiza pagina de productos")
    public void visualiza_pagina_de_productos() {
    	assertEquals("Croquetas", agregarCarritoPage.MensajeConfirmarResultados());
        
    }
    
   //PRUEBA 10: A PARTIR DE BUSCAR UN PRODUCTO, FILTRAR POR PRODUCTOS MÁS RELEVANTES
    @When("selecciona filtro mas relevantes")
    public void selecciona_filtro_mas_relevantes() throws InterruptedException{
        agregarCarritoPage.filtroRelevantes();
    }

    @Then("visualiza productos")
    public void visualiza_productos() {
        
    }
}
