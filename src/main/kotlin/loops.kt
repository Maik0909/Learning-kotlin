fun main(){
    val oneTwoFive: IntRange = 1..5
    val chars: List<Char> = ('a'..'e').toList()
    println(chars)

    for(i in 1..5) {println("$i, ")}

    //Reverse iteration

    for( i in 5.downTo(1)) { println("$i, ") }

    //Infix notation

    for ( i in 5 downTo 1) println("$i, ")

    for ( j in  456 until 463) println("$j, ")

    for (k in 11 until 20 step 3) println("$k, ")

    for(l in (1..9).filter { it%3 == 0 || it%5 == 0 } )
        println("$l, ")


    val names =  listOf<String>("Spike","Tom","Jerry")

    for ( index in names.indices) println("position of ${names[index]} is $index")

    for ( (i,name) in names.withIndex()) println("position of $name is $i")


    fun whatToDo(dayOfWeek: Any) =  when (dayOfWeek){
        "Saturday","Sunday" -> "Relax"
        in 2..4 -> "Work hard"
        "Friday" -> "Party"
        is String -> "What?"
        else -> "No clue"
    }
    
    fun systemInfo(): String{
        val numberOfCores: Int =  Runtime.getRuntime().availableProcessors()
        return when(numberOfCores){
            1 -> "1 core, packing this one to the museum"
            in 2..16 -> "You have $numberOfCores cores"
            else -> "$numberOfCores cores!, I want your machine"
        }
    }

    fun systemInfoSecondWay(): String = when(val numberOfCores = Runtime.getRuntime().availableProcessors()){
        1 -> "1 core, packing this one to the museum"
        in 2..16 -> "You have $numberOfCores cores"
        else -> "$numberOfCores cores!, I want your machine"
    }
    
    println(whatToDo("Sunday"))
    println(systemInfo())
}