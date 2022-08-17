fun main() {
   /*
    println("enter a number")
    var num = readln()?.toInt()
    for (i in 1..num!!){
        if (i == 20){
            println("$i is skipped")
            continue
        }

        println("the i is $i")
    }


    */
    // continue is used to skip the current step and proceed to the next step base on condition
    // break is use to break out of a loop base on conditions

    // label
    /*
    A label is used to mark a position in code that you can jump to
    and it can be used with break and continue



    hq@for (i in 1..10){
        for (j in 1..10){
            if (i % 3 == 0){
                continue@hq

            }
            println("$i, $j")
        }
    }


  var animals = arrayListOf<String>()
   Gh@ for (i in 1..5){
        println("Please input animal ")
        val input = readln()?:""
        if (input == "snake" || input == "SNAKE"){
            println("Snakes are not accepted")
            break@Gh
        }else{
            animals.add(input)
            println("Added successfully.....")
        }
    }
    for (animal in animals){
        println(animal)
    }
    println("done")

      val clients = arrayListOf("Abubakar","cate","Abdullahi","cage")

    for (client in clients){
        val char:Char = client[0]

        when(char){
            'c' -> continue
            else -> println("Hello $client")
        }

    }
     */


    val agee = arrayListOf<String>()
    for (i in 1..5){
        println("Hello User $i")
        println("Enter your age please")
        val input = readln()?:""
        val age = input!!.toInt()
        if (age < 18 ){
            println("This client is not allowed..")
            continue
        }else if (input == "stop"){
            println("exiting......")
            println("closed successfully ")
            break
        }else{
            println("hello user $i with age $age")
            agee.add("$input user $i")
        }

        for (age in agee){
            println(age)
        }
    }

}