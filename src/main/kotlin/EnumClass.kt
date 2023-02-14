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
        println("Current weather: $currentWeather")
    }
}

fun main() {
    val weatherApp = WeatherApp()
    weatherApp.displayWeather()
}
