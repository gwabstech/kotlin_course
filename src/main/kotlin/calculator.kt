import java.lang.reflect.Array.get
import kotlin.properties.Delegates

class calculator {
    private var total = 0.0
    val total1 get() = total




    fun addToTotal(num:Double){

        total+=num
        println("added $num to the total now total is $total")

    }

    fun subtractFromTotal(num: Double){

        total-=num
        println("subtracted $num from the total now total is $total")
    }

    fun multiplyTotal(num: Double){
        total*=num
        println("multiply $num to the total now total is $total")
    }

    fun devideTotal(num: Double){
        total/=num
        println("divide $num to the total now total is $total")
    }
    fun resetTotal(){
        total = 0.0
        println("total is set to zero")
    }

    object DatabaseAccess{
       private var connect = false

        fun connect(){
            connect = true
            println("Connected to the base")
        }

        fun disconnect(){
            connect = false
            println("disconnected from the base")
        }
    }

}



open class Human{
    val name = null
    val sex = null
    var age by Delegates.notNull<Int>()
    val legs = 4
    val eyes = 2
    var higth = null
}

open class Male:Human(){

    var dickSize = 6.0


}

class Female:Human(){
    var pussySize = "tithe"
}



open class Job{
    var name:String = ""


    var revenue : Double = 0.0
    var salary : Double = 0.0

    fun work(){

        revenue+=salary

    }
    fun study(){
        salary+=1500
    }
}


class Doctor:Job(){

}
class Police :Job(){

}
fun main() {
    val cal = calculator()
    cal.addToTotal(30.0)
    cal.multiplyTotal(30.90)
    cal.subtractFromTotal(500.9)
    cal.devideTotal(10.0)
    cal.resetTotal()
    println("total is ${cal.total1}")
    calculator.DatabaseAccess.connect()
    calculator.DatabaseAccess.disconnect()

    val male = Male()
    val female = Female()
    female.pussySize
    male.age = 25
    println(male.dickSize)
    println(female.pussySize)
    male.dickSize

    val doctor = Doctor()
    val police = Police()

    police.salary = 30000.0
    doctor.salary = 50000.00
    police.name = "Police"
    doctor.name = "Doctor"

    println("the police job has a revenue of ${police.revenue}")
    println("the Dr job has a revenue of ${doctor.revenue}")
    println()

    doctor.study()
    police.study()
    doctor.study()
    police.study()
    println("the police job has a revenue of ${police.revenue}")
    println("the Dr job has a revenue of ${doctor.revenue}")
    println()

    police.work()
    doctor.work()
    police.work()
    doctor.work()

    println("the police job has a revenue of ${police.revenue}")
    println("the Dr job has a revenue of ${doctor.revenue}")
    println()

    println("the police job has a revenue of ${police.revenue}")
    println("the Dr job has a revenue of ${doctor.revenue}")
    println()

    doctor.study()
    police.study()

    println("the ${police.name} job has a revenue of ${police.revenue}")
    println("the ${doctor.name} job has a revenue of ${doctor.revenue}")

}