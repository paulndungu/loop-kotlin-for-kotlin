fun main(){

    for (number in 1..10){
        println("number= $number")
        for(numbers in 5..10){
            println("number= $numbers")
            println("this is the second half of the loop")
        }
        println("end of the nested loop")
    }

}