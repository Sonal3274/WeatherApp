enum class WeatherCondition {
    SUNNY, CLOUDY, RAINY, SNOWY
}

class WeatherApp {
    fun getCurrentWeather(): WeatherCondition {
        val conditions = WeatherCondition.values()
        return conditions[(Math.random() * conditions.size).toInt()]
    }

    fun displayWeather() {
        val currentWeather = getCurrentWeather()
        when (currentWeather) {
            WeatherCondition.SUNNY -> println("It's sunny outside!")
            WeatherCondition.CLOUDY -> println("It's cloudy outside.")
            WeatherCondition.RAINY -> println("It's raining outside.")
            WeatherCondition.SNOWY -> println("It's snowing outside.")
        }
    }
}

fun main() {
    val weatherApp = WeatherApp()
    weatherApp.displayWeather()
}
