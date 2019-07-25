class Wolf : Canine(){
    override val image = "Wolf.jdp"
    override val food ="meat"
    override val habitat = "forest"
    override fun makeNoise() {
        println("Hooooowl")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}