package me.anmt.ssm.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class ObserverPatternTest {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();   //被观察者
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);//观察者，注册观察者
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    List<Float> forecastTemperatures = new ArrayList<Float>();
    forecastTemperatures.add(22f);
    forecastTemperatures.add(-1f);
    forecastTemperatures.add(9f);
    forecastTemperatures.add(23f);
    forecastTemperatures.add(27f);
    forecastTemperatures.add(30f);
    forecastTemperatures.add(10f);
    weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);
  }
}
