class Lion():Feline(){
    override val image = "Lion.jdp"
    override val food ="meat"
    override val habitat = "forest"
    override fun makeNoise() {
        println("Ahhhhhh")
    }

    override fun eat() {
        println("The Lion is eating $food")
    }
}