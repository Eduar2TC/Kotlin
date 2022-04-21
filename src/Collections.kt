fun main(args: Array<String>) {
    //Collections - Arrays
    //Immutable arrays
    val imperials = listOf<String>("Emperor", "Darth vader", "Boba Fett", "Tarkin")
    println(imperials)
    //Orders
    println(imperials.sorted())
    //Access to index
    println(imperials[1])
    //Get last item
    println(imperials.last())
    //Search item return a boolean
    println(imperials.contains("Emperor"))
    println(imperials.contains("Luke"))

/*for (i in imperials){
        println(i)
    }*/
    //Mutable Arrays
    val rebels = arrayListOf<String>("Leiah", "Luke", "Han Solo", "Mon Mathma")
    println(rebels )
    //Get size
    println(rebels.size)
    //Add to end
    rebels.add("Chewbacca")
    println(rebels)
    //Add to init
    rebels.add(0, "Lando")
    println(rebels)
    //Get index number from String
    println(rebels.indexOf("Luke"))

    //Remove elements in array
    println("Remove elements")
    rebels.remove("Han Solo")
    println(rebels)

    //Collections - Maps
    //Immutable Maps
    val rebelsVehicles =  mapOf<String, String>("Solo" to "Millennium Falcon",
                                                "Luke" to "LandSpeeder"
    )
    //Access by key
    println(rebelsVehicles["Solo"])
    //Acces by get method
    println(rebelsVehicles.get("Luke"))
    //Default if key not exist
    println(rebelsVehicles.getOrDefault("Leia", "This ship does not exist"))
    println(rebelsVehicles.values)

    //Mutable maps
    println("Mutable maps")
    val rebelsVehiclesHashMap = hashMapOf<String, String>(
        "Solo" to "Millennium Falcon",
        "Luke" to "LandSpeeder",
        "Boba Fett" to "Rocket Pack"
    )
    //Change values
    //In index for key
    rebelsVehiclesHashMap["Luke"] = "XWing"
    //Put element
    rebelsVehiclesHashMap.put("Leiha", "Tentative IV")
    println(rebelsVehiclesHashMap)
    //Remove element by key
    rebelsVehiclesHashMap.remove("Boba Fett")
    println(rebelsVehiclesHashMap)
    //Clear map
    rebelsVehiclesHashMap.clear()
    println(rebelsVehiclesHashMap)
}