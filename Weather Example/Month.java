public class Month {
    private static int MAX_MONTH_DAYS = 31;
    private String monthName;
    private Day[] days;
    private int actualNumDaysInMonth;

    public Month(String monthName, int actualNumDaysInMonth) {
        this.monthName = monthName;
        this.days = new Day[MAX_MONTH_DAYS];
        this.actualNumDaysInMonth = actualNumDaysInMonth;
        for(int i = 0; i < days.length; i ++) {
            days[i] = new Day(0, 0); 
        }        
    }

    public void setDayData(int dateIndex, double hi, double lo) {
        if (dateIndex < actualNumDaysInMonth) { //valid index
            this.days[dateIndex] = new Day(hi, lo);
        } else {
            System.out.println("Not a valid date");
        }
    }

    public String toString() {
        String result = monthName + "\n";
        for (int i = 0; i < actualNumDaysInMonth; i ++) {
            result += "\tDay " + (i+1) + "\t" + days[i].toString() + "\t";
            if(i%3 == 0) {
                result += "\n";
            }
        }
        return result + "\n";
    }
}
