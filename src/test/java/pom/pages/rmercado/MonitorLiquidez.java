package pom.pages.rmercado;

import org.openqa.selenium.By;

public class MonitorLiquidez {
    private final By btnIngreso = By.xpath("/html/body/app-root/app-riesgo-mercado-liquidez/div/app-hm/div[2]/div/div/div[1]/div/button");
    private final By divFechas = By.xpath("//*[@id=\"mat-input-0\"]");

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

    // GETTERS
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
}
