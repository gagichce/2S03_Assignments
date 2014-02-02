/*
 * Filename: SongManipulation.scala
 * Description:
 * -> This class USES the Song class
 * --> We instantiate a few objects
 * ---> and manipulate them, hence the name
 * Author: 2S03MakeYouLearnGood
 */

object SongManipulaton extends App {
  val aqualung = new Song("Aqualung", "Jethro Tull", 398)

  /* Let us print all of the song info */
  // We could do it here...
  printf("Song: %s\n", aqualung.getName)
  printf("By: %s\n", aqualung.getArtist)
  printf("Runtime: %d seconds\n", aqualung.getRuntime)

  println()

  /* We may have meant the live version of the song */
  aqualung.setName(aqualung.getName() + " - Live")

  // Changing the FIELD VARIABLE runtime
  // via the ACCESSOR: setRuntime(int newRuntime)
  aqualung.setRuntime(446)

  // Using the toString() method
  println(aqualung.toString())
}