package steps;

import io.cucumber.java.en.*;
import pages.TuCarroPage;
import org.junit.Assert;

public class TuCarroStep {
    
    TuCarroPage tuCarro = new TuCarroPage();

    @Given("^navego en la pagina principal de TuCarro$")
    public void navigateToTuCarro(){
        tuCarro.navitageToTuCarro();
    }

    @When("^cierro la ventana emergente$")
    public void closeWindowEmerge(){
        tuCarro.closeWindowEmerge();
    }

    @Then("^verifico la cantidad de marcas disponibles es (\\d+)$")
    public void returnAmountOfMakes(int makeamount){
        tuCarro.clickMakeDropDown();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int expectedAmount = makeamount;
        int actualAmount = tuCarro.makeDrownSize();
        System.out.println("Cantidad de marcas disponibles: " + actualAmount);
        Assert.assertEquals(expectedAmount, actualAmount);
    }
    

}
