package default

/**
 * Created by jeffrera on 14/10/15.
 */
object Classes {

  def main(args: Array[String]) {
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName(), rover.getSound())

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName()} with id ${whiskers.id} says ${whiskers.getSound()}")
    println(whiskers.toString)

    val spike = new Dog("Spike", "Woof", "Grrr")
    spike.setName("Spike1")
    println(spike.toString())

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.0
    println(fang.move)

  }


  class Animal(var name: String, var sound: String) {
    this.setName(name)

    val id = Animal.newIdNum

    def getName():String = name
    def getSound():String = sound

    def setName(name: String): Unit ={
      if (!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name= "No name"
    }

    def setSound(sound: String): Unit ={
      this.sound= sound
    }

    def this(name: String) {
      this("No name", "No sound")
      this.setName(name)
    }

    def this(){
      this("No name", "No sound")
    }

    override def toString(): String = {
      return "%s with the id %d says %s".format(this.name, this.id, this.sound)
    }
  }


  object Animal{
    private var idNumber = 0
    private def newIdNum = { idNumber += 1 ; idNumber}
  }


  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String){
      this("no name", sound, "no growl")
      this.setName(name)
    }

    def this(name: String){
      this("no name", "no sound", "no growl")
      this.setName(name)
    }

    def this(){
      this("no name", "no sound", "no growl")
    }

    override def toString(): String = {
      return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
    }

  }


  abstract class Mammal(val name: String){
    var moveSpeed: Double

    def move: String
  }

  class Wolf(name: String) extends Mammal(name){
    var moveSpeed = 35.0

    def move = "The wolf %s runs at %.2f mph".format(this.name, this.moveSpeed)

  }

}
