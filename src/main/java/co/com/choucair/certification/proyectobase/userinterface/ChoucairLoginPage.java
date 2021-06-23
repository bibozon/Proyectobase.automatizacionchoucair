package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;




public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("PulsaElBotonParaIngresar")
            .located(By.xpath("//*[@id=\'nav-menu\']/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("IngresaTuUsuario")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("IngresaTuContraseña*")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("presionaParaAcceder")
            .located(By.xpath("//BUTTON[@type='submit']"));
}
