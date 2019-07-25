class Lynx():Feline(){
    override val image = "Lynx.jdp"
    override val food ="meat"
    override val habitat = "forest"
    override fun makeNoise() {
        println("Ahhhhhh")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}