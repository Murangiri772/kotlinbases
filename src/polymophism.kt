open class Shape{

    open  fun draw(){
        println("Drawing a shape")
    }
}
class  Circle:Shape(){
    override fun  draw(){
        println("Drawing a circle")
    }
}
class rectangle:Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}


fun main() {
    var sh = Shape()
    sh.draw()
    var cir = Circle()
    cir.draw()
    var rec = rectangle()
    rec.draw()
}