package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Seleciona la universidad choucair")
            .located(By.id("universidad"));
    public static final Target INPUT_COURSE = Target.the("Buscar el curso")
            .located(By.id ("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da clic para buscar el curso")
            .located(By.xpath("//BUTTON[@class='btn btn-secondary'][text()='Ir']"));
    public static final Target SELECT_COURSE = Target.the("Da clic para buscar el curso")
            .located(By.xpath("//*[@role=\'main\']/div/div[4]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\'page-header\']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}
