import kotlin.system.exitProcess

fun main(){

    for(numbers in 1..20){
//        println("The following are the numbers: $numbers")

        if (numbers==15){
            continue
        }
        println("The following are the numbers: $numbers")
        if (numbers==10){
            break
        }
    }
    println("-----------------------------------------")

loop@    for (number1 in 30..50){
        for (number2 in 40..50){
            println("number= $number1")
            if (number2==45)
                break@loop
        }
    }
    println("end of loop.")

}