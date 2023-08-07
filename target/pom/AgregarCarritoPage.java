package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AgregarCarritoPage extends Base {
	public AgregarCarritoPage(WebDriver driver) {
        super(driver);
    }
	
	// Definir los localizadores de los elementos que se ocuparan
    By LabelBusqueda = By.xpath("//*[@class='nav-search-input']");
    By BtnBusqueda = By.xpath("//button[@type='submit']");
    By ProductoDescripcion = By.xpath("//img[@src='https://http2.mlstatic.com/D_NQ_NP_974046-MLA43400897853_092020-V.webp']");
    By BtnAgregarCarrito = By.xpath("//*[@formaction='/p/MLM1433940964/add-to-cart']");
    By ConfirmarCuenta = By.xpath("//*[@class='center-card__title']");
    //Click a los diferentes filtros disponibles de productos
    By BtnMarca = By.xpath("//*[@src='https://http2.mlstatic.com/D_NQ_NP_652172-MLA54969797601_042023-A.webp']");
    By BtnRangoPrecio = By.xpath("//*[@aria-label='$800 a $1,000']");
    By ResultadosCroquetas = By.xpath("//*[@class='ui-search-breadcrumb__title shops-custom-primary-font']");
    By BtnFiltroRelevantes = By.xpath("//button[@class='andes-dropdown__trigger']");
    
    //Acciones a realizar dentro de la pagina
    public void BusquedaProducto() throws InterruptedException {
		Thread.sleep(2000);
		click(LabelBusqueda);
		type("Croquetas", LabelBusqueda);
		Thread.sleep(2000);
		click(BtnBusqueda);
	}
    
    public void AgregarProducto() throws InterruptedException{
    	Thread.sleep(2000);
    	click(ProductoDescripcion);
    	
    }
    
    public void AgregarCarrito() throws InterruptedException{
    	Thread.sleep(2000);
    	click(BtnAgregarCarrito);
    }
    
    public String MensajeConfirmarCuenta(){
    	isDisplayed(ConfirmarCuenta);
		String result = getText(ConfirmarCuenta);
		return result;
    }
    
    public void BusquedaMarca() throws InterruptedException{
    	Thread.sleep(2000);
    	click(BtnMarca);
    }
    
    public void BusquedaRangoPrecio() throws InterruptedException{
    	Thread.sleep(2000);
    	click(BtnRangoPrecio);
    }
    
    public String MensajeConfirmarResultados(){
    	isDisplayed(ResultadosCroquetas);
		String result = getText(ResultadosCroquetas);
		return result;
    }
    
    public void filtroRelevantes() {
		click(BtnFiltroRelevantes);
	}
}
