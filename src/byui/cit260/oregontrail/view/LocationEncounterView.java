package byui.cit260.oregontrail.view;

public class LocationEncounterView extends View {
    
    // private static String city = getCity();
    private static String city = "Kearney";
   
    // private static String state = getState();
    private static String state = "Nebraska";
    
    // private static String weather = getWeather();
    private static String weather = "cool";
    
    // private static String health = getHealth();
    private static String health = "good";
    
    // private static String pace = getPace();
    private static String pace = "steady";
    
    // private static String date = getDate();
    private static String currentDate = "April 7, 1848";
            
    public LocationEncounterView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|     Welcome to " + city + ", " + state + "     |"
              + "\n      " + currentDate
              + "\n-----------------------------------------"
              + "\n Weather: " + weather
              + "\n Health: " + health
              + "\n Pace: " + pace
              + "\n"
              + "\nC - Continue on trail"
              + "\nS - Check supplies"            
              + "\nM - Look at map"
              + "\nP - Change pace"
              + "\nR - Stop to rest"
              + "\nT - Attempt to trade"
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        super.display();
    }
    
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "C":
            continueOnTrail();
            break;
        case "S":
            checkSupplies();
            break;
        case "M":
            lookAtMap();
            break;
        case "P":
            changePace();
            break;
        case "R":
            stopToRest();
            break;
        case "T":
            attemptToTrade();
            break;
        case "Z":
            new MainMenuView();
        default:
            ErrorView.display(this.getClass().getName(), "\nInvalid selection. Please try again.");
        }
        return false;
    }
    
    protected void continueOnTrail() {
        this.console.println("continueOnTrail successfully called.");
    }
    protected void checkSupplies() {
        this.console.println("checkSupplies successfully called.");
    }
    protected void lookAtMap() {
        this.console.println("lookAtMap successfully called.");
    }
    protected void changePace() {
        this.console.println("changePace successfully called.");
    }
    protected void stopToRest() {
        this.console.println("stopToRest successfully called.");
    }
    protected void attemptToTrade() {
        this.console.println("attemptToTrade successfully called.");
    }
}
