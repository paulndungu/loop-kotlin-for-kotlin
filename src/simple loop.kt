fun main(){

    println("I am strong")
    println("I am strong")
    println("I am strong")
    println("I am strong")
    println("I am strong")

//    instead we can write just a few lines of code to loop it the number of times we want
println("------------------------------------------")
    for (item in 1..5){
        println("Five outcomes")
    }

    println("------------------------------------------")
    for (item in 1..50){
        println("Fifty outcomes")
    }

    println("------------------------------------------")
    for (item in 1..5){
        println("The five outcomes are: $item")
        if (item==5)
            println("last item on the loop was $item")
    }
    println("end of the loop")

}