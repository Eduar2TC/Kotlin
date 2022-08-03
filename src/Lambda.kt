fun main() {
    val printMessage = { message : String -> println(message) }

    println("Hello world")

    val sumA = { x: Int, y: Int -> x + y }
    println( sumA( 5, 3 ) )

    val name = { name: String , age:Int -> println( "Hello + $name my age is $age" )  }
    println( name( "Pepe", 10 ))

    fun downloadData( url: String, completion:()-> Unit ){
        //send download request
        //we go back data
        //there were no network errors
        completion()
    }
    downloadData("fakeurl.com",{
        println("The code  in this block, will only run" +
                "after the completion()"
        )
    })
    fun downloadCarData( url:String, completion: ( Car ) -> Unit ){
        //send a download request
        //we go back car data
        val car = Car( "Tesla", "ModelX", "Blue" )
        completion(car)
    }
    downloadCarData("fakeUrl.com"){
        println(it.color)
        println(it.make)
    }
    downloadCarData("fakeUrl.com"){
        car->
        println(car.color)
        println(car.make)
    }
    fun downloadTruckData( url: String, completion: ( Truck?, Boolean ) -> Unit ){
        //make the web request
        //we get the results back
        val webRequestSuccess = true
        if( webRequestSuccess ){
            //recieved truck data
            val truck = Truck( "Ford", "F-150", 10000 )
            completion(truck, true)
        }else{
            completion( null, false )
        }
    }
    downloadTruckData( "fakeUrl.com" ){
            truck, success ->
        if(success){
            //do something with our truck
            truck?.tow()
        }else{
            println("Something went wrong!")
        }
    }
}