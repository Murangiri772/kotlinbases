class  person{
    var name = "Uhuru"
    var age = 45
    var gender = "Male"
    fun speak(){
        println("Doctor is speaking")
    }
}

fun main() {
    var doctor1 = person()
    doctor1.speak()
    println(doctor1.name)


}