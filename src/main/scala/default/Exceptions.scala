package default

/**
 * Created by jeffrera on 14/10/15.
 */
object Exceptions {

  def main(args: Array[String]) {

    def divdeNums(num1 : Int, num2 : Int)  = try {
      (num1/num2)

    } catch {
      case ex : java.lang.ArithmeticException => "Can't divide by zero"
    } finally {
      // clean up
    }

    print("3/0=" + divdeNums(3,0))
  }

}
