package pom.pages.rmercado;

import org.openqa.selenium.By;

public class Home {
    private final By btnRMercadoLiquidez = By.xpath("/html/body/app-root/app-main/div[2]/div[1]/div[2]/div/button");

    public By getRMercadoLiquidez() { return this.btnRMercadoLiquidez; }
}
