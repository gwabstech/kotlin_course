fun main() {


    val numbers = arrayListOf<Int>(10, 20, 50, 40, 60, 80)
    numbers.forEach {
        println("Hello $it")
    }
    println("old list: $numbers")

    val newNumbers = update(numbers) { numbers -> numbers / 10 }

    println("new numbers list: $newNumbers")
    val l = arrayListOf<String>("Abu", "Ali", "Habu")

    sayHello("Abubakar") { name: String -> println("hello $name") }
    val msg = messages(l) { m: String -> "Hello $m how you" }
    println(msg)
}

fun sayHello(name: String, doMe: (String) -> Unit) {
    doMe(name)

}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for (i in 0..numbers.size - 1) {
        if (numbers[i] % 2 == 0)
            numbers[i] = lbd(numbers[i])
    }
    return numbers
}

// Lambda

// Higher order functions

fun messages(clients: ArrayList<String>, l: (String) -> String): ArrayList<String> {
    val messge = arrayListOf<String>()
    for (client in clients) {
        messge.add(l(client))
    }
    return messge
}

