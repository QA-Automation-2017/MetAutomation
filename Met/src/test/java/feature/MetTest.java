package feature;

import com.xumak.qaqc.exception.CustomException;
import cucumber.api.junit.Cucumber;
import feature.util.Generics;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MetTest {
    
    @BeforeClass
    public static void up() throws CustomException {
        Generics.start();
    }

    @AfterClass
    public static void teardown() {
        MetSteps.QA.closeAll();
    }
    
}
