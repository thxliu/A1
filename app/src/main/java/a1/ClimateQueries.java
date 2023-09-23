package a1;

import java.io.*;
import java.util.Scanner;

public class ClimateQueries {
  /**
   * Reads the file and places the data in the appropriate array
   * @param args
   */
  public static void main(String[] args) {
    String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
    Scanner file = null;
      
    // String[] day = new String[226];
    // float[] dailyTemp = new float[226]; 
    // float[] janTemp = new float[31];
    // float[] julyTemp = new float[31];

    try {
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }
    while (file.hasNextLine()) {
      String line = file.nextLine();
      String[] fields = line.split("\\s+");
      String date = fields[1];
     //
      float temperature = Float.valueOf(fields[8]);
      System.out.println("On " + date + " the temperature was " + temperature + " degrees Celsius.");
    }
    file.close();
    // System.out.println(day);
  }
  
}
