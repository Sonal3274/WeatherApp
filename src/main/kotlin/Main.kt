//enum class Weather {
//    SUNNY, CLOUDY, RAINY, SNOWY
//}
//
//fun main() {
//    val currentWeather = Weather.CLOUDY
//
//    when (currentWeather) {
//        Weather.SUNNY -> println("It's sunny outside, wear sunscreen.")
//        Weather.CLOUDY -> println("It's cloudy outside, bring an umbrella.")
//        Weather.RAINY -> println("It's raining outside, wear a raincoat.")
//        Weather.SNOWY -> println("It's snowing outside, wear warm clothes.")
//    }
//}

/*
class Weather(val temperature: Double, val condition: String) {
    fun getAdvice(): String {
        return when (condition) {
            "sunny" -> "It's sunny outside, wear sunscreen."
            "cloudy" -> "It's cloudy outside, bring an umbrella."
            "rainy" -> "It's raining outside, wear a raincoat."
            "snowy" -> "It's snowing outside, wear warm clothes."
            else -> "I'm not sure what the weather is like."
        }
    }
}

object WeatherData {
    fun getWeather(): Weather {

        val temperature = 20.0
        val condition = "sunny"
        return Weather(temperature, condition)
    }
}
*/

fun main() {

    val temp1 = 20.0
    val temp2 = 35.2
    println("The sum of $temp1 and $temp2 is ${temp1 + temp2}")
}





/*  var currentWeather = WeatherData.getWeather()
  println("Temperature: ${currentWeather.temperature}")
  println("Advice: ${currentWeather.getAdvice()}")*/



/*In this example, we have defined a class called Weather that takes in the temperature and condition of the weather.
 We also have an getAdvice method that returns a string with advice based on the weather condition.
 We then have an object called WeatherData which has a getWeather method that returns an instance of Weather.
 In the main function, we call getWeather to get the current weather and then output the temperature and advice.
 The use of an object in this example makes it easy to reuse the getWeather method in other parts of the app.
*/

