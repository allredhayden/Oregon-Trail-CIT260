package byui.cit260.oregontrail.view;

import java.io.PrintWriter;

import byui.cit260.oregontrail.model.OregonTrail;

public class ErrorView {
    private static final PrintWriter errorFile = OregonTrail.getOutFile();
    private static final PrintWriter logFile = OregonTrail.getLogFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                "--------------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-------------------------------------------------------");
        // log error
        logFile.println(className + " - " + errorMessage);
    }
}
