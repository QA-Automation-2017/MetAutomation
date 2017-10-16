package feature;


import cucumber.api.junit.Cucumber;
import feature.util.Generics;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MetTest {
    
    @BeforeClass
    public static void up(){
        Generics.start();
    }

    @AfterClass
    public static void teardown() {
        Generics.down();
    }
    
}
