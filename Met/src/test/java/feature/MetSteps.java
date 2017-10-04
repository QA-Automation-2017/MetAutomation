package feature;

import com.xumak.qaqc.Automation;
import com.xumak.qaqc.exception.CustomException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import feature.util.BasePath;
import feature.util.Const;
import feature.util.Generics;
import feature.util.URLs;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class MetSteps {
    
    private static final Logger LOG = Logger.getLogger(MetSteps.class.getName());

    public static Automation QA;

    static {
        try {
            QA = new Automation();
        } catch (CustomException ex) {
            LOG.warning(ex.getMessage());
        }
    }

    private static String url;
    private static String basePath;
    private static String originValue;
    
    
    //<editor-fold defaultstate="collapsed" desc="Hooks Constructors">
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Hooks">
    @Before(order = 90000, timeout = 0L, value = "@openPage")
    public void openPage() throws Exception {
        QA.openSite(url);
    }

    @Before(order = 90000, timeout = 0L, value = "@refresh")
    public void refreshPage() throws Exception {
        QA.refresh();
    }

    @Before(order = 90000, timeout = 0L, value = "@login")
    public void loginPage() throws Exception {
        
    }
    //</editor-fold>
}
