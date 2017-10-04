package feature.util;

import com.xumak.qaqc.Automation;
import com.xumak.qaqc.exception.CustomException;
import feature.MetSteps;

public class Generics {
    
    private static final Automation QA = MetSteps.QA;


    public static void start() throws CustomException {
        if (QA.initProcess()) {
            //TODO
        }
    }

    public void login() throws CustomException {
           //TODO
    }
    
}
