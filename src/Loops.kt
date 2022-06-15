fun main(args: Array<String>) {
    //Loop for
    val rebels = arrayListOf<String>("Leiah", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder","Boba Fett" to "Rocket" )

    for ( rebel in rebels ){
        println("Name  $rebel")
    }

    for ( (key, value) in rebelVehicles ){
        println( "$key gets around their $value" )
    }

    //Loop while
    var x = 10
    while ( x > 0 ){
        println(" x : $x")
        x--
    }
    var y = 10
    do {
        println("y : $y")
        y--
    }while (y > 0)
}