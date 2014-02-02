/*
 * Filename: Song.java
 * Description:
 * -> This class DESCRIBES songs.
 * --> Funnily enough it's also an example
 * ---> of a CLASS DECLARATION
 * ----> Now! It also keeps track of how
 * -----> many rap or rock songs!!
 * Author: 2S03MakeYouLearnGood
 */

public class Song {

  /* ----- PROPERTIES ----- */

  /* (+) FIELD VARIABLES */

  private String name;
  private String artist;
  private int runtime;
  private int genre;

  /* (-) FIELD VARIABLES */


  /* (+) STATIC VARIABLES */

  public static int numOfSongs = 0;

  /* (-) STATIC VARIABLES */


  /* (+) CONSTRUCTORS */
  // They have NO RETURN TYPE, see?

  public Song() {
    this.name = "Name of Song";
    this.artist = "Song Artist";
    this.runtime = 0;
    this.genre = 0;

    updateNumberOfSongs();
  }

  // see?
  public Song(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.runtime = 0;
    this.genre = 0;

    updateNumberOfSongs();
  }

  // see?
  public Song(String name, String artist, int runtime) {
    this.name = name;
    this.artist = artist;
    this.runtime = runtime;
    this.genre = 0;

    updateNumberOfSongs();
  }

  // see?
  public Song(String name, String artist, int runtime, int genre) {
    this.name = name;
    this.artist = artist;
    this.runtime = runtime;
    this.genre = genre;

    updateNumberOfSongs();
  }

  /* (-) CONSTRUCTORS */


  /* (+) INSTANCE METHODS */
  public String getName() { return this.name; }
  public String getArtist() { return this.artist; }
  public int getRuntime() { return this.runtime; }
  public int getGenre() { return this.genre; }

  public void setName(String name) { this.name = name; }
  public void setArtist(String artist) { this.artist = artist; }
  public void setRuntime(int runtime) {
    if( runtime < 0 )
      throw new IllegalArgumentException("That runtime is ****ed up.");

    this.runtime = runtime;
  }
  public void setGenre(int genre) {
    if( genre != 0 && genre != 1)
      throw new IllegalArgumentException("'0' or '1' please!");
    this.genre = genre;
  }

  public String toString() {
    String g = "";
    switch (this.genre) {
      case 0: g = "Rap"; break;
      case 1: g = "Rock"; break;
    }
    return "Song: " + this.name + "\n" +
           "By: " + this.artist + "\n" +
           "Runtime: " + this.runtime + " seconds\n" +
           "Genre: " + g + "\n";
  }

  /* (-) INSTANCE METHODS */


  /* (+) STATIC METHODS */

  // Before we make a METHOD (nay! anything)
  // PUBLIC STATIC
  // we need to ask ourselves the question:
  // -> Does it make sense to
  // --> CALL this METHOD (or otherwise)
  // ---> if we've not created ANY objects?
  // ----> this is a STOOPID PUBLIC STATIC METHOD
  public static String creator() {
    return "2S03MakeYouLearnGood";
  }

  private static void updateNumberOfSongs() {
    numOfSongs++;
  }

  /* (-) STATIC METHODS */
}