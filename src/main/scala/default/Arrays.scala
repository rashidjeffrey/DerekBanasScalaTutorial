package default

import scala.collection.mutable.ArrayBuffer

/**
 * Created by jeffrera on 13/10/15.
 */
object Arrays {
  def main(args: Array[String]) {

    // fixed size
    val favNums = new Array[Int](20)
    val friends = Array("Bob","Tom")
    friends(0) = "Sue"
    println("Best friends "+ friends(0))

    // variable size
    println("variable size friends")

    val friends2 = ArrayBuffer[String]()
    friends2.insert(0, "Phil")
    friends2 += "Mark"
    friends2 ++= Array("xxx", "yyy")
    friends2.insert(1, "aaa", "bbb")

    for (i <- friends2) {
      println("friend "+ i)
    }

    println("remove some friends")
    friends2.remove(1,2)

    for (i <- friends2) {
      println("friend "+ i)
    }

    println("populate an array")

    for (j <- 0 to (favNums.length-1)) {
      favNums(j) = j
      println(favNums(j))
    }

    val favNumsTimes2 = for (num <- favNums) yield 2 * num
    favNumsTimes2.foreach(println(_))
    favNumsTimes2.foreach(println)

    var favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num
    favNumsDiv4.foreach(println)

    // multi dim arrays
    println("multi dim arrays")
    var multTable = Array.ofDim[Int](10,10)

    for (i <- 0 to 9){
      for (j <- 0 to 9){
        multTable(i)(j) = i*j

      }
    }

    for (i <- 0 to 9){
      for (j <- 0 to 9){
        printf("%d: %d = %d\n",i,j,multTable(i)(j))

      }
    }

    println("Sum : " + favNums.sum)
    println("Min : " + favNums.min)
    println("Max : " + favNums.max)

    val sortedNums = favNums.sortWith(_>_)
    println(sortedNums.deep.mkString(", "))

  }
}
