fun main( args: Array<String> ){
    //Simple function
    fun forceChocke(){
        println("You have failed me for the last time Admiral...")
    }
    forceChocke() //call inside main
    //Function with parameter
    fun makeEntrance( line: String ){
        println( line )
    }
    makeEntrance("I find your lack of faith disturbing")
    //Returning a value
    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        return rebels + ewoks
    }
    val rebels = calculateNumberGoodGuys( 5, 7 )
    println("Darth Vader faced off against : $rebels rebel scum")
    println("Darth Vader faced off against : ${calculateNumberGoodGuys(5, 7)} rebel scum")
    //Default values in arguments
    fun vaderIsFeeling( mood: String = "angry" ){
        println(mood)
    }
    vaderIsFeeling()
    vaderIsFeeling("meh")
}