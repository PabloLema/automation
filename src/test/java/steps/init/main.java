package steps.init;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pom.test.Sir;

import java.io.IOException;

public class main {

    private final Sir sir = new Sir();

    @Given("Abrimos Chrome")
    public void openBrowser() {
        sir.openBrowser();
    }

    @And("Ingresamos el usuario y contraseña")
    public void login() throws IOException {
        sir.login();
    }

    @And("Seleccionamos el MÓDULO DE RIESGO DE MERCADO Y LIQUIDEZ")
    public void rMercadoLiquidez() {
        sir.rMercadoLiquidez();
    }

    @And("Entramos a monitor de liquidez")
    public void monitorLiquidez() {
        sir.monitorLiquidez();
    }
}
