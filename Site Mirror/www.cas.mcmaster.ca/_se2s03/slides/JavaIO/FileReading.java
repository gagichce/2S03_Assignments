/*
 * Reading from files!
 */

import java.io.BufferedReader; // THIS IS IMPORTANT
import java.io.FileReader; // THIS IS IMPORTANT AS WELL
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReading {
  public static void main (String[] args) throws IOException, FileNotFoundException{
    String[] fnames; String fname; String line;
    FileReader txtFileReader;
    BufferedReader txtReader;

    if (args.length != 0) {
      fnames = args;
    } else {
      fnames = new String[1];
      fnames[0] = "test.txt";
    }

    for (int i = 0; i < fnames.length; i++) {
      fname = fnames[i];

      // We just encountered a NEW PRINT FUNCTION. Stolen from C/C++
      // Allows us to use FORMAT STRINGS
      System.out.printf("We are now reading from file number: %d, Name: %s%n", i+1, fname);

      // We're then gonna set up our FileReader to read from this our first file
      txtFileReader = new FileReader(fname);

      // We then set up our BufferedReader to read the text of the file we just set
      txtReader = new BufferedReader(txtFileReader);

      // Let's print all the lines inside the file
      // Let's get a line
      line = txtReader.readLine();

      while (line != null) {
        System.out.println(line);

        // Get the next line
        line = txtReader.readLine();
      }
    }
  }
}