import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {
  public static void main (String[] args) throws IOException {
    // Let's get some stuff from the keyboard
    Scanner reader = new Scanner(System.in);

    // Choose a file name
    String fname = "written.txt";

    // Initialize our FileWriter
    FileWriter fileWriter = new FileWriter(fname);

    //Initialize our PrintWriter
    PrintWriter printWriter = new PrintWriter(fileWriter);

    // So let's get someone's name and favorite food.
    System.out.println("Please enter your name:");
    String name = reader.nextLine();
    System.out.println("Please enter your favourite food:");
    String food = reader.nextLine();

    String stringToPrint = name + "'s favourite food is " + food;

    System.out.printf("\"%s\" printed to file \"%s\".\n", stringToPrint, fname);

    // Write to our file
    printWriter.println(stringToPrint);


    // REMEMBER TO CLOSE THE SCANNER AND THE PRINTWRITER!
    // IF YOU DONT IT WON'T SAVE THE FILE
    reader.close();
    printWriter.close();
  }
}