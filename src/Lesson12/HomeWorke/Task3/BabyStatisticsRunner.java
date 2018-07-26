package Lesson12.HomeWorke.Task3;

public class BabyStatisticsRunner {
    public static void main(String[] args) {
        String inFile = "./src/Lesson11/HomeWorke/Task3/births";
        String outFile = "./src/Lesson11/HomeWorke/Task3/births_by_years";

        new BabyStatistics(inFile, outFile).birthsByYears();
    }
}
