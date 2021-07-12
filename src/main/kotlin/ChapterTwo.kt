fun main(){

    //type inference, literal and template strings, expressions and errors

    //type inference
    var greet = "Hello"

    println(greet::class)
    println(greet.javaClass)
    try {
        throwsAError()
    }catch(ex:Exception){
        val stackTrace = ex.getStackTrace()
        println(stackTrace[0])
        println(stackTrace[1])
    }

    //Template String
    val price = 12.25
    val taxRate = 0.08

    val output = "The amount $price after tax comes to $${price * (1+ taxRate)}"
    val disclaimer = "The amount is in US$, that's right in \$only"

    println(output)
    println(disclaimer)

    val name = "Machela"
    val escaped = "The kid asked, \"How's it going $name?\""
    val raw = """The kid asked, "How's it going $name?""""

    println(escaped)
    println(raw)
    println(escaped == raw)
    println(escaped === raw)

    println(createMemoFor("Eve"))
    println(tryExpr(false))
}

fun throwsAError(){
    println("throwsAError called...")
    throw RuntimeException("oops")
}

fun createMemoFor(name: String): String {
    if (name == "Eve") {
        val memo = """Dear $name, a quick reminder about the
|party we have scheduled next Tuesday at
|the 'Low Ceremony Cafe' at Noon. | Please plan to..."""
        return memo.trimMargin()
    }
    return ""
}

//Statement way
fun canVote(name:String, age:Int):String{
    var status: String
    if (age > 17){
        status = "yes, please vote"
    }else{
        status = "Nope, please come back"
    }
    return "$name, $status"
}

//Expression way
fun canVoteSecondWay(name:String,age:Int):String{
    val status = if (age > 17) "yes, please vote" else "Nope, please come back"
    return "$name, $status"
}

fun tryExpr(blowup:Boolean):Int{
    return try{
        if(blowup){
            throw RuntimeException("fail")
        }else{
            1
        }
    }catch (ex:Exception){
        0
    }
}




