/*
 * Filename: Song.scala
 * Description:
 * -> This class DESCRIBES songs.
 * --> Funnily enough it's also an example
 * ---> of a CLASS DECLARATION
 * Author: 2S03MakeYouLearnGood
 */

// Our constructor is up here!!
class Song(n:String, a:String, r:Int) {
  require( r != 0 ) // this is the equivalent of isRuntimeValid()

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
  private var name:String = n
  private var artist:String = a
  private var runtime:Int = r

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
  def getName(): String = name
  def getArtist(): String = artist
  def getRuntime(): Int = runtime

  def setName(newName: String) { name = newName }

  def setArtist(newArtist: String) { artist = newArtist }

  def setRuntime(newRuntime: Int) { runtime = newRuntime }

  override def toString(): String =
    "Song: " + name + "\n" +
    "By: " + artist + "\n" +
    "Runtime: " + runtime + " seconds"

}