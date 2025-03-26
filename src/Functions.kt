
fun main() {
    // standard-Library Functions/predefined functions
    var output = Math.sqrt(144.0)
    println("The squreroot of 144 is $output")

    var number = Math.round(45.89)
    println(number)

    school()
    add()
    students("John","Male",34)
    students("Ann","female",14)
    students("Kamau","male",24)
    employee("Mumias",30000,true)
    employee("Karaja",40000,false)
    employee("Kimani",50000,true)

}

//User-defined Functions
fun  school(){
    println("eMobilis")

}
fun add(){
    var x = 3
    var y = 5
    println(x+y)
}
//Parameters/variables and arguments/values
fun  students(name:String,gender:String,age:Int){
    println("$name is a $gender.$name is $age years old")

}
fun  employee(name: String,salary:Int,disability:Boolean){
    println("$name is payed $salary.$name as a $disability")

}