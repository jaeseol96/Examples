import java.util.ArrayList;

public class YearlyDataSet {
    private static final String[] MONTH_NAMES = {"January", "February",  "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] DAYS_IN_MONTH = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    private Month[] months;
    private int year; 

    public YearlyDataSet(int year) {
        this.year = year; 
        this.months = new Month[12];
        for (int i = 0; i < months.length; i ++) {
            // watch for leap year when i == 1
            this.months[i] = new Month(MONTH_NAMES[i], DAYS_IN_MONTH[i]); 
        }
    }
    
    public void processYearData(ArrayList<String> dataset) {
        // for every record in dataset
        for (String data: dataset) {
            String tokens[] = data.split("\\s+"); //MM/DD HI LO
            if (tokens.length == 3) {
                double hi = Double.parseDouble(tokens[1]);
                double lo = Double.parseDouble(tokens[2]);
                String[] dateTokens = tokens[0].split("/");
                int monthIndex = Integer.parseInt(dateTokens[0]) -1; //month comes in mapped to human data, need to map to array index
                int dateIndex = Integer.parseInt(dateTokens[1]) - 1; //same with date
                this.months[monthIndex].setDayData(dateIndex, hi, lo);

            } else {
                System.out.println("That line of data is invalid!");
            }
            
        }
    }

    public String toString() {
        String result = year + " Data Set:\n" ;
        for (int i = 0; i < months.length;i ++) {
            result += months[i].toString();
        }
        return result;
    }
    
}