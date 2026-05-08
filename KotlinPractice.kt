fun main() {

    // Variables
    val name = "Lailat"
    var age = 21

    println("My name is $name and I am $age years old.")

    // Function
    fun area(width: Double, height: Double): Double {
        return width * height
    }

    println(area(3.0, 4.0))

    // Grade Calculator
    fun grade(score: Int): String {
        return when {
            score >= 80 -> "A"
            score >= 70 -> "B"
            score >= 60 -> "C"
            score >= 50 -> "D"
            else -> "F"
        }
    }

    println(grade(75))

    // FizzBuzz
    for (i in 1..30) {
        when {
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

    // List Operations
    val nums = listOf(1,2,3,4,5,6)

    println(nums.sum())
    println(nums.filter { it % 2 == 0 })
    println(nums.map { it * 2 })
}