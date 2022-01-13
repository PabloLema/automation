package pom.pages.login;

import org.openqa.selenium.By;

public class Login {
    private final By txtUser = By.xpath("//*[@id=\"inputUser\"]");
    private final By txtPassword = By.xpath("//*[@id=\"inputPassword\"]");
    private final By btnNext = By.xpath("//*[@id=\"btnNext\"]");
    private final By btnPopUp = By.xpath("/html/body/div/div/div[3]/button[2]");

    public By getTxtUser() { return this.txtUser; }
    public By getTxtPassword() { return this.txtPassword; }
    public By getBtnNext() { return btnNext; }
    public By getBtnPopUp() { return btnPopUp; }
}
