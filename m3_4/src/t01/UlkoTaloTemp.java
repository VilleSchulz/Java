//Task 1: Read a CSV file from the network location
//
//There is a network file (https://users.metropolia.fi/~jarkkov/temploki.csv) where we have periodical temperature
// measurements at 10 minutes interval. Create an application which reads the file, reads the 'UlkoTalo' column, and
// calculates the average temperature for the 1st day of January 2023.

package t01;

import java.io.*;

public class UlkoTaloTemp {
    private final static String FILENAME = "temploki.csv";
    private final static String DAY = "01.01.2023";
    private final static String LOCATION = "UlkoTalo";

    public static void main(String[] args) {
        FileReader file;
        BufferedReader bufferedstream = null;
        String line;
        String[] columnNames = new String[0];
        String[] columns;
        int counter = 0;
        double tempSum = 0;
        boolean header = true;
        try {
            file = new FileReader(FILENAME);
            bufferedstream = new BufferedReader(file);

            do {
                line = bufferedstream.readLine();
                if (line != null) {
                    if (header) {

                        columnNames = line.split(";");
                        header = false;
                    } else {
                        columns = line.split(";");
                        for (int i = 0; i < 2; i++) {
                            if (columns[0].startsWith(DAY)) {// if the day is right, start checking if location is right
                                System.out.print(columnNames[i] + " " + columns[i] + " ");
                                if (columnNames[i].startsWith(LOCATION)) { //if in temp column->
                                    String tempString = columns[i].replace(",", ".");// Replace comma with dot before parsing
                                    tempSum += Double.parseDouble(tempString);//add parsed double (1.1 instead of 1,1) to temps
                                    counter++;//counter for temps
                                    System.out.println();//line change
                                }
                            } else {
                                break;//this prevents from handling irrelevant days
                            }


                        }


                    }

                }
            }
            while (line != null);
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            try {
                if (bufferedstream != null) {
                    bufferedstream.close();

                }

            } catch (Exception e) {
                System.out.println("Error closing the file" + FILENAME);
            }
            System.out.printf("Average temp of %s is : %.2f", LOCATION, tempSum / (double) counter);// prints average temp
        }

    }
}

