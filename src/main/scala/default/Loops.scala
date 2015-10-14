package default

/**
 * Created by jeffrera on 25/09/15.
 *
 * ~12 minutes into the tutorial
 * https://www.youtube.com/watch?v=DzFt0YkZo8M
 *
 */
object Loops {
  def main(args: Array[String]) {
    var i = 0

    while (i <= 10) {
      println(i)
      i += 1
    }

    do {
      println(i)
      i += 1
    } while (i <= 20)


    for (i <- 1 to 10) {
      println(i)
    }

    val randLetters = "dfsdfsdfsdfsdfsdfsdf"

    for (i <- 0 until randLetters.length)
      println(randLetters(i))

    // 16 mins
    val aList = List(1, 2, 3, 4, 5)
    for (i <- aList) {
      println("list items " + i)
    }


    var evenList = for {i <- 1 to 20
                        if (i % 2) == 0
    } yield i


    for (i <- 1 to 5; j <- 6 to 10 ) {
      println("i: " + i)
      println("j: " + j)

    }

    // 18m
    def printPrimes(): Unit = {
      val primeList = List(1,2,3,5,7,11)
      for (i <- primeList) {
        if (i==11) {
          return
        }

        if (i != 1 ){
          println(i)

        }
      }
    }


    printPrimes()
  }
}
