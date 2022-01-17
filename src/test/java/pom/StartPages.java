package pom;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import pom.pages.login.Login;
import pom.pages.rmercado.Home;
import pom.pages.rmercado.MonitorLiquidez;
import steps.hook.Hook;
import utils.Utils;

public class StartPages {
    protected WebDriver driver = Hook.getDriver();
    protected Utils utils = new Utils();

    // Pages
    protected Login login = new Login();
    protected Home home = new Home();
    protected MonitorLiquidez monitorLiquidez = new MonitorLiquidez();

    // Variables de la hoja de excel
    protected String url = utils.getUrl();
    protected String user = utils.getUser();
    protected String password = utils.getPassword();
    protected String observation = utils.getObservationContent();
}
