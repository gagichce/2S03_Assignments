/*
 * Filename: SongManipulation.java
 * Description:
 * -> This class USES the Song class
 * --> We instantiate a few OBJECTS
 * ---> and manipulate them, hence the name
 * ----> We're also going to play with some
 * -----> STATIC variables
 * Author: 2S03MakeYouLearnGood
 */

public class SongManipulation {
  public static void main(String[] args) {
    System.out.println();

    Song corinne = new Song();
    Song alterEgo = new Song("Alter Ego", "Tame Impala");
    Song nCITW = new Song("No Church in the Wild", "Jay-Z and Kanye West", 272, 0);

    System.out.println(corinne.toString());
    System.out.println(alterEgo.toString());
    System.out.println(nCITW.toString());

    corinne.setName("Corinne");
    corinne.setArtist("Metronomy");
    corinne.setRuntime(189);
    corinne.setGenre(1);

    // This will fail why?
    // alterEgo.setRuntime(298.6);

    System.out.println();

    System.out.println(corinne.toString());
    System.out.println(alterEgo.toString());
    System.out.println(nCITW.toString());

    // Making reference to some STATIC data
    System.out.println("Number of created songs: " + Song.numOfSongs);
    System.out.println("Class Creator: " + Song.creator());
  }
}