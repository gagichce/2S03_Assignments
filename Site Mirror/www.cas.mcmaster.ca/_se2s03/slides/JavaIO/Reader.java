import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Does exactly what it says! It reads!
 */

public final class Reader {

  /*
   * Initialise a Scanner object and connect it to System.in
   */
  private static Scanner reader = new Scanner(System.in);

  /*
   * Read an integer from the keyboard
   * @return Next value as int
   */
  public static int readInt() {
    while (true)
      try {
        return reader.nextInt();
      } catch (InputMismatchException ime) {
        error();
      }
  }

  /*
   * Read a double from the keyboard
   * @return Next value as double
   */
  public static double readDouble() {
    while (true)
      try {
        return reader.nextDouble();
      } catch (InputMismatchException ime) {
        error();
      }
  }

  /*
   * Read a string from the keyboard
   * Returned string has NO whitespace
   * @return Next value as String
   */
  public static String readString() {
    while (true)
      try {
        return reader.next();
      } catch (InputMismatchException ime) {
        error();
      }
  }

  /*
   * Read a string from the keyboard
   * @return Next value as String
   */
  public static String readLine() {
    while (true)
      try {
        return reader.nextLine();
      } catch (InputMismatchException ime) {
        error();
      }
  }

  /*
   * Print an error message
   */
  private static void error() {
    reader.nextLine(); // clear the line.
    System.out.println("Error in input. Try again.");
  }

  /*
   * Close the reader
   */
  private static void close() {
    reader.close();
  }
}