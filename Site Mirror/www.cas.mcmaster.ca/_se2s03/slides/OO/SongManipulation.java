/*
 * Filename: SongManipulation.java
 * Description:
 * -> This class USES the Song class
 * --> We instantiate a few objects
 * ---> and manipulate them, hence the name
 * Author: 2S03MakeYouLearnGood
 */

public class SongManipulation {
  public static void main(String[] args) {
    // ERROR!
    // THIS WILL NOT WORK, why?
    // Song corinne = new Song();

    Song aqualung = new Song("Aqualung", "Jethro Tull", 398);

    /* Let us print all of the song info */
    // We could do it here...
    System.out.printf("Song: %s\n", aqualung.getName());
    System.out.printf("By: %s\n", aqualung.getArtist());
    System.out.printf("Runtime: %d seconds\n", aqualung.getRuntime());

    System.out.println();

    /* We may have meant the live version of the song */
    aqualung.setName(aqualung.getName() + " - Live");

    // These both work, but!

    // The first we change the FIELD VARIABLE runtime
    // via the ACCESSOR: setRuntime(int newRuntime)
    aqualung.setRuntime(446);

    // The second we update the FIELD VARIABLE runtime
    // in the OBJECT aqualung directly
    // WHY IS THIS BAD?????????
    aqualung.runtime = 496;


    //OR WE COULD...
    System.out.println(aqualung.toString());
  }
}