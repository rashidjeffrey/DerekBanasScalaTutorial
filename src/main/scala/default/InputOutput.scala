package default

/**
 * Created by jeffrera on 12/10/15.
 */
object InputOutput {

  def main(args: Array[String]) {

    var numGuess = 0

//    do {
//      print("Guess a number ")
//      numGuess = readLine.toInt
//    } while (numGuess != 15)


    printf("You guess the right number %d\n", 15)


    val name = "Derek"
    val age = 39
    val weight = 175

    println(s"Hello $name")
    println(f"I am ${age + 1} and weight $weight%.2f")

    printf("'%5d'\n", 5)
    printf("'%-5d'\n", 5)
    printf("'%05d'\n", 5)
    printf("'%.5f'\n", 3.14)

  }



}
