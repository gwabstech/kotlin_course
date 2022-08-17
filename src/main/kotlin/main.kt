fun main(args: Array<String>) {
    //println("Hello world!")

    /*
    println("Please enter a year..")
    val year = readln()?:"2020"
    val intYear = year.toInt()

    for (i in 1..12){

        val message = when(i){
            1 -> "January has 31"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else->"Nothing"

        }

        println(message)

    }


    val customers = hashMapOf(Pair("Abubakar", 4), Pair("Abdullahi", 8), Pair("Gwabare",6))

    for (customer in customers.keys){
        val purchase = customers[customer]
        println("Hello $customer you purchased $purchase")
    }
    val names  = arrayListOf("cat","dog","bear")
    for(name in names){
        println("feed the $name")

    }



    // For loop exercise
    for(i in 1..12){
        val month = when(i){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else->"Nothing"
        }
        println("Month #$i is called $month")
    }

    // summing 1 to 100 using range in for loop
    var total = 0;
    for(i in 1..100){
        total += i
    }
    println("The Total is $total")

    //val Customer = hashMapOf(Pair("Abubakar, 10"),Pair("Kopat, 8"),Pair("Habu,50"))



     */

    for (i in 1..5){
        println("Strike #$i")
    }
    println("You are out of the loop")

    // down to function for loop
    for (i in 10 downTo 0){
        println("$i")
        when(i){
            9 -> println("Start your machine")
            6 -> println("On your own Time")
            3 -> println("Get Set")
            0 -> println("Go")
        }
    }

    println(" ")
    // upto
    for (i in 2 until  10 step 2){
        println(i)

    }

    println(" ")
    // downto with step
    for (i in 10 downTo 0 step 3){
        println(i)
    }

    println(" ")

    //SDBFMNGA 0000 0017 7016 5893 006

    // nested for loop
    println("Enter a number")
    val size = readln()?.toInt()

    for(i in 0 ..size!!){
        for (j in 0..size){
            when(i * j % 3){
                0-> print("☺,☺ \t")
                1-> print("☺,☺ \t")
                2-> print("☺,☺ \t")
                3-> print("☺,☺ \t")
            }
        }
    }
    for (i in 0..size!!){
        for (j in 1..size){

            if (i*j % 3 == 0){
                print("☺,☺ \t")
            }else if (i*j % 3 == 1){
                print("☺,☺ \t")
            }else if (i*j % 3 == 2){
                print("☺,☺ \t")
            }
        }
        println(" ")
    }


    for(i in 1..10){
        for(j in 1..10){
            if(i == j)
                print("diagonal\t")
            else
                print("$i,$j  \t\t")
        }
    }


    for (i in 1..10 step 2){
        println(i)
    }



    println("")
    print("Enter a number...")
    val input = readln()?.toInt()
    if (input != null) {
        for (i in input downTo 0){
            if (i  < input && i % 7 == 0){
                println(i)
            }
        }


    }

    for (i in 1..10){
        for (j in 1..i){
            print("☺☺")
        }
        println()
    }
}