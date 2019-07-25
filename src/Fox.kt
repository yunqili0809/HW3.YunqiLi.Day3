class Fox : Canine(){
    override val image = "Fox.jdp"
    override val food ="meat"
    override val habitat = "forest"
    override fun makeNoise() {
        println("Hooooowl")
    }

    override fun eat() {
        println("The Fox is eating $food")
    }
}