package pom.pages.rmercado;

import org.openqa.selenium.By;

public class MonitorLiquidez {
    private final By btnIngreso = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-hm/div[2]/div/div/div[1]/div/button");
    private final By divFechas = By.xpath("//*[@id=\"mat-input-0\"]");

    // AGREGAR OBSERVACION
    private final By btnAddObservation = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div[1]/button");
    private final By mtDialog = By.xpath("//*[@id=\"mat-dialog-0\"]");

    private final By btnDlgFechaInicio = By.xpath("//*[@id=\"mat-dialog-0\"]/app-observation-modal/div/form/button[1]");
    private final By obsYear = By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[2]/div[1]");
    private final By obsMonth = By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]");
    private final By obsDate = By.xpath("//*[@id=\"mat-datepicker-2\"]/div/mat-month-view/table/tbody/tr[1]/td[2]/div[1]");

    private final By btnDlgFechaFin = By.xpath("//*[@id=\"mat-dialog-0\"]/app-observation-modal/div/form/button[2]");
    private final By obsYearF = By.xpath("//*[@id=\"mat-datepicker-3\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[2]/div[1]");
    private final By obsMonthF = By.xpath("//*[@id=\"mat-datepicker-3\"]/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]");
    private final By obsDateF = By.xpath("//*[@id=\"mat-datepicker-3\"]/div/mat-month-view/table/tbody/tr[5]/td[6]/div[1]");

    private final By obsInput = By.xpath("//*[@id=\"mat-input-8\"]");

    // CALENDARIO FECHA INICIO
    private final By btnOpenCalendar = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-home/div[2]/div[2]/button[1]");
    private final By calendarioFechaInicio = By.xpath("//*[@id=\"mat-datepicker-0\"]");
    private final By calendarioYearFechaInicio = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[1]/div[1]");
    private final By calendarioMonthFechaInicio = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]");
    private final By calendarioDayFechaInicio = By.xpath("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[2]/td[2]/div[1]");

    // CALENDARIO FECHA FIN
    private final By btnOpenCalendarFechaFin = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-home/div[2]/div[2]/button[2]");
    private final By calendarioFechaFin = By.xpath("//*[@id=\"mat-datepicker-1\"]");
    private final By calendarioYearFechaFin = By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div[1]");
    private final By calendarioMonthFechaFin = By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-year-view/table/tbody/tr[2]/td[1]/div[1]");
    private final By calendarioDayFechaFin = By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[3]/td[4]/div[1]");

    // BOTON CONSULTAR
    private final By btnConsultar = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-home/div[2]/div[2]/button[3]");

    // DIV FECHAS DESPUÉS DE LA CONSULTA
    private final By divFechasAfter = By.xpath("//*[@id=\"mat-input-4\"]");

    // DESCARGAR GRAFICAS
    public By btnCG = By.id("tm1");
    public By btnMG = By.id("tm2");
    public By btnAG = By.id("tm3");

    // SELECCIONAR LA PESTAÑA DATOS HISTORICOS
    private final By historicDataTab = By.xpath("//*[@id=\"mat-tab-label-0-1\"]/div");

    // DESCARGAR DATOS HISTORICOS
    public By btnCD = By.id("tm4");
    public By btnMD = By.id("tm5");
    public By btnAD = By.id("tm6");

    // BOTON REGRESAR
    public By btnBackToMenu = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-home/div[1]/div/button");

    // SWEET ALERT BUTTONS
    public By swalAcceptButton = By.xpath("//*[@id=\"mat-dialog-0\"]/app-observation-modal/div/form/div/button[2]");
    public By successDialog = By.xpath("/html/body/div[3]/div");
    public By acceptSuccesDialog = By.xpath("/html/body/div[3]/div/div[3]/button[2]");

    /**
     *
     * GETTERS
     */
    public By getBtnIngreso() { return this.btnIngreso; }
    public By getDivFechas() { return this.divFechas; }

    // CALENDARIO FECHA INICIO
    public By getBtnOpenCalendar() { return this.btnOpenCalendar; }
    public By getCalendarioFechaInicio() { return this.calendarioFechaInicio; }
    public By getCalendarioYearFechaInicio() { return this.calendarioYearFechaInicio; }
    public By getCalendarioMonthFechaInicio() { return this.calendarioMonthFechaInicio; }
    public By getCalendarioDayFechaInicio() { return this.calendarioDayFechaInicio; }

    // CALENDARIO FECHA FIN
    public By getBtnOpenCalendarFechaFin() { return this.btnOpenCalendarFechaFin; }
    public By getCalendarioFechaFin() { return this.calendarioFechaFin; }
    public By getCalendarioYearFechaFin() { return this.calendarioYearFechaFin; }
    public By getCalendarioMonthFechaFin() { return this.calendarioMonthFechaFin; }
    public By getCalendarioDayFechaFin() { return this.calendarioDayFechaFin; }

    // BOTON CONSULTAR
    public By getBtnConsultar() { return this.btnConsultar; }

    // DIV FECHAS DESPUÉS DE LA CONSULTA
    public By getDivFechasAfter() { return this.divFechasAfter; }

    // DESCARGAR GRAFICAS
    public By getBtnCG() { return this.btnCG; }
    public By getBtnMG() { return this.btnMG; }
    public By getBtnAG() { return this.btnAG; }

    // SELECCIONAR PESTAÑA DATOS HISTORICOS
    public By getHistoricData() { return this.historicDataTab; }

    // DESCARGAR DATOS HISTORICOS
    public By getBtnCD() { return this.btnCD; }
    public By getBtnMD() { return this.btnMD; }
    public By getBtnAD() { return this.btnAD; }

    // REGRESAR AL MENU PRINCIPAL
    public By getBtnBackToMenu() { return this.btnBackToMenu; }

    // AGREGAR OBSERVACION
    public By getBtnAddObservation() { return this.btnAddObservation; }
    public By getMtDialog() { return this.mtDialog; }

    public By getBtnDlgFechaInicio() { return  this.btnDlgFechaInicio; }
    public By getObsYear() { return this.obsYear; }
    public By getObsMonth() { return this.obsMonth; }
    public By getObsDate() { return this.obsDate; }

    public By getBtnDlgFechaFin() { return  this.btnDlgFechaFin; }
    public By getObsYearF() { return this.obsYearF; }
    public By getObsMonthF() { return this.obsMonthF; }
    public By getObsDateF() { return this.obsDateF; }

    public By getObsInput() { return this.obsInput; }

    // SWEET ALERT BUTTONS
    public By getSwalAcceptButton() { return this.swalAcceptButton; }
    public By getSuccessDialog() { return this.successDialog; }
    public By getAcceptSuccesDialog() { return this.acceptSuccesDialog; }
}
