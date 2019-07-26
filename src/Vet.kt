class Vehicle: Roamable {
    override fun roam() {
        println("The Viehcle is roaming")
    }
}
class Vet(){
    fun giveShoot(animal: Animal){
        animal.makeNoise()
    }
}