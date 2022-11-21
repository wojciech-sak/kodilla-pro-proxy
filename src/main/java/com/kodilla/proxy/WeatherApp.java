package com.kodilla.proxy;

import com.kodilla.proxy.weather.LazyPolishWeatherProxy;
import com.kodilla.proxy.weather.WeatherForecast;

import java.util.Random;

public class WeatherApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherForecast weatherForecast = new LazyPolishWeatherProxy();
            int number = new Random().nextInt(100);
            if (number < 20)
                System.out.println(weatherForecast.refreshData());
            else if (number < 50)
                System.out.println(weatherForecast.getWeather());

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}
