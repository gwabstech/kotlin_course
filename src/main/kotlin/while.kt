fun main() {

    /*
    var i = 1
    while (i < 10+1){
        println("Hello$i")
        i++
    }

    var cats = listOf("Tigger","Smokey","Sammy")
    var j = 0
    while (j < cats.size){
        println("Hello ${ cats[j]}")
        j++
    }

     println("Enter a number")
    var number = readln()?.toInt()
    var i = 1
    var factorial : Long = 1
    while (i <=number!!){
        factorial *= i
        i++
    }
    println("the factorial is $factorial")



    println("Please Enter a Large Integer")
    val number = readln()?.toInt()
    var i = 0
    while (i < number!!){
        if ( i % 7 == 0)
            println("$i is divisible by 7")
        i++
    }


     */

    // nested while loop
    var i = 1
    var j = 1
    while (i <= 10){
        while (j <= 10){
            print("$i, $j\t")
            j++
        }
        i++
        j = 0
        println()
    }
}