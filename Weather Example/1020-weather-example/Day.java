public class Day {
    private static int HI_INDEX = 0;
    private static int LO_INDEX = 1;
    private static int NUM_RECORDS_PER_DAY = 2;
    private double[] tempData;

    public Day(double hi, double lo) {
        this.tempData = new double[NUM_RECORDS_PER_DAY];
        this.tempData[HI_INDEX] = hi;
        this.tempData[LO_INDEX] = lo;
    }

    public String toString() {
        return "Hi: " + this.tempData[HI_INDEX] + " & Lo: " + this.tempData[LO_INDEX];
    }
}
