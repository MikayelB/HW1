import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.hw1.ui.theme.HW1Theme
import java.time.LocalDateTime
import java.util.Scanner

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HW1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Place the tasks here
                    task1()
                    task2()
                    task3()
                    task4(10)
                    task4(-5)
                    task4(0)
                    task5()
                    divideNumbers(10.0, 2.0)
                    divideNumbers(5.0, 0.0)
                    task7()
                    val person = Person("Alice", 25)
                    task8()
                    task9()
                    task10()
                }
            }
        }
    }

    // Task 1: Declare an array and a list, initialize them, and print the elements.
    fun task1() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val list = listOf("apple", "banana", "cherry")
        println("Task 1:")
        println("Array: ${array.joinToString()}")
        println("List: ${list.joinToString()}")
    }

    // Task 2: String manipulations
    fun task2() {
        var originalString = "Hello, World!"
        val modifiedString = originalString + " How are you?" // Concatenation
        val substring = originalString.substring(7, 12) // Substring extraction
        val upperCaseString = originalString.uppercase() // Changing case
        println("Task 2:")
        println("Modified String: $modifiedString")
        println("Substring: $substring")
        println("Uppercase String: $upperCaseString")
    }

    // Task 3: Declare a map and iterate through it
    fun task3() {
        val personMap = mapOf("name" to "John", "age" to 30)
        println("Task 3:")
        for ((key, value) in personMap) {
            println("$key: $value")
        }
    }

    // Task 4: Function to determine if an integer is positive, negative, or zero
    fun task4(input: Int) {
        val result = when {
            input > 0 -> "Positive"
            input < 0 -> "Negative"
            else -> "Zero"
        }
        println("Task 4:")
        println("$input is $result")
    }

    // Task 5: Ask the user for their name and age, then print a personalized greeting
    fun task5() {
        val scanner = Scanner(System.`in`)
        print("Task 5: Please enter your name: ")
        val name = scanner.nextLine()
        print("Please enter your age: ")
        val age = scanner.nextInt()
        println("Hello, $name!")
        when {
            age < 13 -> println("You are a Child")
            age in 13..19 -> println("You are a Teenager")
            else -> println("You are an Adult")
        }
    }

    // Task 6: Function to divide two numbers with error handling
    fun divideNumbers(num1: Double, num2: Double) {
        println("Task 6:")
        try {
            val result = num1 / num2
            println("Result of division: $result")
        } catch (e: ArithmeticException) {
            println("Error: Division by zero is not allowed.")
        }
    }

    // Task 7: Get the current date and time, format it, and print it
    fun task7() {
        val currentDateTime = LocalDateTime.now()
        val formattedDateTime = currentDateTime.toString()
        println("Task 7:")
        println("Current Date and Time: $formattedDateTime")
    }

    // Task 8: Define a simple "Person" class and create an object
    class Person(val name: String, val age: Int)

    fun task8() {
        val person = Person("Alice", 25)
        println("Task 8:")
        println("Person Name: ${person.name}")
        println("Person Age: ${person.age}")
    }

    // Task 9: Extend Person class and return a life stage based on age
    fun Person.lifeStage(): String {
        return when {
            age < 13 -> "Child"
            age in 13..19 -> "Teenager"
            else -> "Adult"
        }
    }

    fun task9() {
        val person = Person("Bob", 17)
        println("Task 9:")
        println("${person.name} is a ${person.lifeStage()}")
    }

    // Task 10: Declare a list of integers and use a lambda to filter and print even numbers
    fun task10() {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println("Task 10:")
        val evenNumbers = numbers.filter { it % 2 == 0 }
        println("Even Numbers: ${evenNumbers.joinToString()}")
    }

    fun main() {
        task1()
        task2()
        task3()
        task4(10)
        task4(-5)
        task4(0)
        task5()
        divideNumbers(10.0, 2.0)
        divideNumbers(5.0, 0.0)
        task7()
        task8()
        task9()
        task10()
    }

}
