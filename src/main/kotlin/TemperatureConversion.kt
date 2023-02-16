import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("Please enter a temperature:")
    val temperature = scanner.nextDouble()

    println("Is the temperature in Celsius or Fahrenheit? Enter 'C' for Celsius, 'F' for Fahrenheit:")
    val scale = scanner.next()

    val convertedTemperature: Double
    val originalScale: String

    if (scale.equals("C", ignoreCase = true)) {
        convertedTemperature = celsiusToFahrenheit(temperature)
        originalScale = "Celsius"
    } else if (scale.equals("F", ignoreCase = true)) {
        convertedTemperature = fahrenheitToCelsius(temperature)
        originalScale = "Fahrenheit"
    } else {
        println("Invalid input. Please enter either 'C' or 'F'.")
        return
    }

    println("$temperature degrees $originalScale is $convertedTemperature degrees ${if (originalScale == "Celsius") "Fahrenheit" else "Celsius"}.")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 1.8) + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) / 1.8
}