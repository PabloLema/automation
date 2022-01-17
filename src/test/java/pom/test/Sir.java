package pom.test;

import org.openqa.selenium.support.ui.*;
import pom.StartPages;

import java.io.IOException;

public class Sir extends StartPages {

    WebDriverWait webDriverWait = new WebDriverWait(driver, 100);

    public void openBrowser() {
        driver.get(url);
    }

    public void login() throws IOException {
        driver.findElement(login.getTxtUser()).sendKeys(user);
        driver.findElement(login.getTxtPassword()).sendKeys(password);
        driver.findElement(login.getBtnNext()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(login.getBtnPopUp()));
        driver.findElement(login.getBtnPopUp()).click();
    }

    public void rMercadoLiquidez() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(home.getRMercadoLiquidez()));
        driver.findElement(home.getRMercadoLiquidez()).click();
    }

    public void monitorLiquidez() {
        driver.findElement(monitorLiquidez.getBtnIngreso()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getDivFechas()));
    }

    public void addObservation() {
        driver.findElement(monitorLiquidez.getBtnAddObservation()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getMtDialog()));

        driver.findElement(monitorLiquidez.getBtnDlgFechaInicio()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getObsYear()));
        driver.findElement(monitorLiquidez.getObsYear()).click();
        driver.findElement(monitorLiquidez.getObsMonth()).click();
        driver.findElement(monitorLiquidez.getObsDate()).click();

        driver.findElement(monitorLiquidez.getBtnDlgFechaFin()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getObsYearF()));
        driver.findElement(monitorLiquidez.getObsYearF()).click();
        driver.findElement(monitorLiquidez.getObsMonthF()).click();
        driver.findElement(monitorLiquidez.getObsDateF()).click();

        driver.findElement(monitorLiquidez.getObsInput()).sendKeys(observation);
        driver.findElement(monitorLiquidez.getSwalAcceptButton()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getSuccessDialog()));
        driver.findElement(monitorLiquidez.getAcceptSuccesDialog()).click();
    }

    public void consultRangeDate() {
        // SELECCIONAR FECHA INICIO
        driver.findElement(monitorLiquidez.getBtnOpenCalendar()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getCalendarioFechaInicio()));
        driver.findElement(monitorLiquidez.getCalendarioYearFechaInicio()).click();
        driver.findElement(monitorLiquidez.getCalendarioMonthFechaInicio()).click();
        driver.findElement(monitorLiquidez.getCalendarioDayFechaInicio()).click();

        // SELECCIONAR FECHA FIN
        driver.findElement(monitorLiquidez.getBtnOpenCalendarFechaFin()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getCalendarioFechaFin()));
        driver.findElement(monitorLiquidez.getCalendarioYearFechaFin()).click();
        driver.findElement(monitorLiquidez.getCalendarioMonthFechaFin()).click();
        driver.findElement(monitorLiquidez.getCalendarioDayFechaFin()).click();

        // CONSULTAR
        driver.findElement(monitorLiquidez.getBtnConsultar()).click();

        // VERIFICAR QUE TERMINÓ LA CONSULTA
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getDivFechasAfter()));
    }

    public void downloadGraphs() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(monitorLiquidez.getBtnCG()).click();
        Thread.sleep(500);
        driver.findElement(monitorLiquidez.getBtnMG()).click();
        Thread.sleep(500);
        driver.findElement(monitorLiquidez.getBtnAG()).click();
    }

    public void historicDataTab() {
        driver.findElement(monitorLiquidez.getHistoricData()).click();
    }

    public void downloadData() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(monitorLiquidez.getBtnCD()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getBtnCD()));
        driver.findElement(monitorLiquidez.getBtnMD()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getBtnMD()));
        driver.findElement(monitorLiquidez.getBtnAD()).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(monitorLiquidez.getBtnAD()));
    }

    public void backToMenu() {
        driver.findElement(monitorLiquidez.getBtnBackToMenu()).click();
    }
}
