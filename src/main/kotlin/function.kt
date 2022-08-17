fun main() {

   greetings()




}

fun add(num:Int,num1 :Int): Int {

    return num+num1
}

fun piC(radius:Int) :Double{
    return 3.1415*radius*radius
}
fun sayHello(message:String):String{
    return  message
}

fun mul(){
    println("Enter a number")
    val input = readln().toInt()
    val result = input *17
    println(result)
}

fun g1(){
    println("Enter your name")
    val name = readln()
    println("How old ar you")
    val age = readln().toInt()
    println("Hello $name you are $age years old")
}

fun sayHelloToMembers(members: Collection<String>){
    for (members:String in members){
        println("Hello $members ")
    }


    fun String.repeat(n: Int): String {
        val sb = StringBuilder(n * length)
        for (i in 1..n) {
            sb.append(this)
        }
        return sb.toString()
    }



}

// shorthand function
fun calculateArea(radius: Int) = 3.14*radius*radius

fun sumOf3Numbers(a:Int,b:Int,c:Int) = a+b+c
fun addTax(price:Double) = price*1.2

fun lifeSpan(name:String) : Int{
    var life = 0
    when(name){
        "cat"-> life = 15
        "dog"-> life = 10
        "rabbit"-> life = 12
        else -> life = 20

    }
    return life
}

// functions overloading

fun sayName(name: String) = "hello $name"
fun sayName(name: String,age:Int) = "Hello $name aged $age"

fun feed(animal:String) = println("feeding $animal")
fun feed(animal: Collection<String>){
    for (animal in animal){
        feed(animal)
    }

}

fun size(message: String) = message.length
fun size(message: Int) = message.toString().length



// scope

// Vararg

fun a(vararg names: String){
    for (name in names){
        println("hello $name")
    }

}

fun b(count:Int, vararg names: String){
    for (name in names){
        for (i in 1..count){
            println("Hello $name")
        }
    }

}

// Local function


fun greetings(){
    fun g(name: String) = println("Hello $name")
    var name = ""
    while (true){
        println("Whats your name....")
        name = readln()?:""
        if (name== "") break
        g(name)
    }


}