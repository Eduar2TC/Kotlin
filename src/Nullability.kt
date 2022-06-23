fun main(args: Array<String>) {
    var name :String = "Pepe"
    var nullableName : String ?  = "Do I really exist?"
    var length = 0;
    //nullableName = null;
    //Null check
    if(  nullableName != null ){
        length = nullableName.length;
    }else{
        length = -1;
    }
    println(length)
    val l = if (nullableName != null ) nullableName.length else -1
    //Second method safe Call operator ?
    println( nullableName?.length );
    //Third method
    var len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me.."
    println(noName)

    //!!
    println(nullableName!!.length)


}