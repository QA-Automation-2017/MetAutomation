package feature;

import feature.util.Generics;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetSteps extends Generics {

    private static final Logger LOG = LoggerFactory.getLogger(MetSteps.class);

    private static String url;
    private static String basePath;
    private static String originValue;

 
    //<editor-fold defaultstate="collapsed" desc="Hooks Constructors">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Hooks">
    @Before(order = 90000, timeout = 0L, value = "@openPage")
    public void openPage() throws Exception {

    }

    @Before(order = 90000, timeout = 0L, value = "@refresh")
    public void refreshPage() throws Exception {

    }

    @Before(order = 90000, timeout = 0L, value = "@login")
    public void loginPage() throws Exception {

    }
    //</editor-fold>

}
