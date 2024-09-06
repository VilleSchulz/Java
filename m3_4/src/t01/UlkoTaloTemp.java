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
        String[] columns = new String[0];
        int counter = 0;
        double averageTemp = 0;
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
                            if (columns[0].startsWith(DAY)) {
                                if (columns[i].startsWith(DAY) || columnNames[i].startsWith(LOCATION)) {
                                    System.out.print(columnNames[i] + " " + columns[i]+ " ");
                                    if (i==1){
                                        // Replace comma with dot before parsing
                                        String tempString = columns[i].replace(",", ".");
                                        averageTemp += Double.parseDouble(tempString);
                                        counter ++;
                                        System.out.println();
                                    }
                                }
                            } else {
                                break;
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
            System.out.printf("Average temp of %s is : %.2f",LOCATION,averageTemp/(double)counter);
        }

    }
}

