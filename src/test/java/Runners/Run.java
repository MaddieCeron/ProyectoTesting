package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/chromedriver/AgregarCarrito_Test.feature", 
        		"src/test/resources/chromedriver/EnvioGratis_Test.feature", 
        		"src/test/resources/chromedriver/FiltroProducto_Test.feature",
        		"src/test/resources/chromedriver/FiltroRelevantes_Test.feature",
        		"src/test/resources/chromedriver/Liquidacion_Test.feature",
        		"src/test/resources/chromedriver/MetodosPago_Test.feature",
        		"src/test/resources/chromedriver/MercadoPago_Test.feature",
        		"src/test/resources/chromedriver/Ofertas_Test.feature",
        		"src/test/resources/chromedriver/OportunidadesLaborales_Test.feature",
        		"src/test/resources/chromedriver/Postulacion_Test.feature"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"} // Opciones de reportes, puedes ajustar según tus necesidades
)
	
	//primero extendemos la clase
	public class Run extends AbstractTestNGCucumberTests {
}
