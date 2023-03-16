fun main() {
    oddEven()
    serve(5)
    serve(14)
    serve(20)
    fizzBuzz()
    var result = nameNames(arrayOf("Yoghurt","Eunice","Elephant","Hellow"))
    println(result)

}

//Create a function that prints out all the odd numbers between 1 and 100
fun oddEven(){
    var nums = 1..100
    for (num in nums) {
        if (num % 2 !== 0) {
            println(num)
        }
    }
}


//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun nameNames(num:Array<String>):Int {
    var x = 0
    for (n in num) {
        if (n.length > 5) {
            x++
        }

    }
    return x
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of Coca-Cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun serve(age:Int){
    when(age ){
    in  0..5 -> println("milk")
        in 6..14 -> println("fanta orange")
        else -> println("Coca-Cola")
    }
}

//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

fun fizzBuzz() {
    var i = 0
    while (i < 100) {
        i += 1

        if (i % 3 != 0 && i % 5 != 0) {
            print("$i")
        } else if (i % 3 == 0) {
            print("Fizz")
        }
        if (i % 5 == 0) {
            print("Buzz")
        }
        print("\n")
    }
}





