class Car (val make: String, val model: String, var color: String) {

    fun accelerate(){
        println("run run")
    }
    fun details(){
        println(
            "Car is a ${this.color} and the model ${this.model}"
        )
    }
}
class Truck (val make: String, val model: String, val towingCapacity: Int  ){
    fun tow(){
        println("taking the horses to the rodeo")
    }
    fun details(){
        println(
            "Truck: \n " +
                    "${make} \n" +
                    "${model} \n" +
                    "${towingCapacity} \n"
        )
    }
}
fun main(args: Array<String>){
    val car = Car("Honda", "H1", "red")
    println(car.accelerate())
    car.details()

    val truck = Truck("Ford", "F-150", 1000)
    truck.tow()
    truck.details()

 }