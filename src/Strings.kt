import java.util.*

fun main(args: Array<String>) {
    val str = "May the force be with you"
    println(str)
    val str1 = "My dad said the funniest thing he said \"A joke\""
    println(str1)
    val anotherString = "Hello this is an another string \n and this is a other text in a new line with \t\t\t tabs"
    println(anotherString)
    //Cut characters
    val message = "Hello from\b deep web"
    println(message)
    println("May the force\r be with you ")
    println("May the force\' be with you ")
    println("May the force\\ be with you ")
    println("May the force\$ be with you ")

    //Text
    val longText = """A long time ago,
        |in a galaxy
        |far, far, away...
        |BUMM BUMM BUMMM""".trimMargin()
    print(longText)

    //Iterate in a string
    println()
    for( i in str ){
        print( "$i\t " )
    }
    println()
    val contentEquals = str.contentEquals("May the force be with you")
    println(contentEquals)
    val contains = str.contains("Force", false)
    println(contains)
    /*Upper case*/
    val uppercase = "This a text in uppercase"
    println(uppercase.uppercase(Locale.getDefault()))
    //Lower case
    val lowercase = uppercase.replace("uppercase", "lowercase").lowercase(Locale.getDefault())
    println(lowercase)
    //Conversions or casting numbers to strings
    val num = 6
    val stringNum = num.toString()
    println(stringNum)
    //Substrings
    val subsequence = str.subSequence(4, 13)
    println(subsequence)
    //Templates
    val luke = "Luke SkyWalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters")
}