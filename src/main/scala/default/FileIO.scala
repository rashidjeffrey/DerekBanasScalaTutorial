package default

import java.io.PrintWriter

import scala.io.Source


/**
 * Created by jeffrera on 14/10/15.
 */
object FileIO {

  def main(args: Array[String]) {


    val writer = new PrintWriter("test.txt")
    writer.write("ssssssssssssssssssssssss\nasdsadsadsadsadsa\n")
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")


    val lineIterator = textFromFile.getLines()

    for (line <- lineIterator)
      println(line)


    textFromFile.close()

  }

}
