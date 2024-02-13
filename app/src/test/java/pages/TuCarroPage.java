package pages;

public class TuCarroPage extends BasePage{

    // Locators
    private String dropDownMake = "(//ul[@id=':r3:-menu-list'])[1]";
    private String buttonDropDownMake = "(//*[name()='svg'][@aria-hidden='true'])[4]";
    private String closeWindowEmerge = "//*[@id=\":r2:\"]";

    public TuCarroPage() {
        // Constructor
        super(driver);
    }

    public void navitageToTuCarro() {
        // Metodo para navegar en la página tu TuCarro
        navigateTo("https://www.tucarro.com.co/");
    }

    public void closeWindowEmerge() {
        // Metodo para cerrar la ventana emergente
        clickElement(closeWindowEmerge);
    }

    public void clickMakeDropDown() {
        // Metodo para hacer click en el dropdown de marcas
        clickElement(buttonDropDownMake);
    }

    public int makeDrownSize(){
        // Metodo para obtener la cantidad de marcas disponibles
       return dropDownSize(dropDownMake);
    }
}