import java.util.ArrayList;

public class YearlyDataSet {
    private static final String[] MONTH_NAMES = {"January", "February", 
                                                "March", "April", 
                                                "May", "June", 
                                                "July", "August", 
                                                "September", "October", 
                                                "November", "December" };
    private static final int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final int LEAP_YEAR_FEB_DAYS = 29;
    private Month[] months;
    private int year;

    public YearlyDataSet(int year) {
        this.year = year;
        this.months = new Month[12];
        for(int i = 0; i < months.length; i++) {
            int numDays = DAYS_IN_MONTH[i];
            if(i == 1 && year % 4 == 0) { // if it's february and it's a leap year
                numDays = LEAP_YEAR_FEB_DAYS;
            }
            this.months[i] = new Month(MONTH_NAMES[i], numDays);
        }
    }

    public void processYearData(ArrayList<String> dataset) {
        // for every record in the dataset
        for(String data : dataset) {
            // break up the line MM/DD HI LOW
            String[] tokens = data.split("\\s+"); // {MM/DD, HI, LO}
            if(tokens.length == 3) {
                double hi = Double.parseDouble(tokens[1]); // HI
                double lo = Double.parseDouble(tokens[2]); // LO
                String[] dateTokens = tokens[0].split("/"); // MM/DD up into {MM, DD}
                int monthIndex = Integer.parseInt(dateTokens[0]) - 1; // month comes in mapped to actual human data, we need to map it to array indies
                int dateIndex = Integer.parseInt(dateTokens[1]) - 1; // date same as month
                
                this.months[monthIndex].setDayData(dateIndex, hi, lo);
            } else {
                System.out.println("That line of data is invalid, I am skipping it!");
            }
        }
    }


    public String toString() {
        String result = year + " Data Set:\n";
        for(int i = 0; i < months.length; i++) {
            result +=  months[i].toString();
        }
        return result;
    }
}
