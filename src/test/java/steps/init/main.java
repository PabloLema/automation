package steps.init;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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

    @And("Agregamos una odservacion")
    public void addObservation() {
        sir.addObservation();
    }

    @Then("Hacemos una consulta en el rango de fechas 1 de enero del 2019 hasta 12 de enero del 2022")
    public void consultDateRange() {
        sir.consultRangeDate();
    }

    @And("Descargamos las graficas")
    public void downloadGraphs() throws InterruptedException {
        sir.downloadGraphs();
    }

    @Then("Seleccionamos la pestaña DATOS HISTORICOS")
    public void selectDataTab() {
        sir.historicDataTab();
    }

    @And("Descargamos los datos historicos")
    public void downloadData() throws InterruptedException {
        sir.downloadData();
    }

    @Then("Regresamos al menu principal")
    public void backMenu() {
        sir.backToMenu();
    }
}
