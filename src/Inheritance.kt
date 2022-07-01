open class Vehicle ( val make: String, val model:String ) {

    open fun accelerate(){
        println("run")
    }
    fun park() {
        println("parkin.. ${make}")
    }
    fun brake(){
        println("Stopping")
    }

}
class Cars(make: String, model: String, var color: String) : Vehicle( make, model){
    override fun accelerate(){
        println("We are doing ludicrous mode!")
    }
}
class Truk( make: String, model: String, val towingCapacity: Int ) : Vehicle( make, model ){
    fun tow(){
        println("headed out to mountains")
    }
}

fun main(args: Array<String>) {
    val tesla = Cars("Tesla", "Model S", "red")
    tesla.accelerate()
    val truck = Truck("Ford", "F-150", 10000)

}