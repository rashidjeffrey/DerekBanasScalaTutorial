package default

/**
 * Created by jeffrera on 12/10/15.
 */
object Strings {
  def main(args: Array[String]) {
    var stuff = "I like watermelon"

    println("Length : " + stuff.length)
    println("3rd char : " + stuff(2))
    println(stuff.concat(" and firm pears"))
    println("equal? " + "I saw a sausage".equals(stuff))
    println("watermelon starts at index " + stuff.indexOf("watermelon"))

    val stuffArray = stuff.toArray

    for (v <- stuffArray)
      println(v)
  }

}
