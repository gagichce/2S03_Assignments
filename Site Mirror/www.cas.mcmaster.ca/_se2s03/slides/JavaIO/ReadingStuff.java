/*
 * Reading stuff using Reader
 */

import java.util.Scanner;

public class ReadingStuff {
  public static void main(String[] args){
    if (args != null) {
      String[] fnames = args;
    }

    int num; double bigNum; String word; String sentence;

    // Reader reader = new Reader();

    Scanner reader = new Scanner(System.in);

    // Prints with a new line character (carriage return) at the end
    System.out.println("Hello, and welcome to the reader class.");

    // Does not print with a new line character
    System.out.print("We are going to print this line, and the next on the SAME LINE");
    System.out.print("The previous line and this one are right next to each other");
    System.out.print("But why is that?");

    // These 2 do the same thing! That is, give us a new line
    System.out.print("\n");
    System.out.println();

    // Let's read an integer!
    // System.out.println("Please enter an integer, say 5, 6 or 2147483647");
    // num = reader.readInt();

    // // Let's read a double! This time the entered value will be right beside the statement
    // // THIS WILL FAIL!!!!!!!!!!!!!!! CHECK READER TO SEE WHY
    // System.out.print("Please enter a double, this can be an integer as well: ");
    // bigNum = reader.readDouble();

    // // Let's read a word!
    // System.out.println("Please enter something again");
    // word = reader.readString();

    // System.out.println(word);

    // Let's read a sentence!
    System.out.println("Please enter something ");
    sentence = reader.nextLine();
    System.out.println(sentence);

    // REMEMBER TO CLOSE THE READER!


  }
}