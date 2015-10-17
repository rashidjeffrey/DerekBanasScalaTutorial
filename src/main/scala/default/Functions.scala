package default

/**
 * Created by jeffrera on 12/10/15.
 */
object Functions {



  def main(args: Array[String]) {
    println("5 + 4 = " + getSum(5, 4))
    println("5 + 4 = " + getSum(num2=5, num1=4))
    sayHi()
    println("Get sum " +  getSum(1,2,3,4,5,6,7,8,9))
    println("Factorial of 4 = " + factorial(4))
  }

  def getSum(num1 : Int = 1 , num2 : Int = 1) :  Int = {
    return num1 + num2
  }

  def getSum(args : Int*) :  Int = {
    var sum : Int = 0
    for (num <- args) {
      sum += num
    }
    sum
  }

  def sayHi() : Unit = {
    println("Hi ")
  }

  // 31 mins
  def factorial(num :BigInt): BigInt = {
    if(num <= 1)
      1
    else
      num * factorial(num - 1)

  }

}
