import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListYearlyData {
    private final int FIRST_YEAR_DATA = 2020; 
    private final int LAST_YEAR_DATA_EXCLUSIVE = 2024;
    private YearlyDataSet[] multipleYears;
    //TODO: make sure file exists
    private int yearlyIndex; 

    public ListYearlyData() {
        this.multipleYears = new YearlyDataSet[LAST_YEAR_DATA_EXCLUSIVE-FIRST_YEAR_DATA +1];
        this.yearlyIndex = 0; 
        processYears(); 
    }

    private void processYears() {
        for(int currYear = FIRST_YEAR_DATA; currYear < LAST_YEAR_DATA_EXCLUSIVE; currYear ++) {
            ArrayList<String> file = readFile("temperature-data-"+ currYear+ ".txt");
            YearlyDataSet yds = new YearlyDataSet(currYear);
            yds.processYearData(file);
            multipleYears[yearlyIndex] = yds;
            yearlyIndex ++;  
        }
    }

    private ArrayList<String> readFile(String fileName) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while(line != null) {
                lines.add(line);
                line = br.readLine();
            }

            br.close();
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return lines;
    }

    public String toString() {
        String result = "";
        for(YearlyDataSet year: multipleYears) {
            result += year.toString() + "\n";
        }
        return result;
    }


}