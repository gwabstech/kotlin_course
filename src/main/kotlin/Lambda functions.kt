fun main() {



    //println(myLambda("HABU"))

    sayHello("Abubakar") {name: String -> println("hello $name") }
}

fun sayHello(name: String,doMe:(String) -> Unit){
    doMe(name)

}

// Lambda

// Higher order functions
