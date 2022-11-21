package com.kodilla.proxy.weather;

public class LazyPolishWeatherProxy implements WeatherForecast {

    private WeatherForecast weatherForecast;

    @Override
    public String getWeather() throws InterruptedException {
        if (weatherForecast == null)
            weatherForecast = new PolishWeather();
        return weatherForecast.getWeather();
    }

    @Override
    public String refreshData() throws InterruptedException {
        if (weatherForecast == null)
            weatherForecast = new PolishWeather();
        return weatherForecast.refreshData();
    }
}
