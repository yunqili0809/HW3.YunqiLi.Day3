import javax.swing.ImageIcon

abstract class Animal(){
    abstract val image : String
    abstract val food :String
    abstract val habitat: String
    val hunger = 10

    abstract fun makeNoise()
    abstract fun eat()
    open fun roam(){
        println("The Animal is roaming")
    }
    open fun sleep(){
        println("The Animal is sleeping")
    }
}