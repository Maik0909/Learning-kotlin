fun main(){
    fun greet() = println("Well, hello")

    val message:Unit = greet()

    println("The return of greet is $message")

    fun randomNumber() = (0..100).random()

    println("The result of calling the above function was: ${randomNumber()}")

    randomNumber()
    max(intArrayOf(145,12,1,839,24,67))

    println(times(4)(9))

    println(curiousGreeting("Scott"))

    greetMany("Hi","Luke","James","Anne","Kate","Louis")

    greetMany(msg = "Hello",*arrayOf<String>("Joe","Ross","Jordan","Michael","Kyle"))

    //destructuring
    fun getFullName() = Triple("John","Quincy","Adams")

    val (first,middle,last) = getFullName()

    println("$first $middle $last")

}

fun max(numbers:IntArray):Int{
    var large = Int.MIN_VALUE
    for (number in numbers){
        large =  if(number > large) number else large
    }
    return  large
}

fun times(n:Int) = { factor:Int -> n * factor }

fun curiousGreeting(name:String,message:String = "Hi ${name.length}"):String = "$message $name"

fun greetMany(msg:String,vararg names:String):Unit{
    println("$msg ${names.joinToString(", ")}")
}


