
fun main(){
    println( mapOf("Tom" to "Cat","Jerry" to "Mouse"))

    val cities = listOf<String>("Toronto","Auckland","Helsinki","Amsterdam")

    val temperatures = listOf<Int>(25,4,26,20)
    
    val citiesAndTemperatures =  cities.mapIndexed { i, city -> city to temperatures[i] }

    val citiesTwo =  mutableListOf<String>(*(cities.toTypedArray()))

    citiesTwo.add("Sidney")
    print(citiesTwo)


    println(citiesAndTemperatures)

    for(cityWithTemp in citiesAndTemperatures)
        println("${cityWithTemp.first} has a temperature of ${cityWithTemp.second}C")

    println("I'm a string".length == "I'm a string".count())


    val nums = Array(5) { i -> (i+1) * (i+1) }

    println(nums.toList().sum())

    val fruits = listOf("Banana","Orange","Cherry")

    val noBanana = fruits - "Banana"
    val plusOneFruit = fruits +  "Strawberry"

    println(noBanana)
    println(plusOneFruit)

    val sites = mapOf("Google" to "https://google.com", "Tesla" to "https://tesla.com", "Android" to "https://developer.android.com")
    val materialDesign = sites.getOrDefault("Material io", "https://dummy.com")

    println(sites.size)
    println(materialDesign)

    val sitesWithMaterial = sites + ("Material io" to "https://material.io")
    println(sitesWithMaterial)

    val sitesWithoutGoogle = sites - "Google"
    println(sitesWithoutGoogle)

    for( entry in sites){
        println(entry.key + " -- " + entry.value)
    }



    val sitesVersionTwo = sites.toMutableMap()


    println(sitesVersionTwo)

    println(sites.containsKey("Google"))
    println(sites.containsValue("https://developer.android.com"))
    println(sites.contains("Tesla"))
    println("Android" in sites)



}


