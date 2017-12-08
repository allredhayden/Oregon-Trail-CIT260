package byui.cit260.oregontrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Months implements Serializable
{
    private String currentMonth;
    
    // Create list of months.
    private List<String> months = new ArrayList<>();
    {
        months.add("1. March");
        months.add("2. April");
        months.add("3. May");
        months.add("4. June");
        months.add("5. July");
        months.add("6. August");
        months.add("7. September");
        months.add("8. October");
        months.add("9. November");
        months.add("10. December");
        months.add("11. January");
        months.add("12. February");
    }
    
    public String getCurrentMonth()
    {
        return currentMonth;
    }
    public void setCurrentMonth(String currentMonth)
    {
        this.currentMonth = currentMonth;
    }
    
    public List<String> getMonths()
    {
        return months;
    }
    
    
}
