import javax.swing.ImageIcon

open class Animal(){
    open val image =""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise(){
        println("The Animal is making noise")
    }
    open fun eat(){
        println("The Animal is eating")
    }
    open fun roam(){
        println("The Animal is roaming")
    }
    open fun sleep(){
        println("The Animal is sleeping")
    }
}