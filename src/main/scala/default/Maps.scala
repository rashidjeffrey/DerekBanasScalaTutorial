package default

/**
 * Created by jeffrera on 14/10/15.
 * https://www.youtube.com/watch?v=DzFt0YkZo8M
 * 41 mins
 */
object Maps {

  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

    if (employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))


    val customers = collection.mutable.Map(100->"Paul Smith",101->"Sally Smith")
    printf("Cust 1: %s\n", customers(100))

    customers(100) = "Tom Marks"
    customers(102) = "Fred Bloggs"

    for ((k,v)<-customers)
      printf("%d : %s\n", k, v)
  }

}
