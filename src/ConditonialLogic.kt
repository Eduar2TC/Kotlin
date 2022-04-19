fun main(args: Array<String>) {
    var a:Int = 2
    val b:Int = 2
    if( a == b ){
        println("\'a\' does in fact equal \'b\'")
    }
    //If
    a = 3
    if( a != b ){
        println( "\'a\' does not equal \'b\'" )
    }
    //If - Else
    val acconuntBalance = 100.50
    val price = 50
    if( acconuntBalance >= price  ){
        println("You can buy this!")
    }else{
        println("Sorry, you broke!")
    }
    //Multiple conditionals
    val degrees = 20
    if( degrees >= 70 ){
        println(" This is some nice weather ")
    }else if( degrees < 70 && degrees >= 50 ){
        println("Grab a sweater")
    }else{
        println("Holy crap its cold")
    }

    //Booleans
    val isHungry = false
    val isBored = true

    if( isHungry == true || isBored == true ){
        println("Lets get pizza")
    }

    //When
    val x = 6
    when( x ){
        1 -> {println("x == 1")}
        2 -> println( "x == 2 ")
        else -> {
            println("x does not equal to 1 or 2")
        }
    }

    //combinations
    fun vaderIsFeeling( mood: String = "angry" ){
        if ( mood == "angry" ){
            println( "run for the hills, Vader is $mood" )
        }else{
            println("whatever you do, dont make him angry")
        }
    }
    vaderIsFeeling("angry")
}