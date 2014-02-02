/*
 * Filename: Song.java
 * Description:
 * -> This class DESCRIBES songs.
 * --> Funnily enough it's also an example
 * ---> of a CLASS DECLARATION
 * Author: 2S03MakeYouLearnGood
 */

public class Song {

  /* ----- PROPERTIES ----- */

  /*
   * FIELD VARIABLES
   *
   * They tell you the PROPERTIES of
   * the class, in this case we're
   * saying that a song has a:
   * name, type of String
   * runtime, type of int
   */
  String name;
  String artist;
  int runtime;

  /* ----- BEHAVIOUR ----- */

  /*
   * Our first CONSTRUCTOR
   * Let's talk about this.
   * In order to do that we have to talk
   * about INSTANTIATION
   * or how I learnt to stop worrying
   * and love OBJECT CREATION.
   */
  private Song() {}

  /*
   * Our second CONSTRUCTOR
   */
  public Song(String n, String a, int runtime) {
    name = n;
    artist = a;

    /*
     * The 'this' keyword is useful
     * it allows us to disamibiguate
     * basically allowing us to say:
     *
     * Take the parameter run time and assign
     * it to my field variable runtime
     */
    this.runtime = runtime;
  }

  /*
   * INSTANCE METHODS
   * These are going to continue
   * the description of the behaviour
   * of a song.
   *
   * We're going to have 2 types of
   * instance methods ACCESSORS
   * and MUTATORS
   *
   * We want to be able to change and
   * retrieve various things.
   * i.e. ACCESS and MUTATE
   * e.g both ACCESS AND MUTATE
   * the runtime, name, or artist
   */
  public String getName() { return name; }
  public String getArtist() { return artist; }
  public int getRuntime() { return runtime; }

  public void setName(String newName) {
    name = newName;
  }
  public void setArtist(String newArtist) {
    artist = newArtist;
  }
  public void setRuntime(int newRuntime) {
    if( !isRuntimeValid(newRuntime) ){
      throw new IllegalArgumentException("That runtime is ****ed up.");
    }

    runtime = newRuntime;
  }

  private boolean isRuntimeValid(int r) {
    if( r < 0 )
      return false;
    return true;
  }

  public String toString() {
    return "Song: " + name + "\n" +
           "By: " + artist + "\n" +
           "Runtime: " + runtime + " seconds";
  }

}