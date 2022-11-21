package com.kodilla.proxy.weather;

public class PolishWeather implements WeatherForecast {

    private String currentWeather;

    public PolishWeather() throws InterruptedException {
        refreshData();
    }

    @Override
    public String getWeather() {
        currentWeather = "In Poland now is rainy and really cold.";
        return currentWeather;
    }

    @Override
    public String refreshData() throws InterruptedException {
        Thread.sleep(5000);
        currentWeather = "Weather clears up, it is getting warmer and sunnier";
        return currentWeather;
    }
}
