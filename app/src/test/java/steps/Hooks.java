package steps;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import pages.BasePage;

public class Hooks extends BasePage{

    public Hooks(){
        super(driver);
    }

        @After
        public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.log("Escenario fallido, referencia al screenshot");
            try {
                final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (Exception e) {
                scenario.log("Error al tomar screenshot: " + e.getMessage());
             }   
        }   
}
    
}
