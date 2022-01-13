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
}
