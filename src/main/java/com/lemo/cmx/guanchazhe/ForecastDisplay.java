package com.lemo.cmx.guanchazhe;

import java.util.List;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class ForecastDisplay implements OBserver, DisplayElement {

  private WeatherData weatherData;

  private List<Float> forecastTemperatures;//未来几天的温度

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("未来几天的气温");
    int count = forecastTemperatures.size();
    for (int i = 0; i < count; i++) {
      System.out.println("第" + i + "天:" + forecastTemperatures.get(i) + "℃");
    }
  }

  @Override
  public void update() {
    this.forecastTemperatures = this.weatherData.getForecastTemperatures();
    display();
  }

}
