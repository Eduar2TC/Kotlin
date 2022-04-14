/*Variables Kotlin */
fun main(args: Array<String>) {

    val name = "Eduardo"
    var isAwesome = true
    isAwesome = false;

    println("Is " + name + " aswesome ? The answer is : " + isAwesome)

    var a = 3
    var b = 6
    println(a + b)
    //Mutability
    isAwesome = false
    //Inmutabilyty
    /*val isAwesome = true
    * isAwesome = false
    * */

    //Types
    val doubleNumber = 123.45 //64 bit
    val floatNumber = 123.45f //32 bit
    val longNumber = 12356789123L // 64 bit
    println(doubleNumber::class.java.typeName)
    println(floatNumber::class.java.typeName)
    println(longNumber::class.java.typeName)

    //Casting
    val aDoubletoString = a.toString()
    println(aDoubletoString::class.java.typeName)
    println(aDoubletoString)

    //Specify types
    val firstName: String = "John"
    val lastName: String = "Doe"
    val age: Int = 22
    val height = 2.10

    println("Hello my name is $firstName $lastName. My age is $age and my size is $height size. I´m tall")
}