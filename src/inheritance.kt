//parent class/Base class/super class
open class  Animal{
    var gender = "Male"
    var age = 3
    fun makesound(){
        println("Animal is speaking")
    }
}
//child class/Derived class/sub class
class Dog:Animal(){
    fun bark(){
        println("woof! woof!")
    }
}

class cat{
    var color = "White"
    var hasFurs = true

    fun meow(){
        println("Meow! Meow!")
    }
}

fun main() {
    var a = Animal()
    a.age
    var d = Dog()
    d.bark()
    var c = cat()
    c.meow()
}
