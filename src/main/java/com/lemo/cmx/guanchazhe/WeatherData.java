package com.lemo.cmx.guanchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 罗选通 on 2017/9/13.
 */
public class WeatherData implements Subject {
  private List<OBserver> observers;

  private float temperature;//温度
  private float humidity;//湿度
  private float pressure;//气压
  private List<Float> forecastTemperatures;//未来几天的温度

  public WeatherData(){
    this.observers=new ArrayList<OBserver>();
  }
  @Override
  public void registerObserver(OBserver observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(OBserver observer) {
    this.observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (OBserver observer : observers) {
      observer.update();
    }
  }

  public void setMeasurements(float temperature, float humidity,
                              float pressure, List<Float> forecastTemperatures) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.forecastTemperatures = forecastTemperatures;
    measurementsChanged();
  }
  public void measurementsChanged() {
    notifyObservers();
  }

  public float getTemperature() {
    return temperature;
  }

  public void setTemperature(float temperature) {
    this.temperature = temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public void setHumidity(float humidity) {
    this.humidity = humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void setPressure(float pressure) {
    this.pressure = pressure;
  }

  public List<Float> getForecastTemperatures() {
    return forecastTemperatures;
  }

  public void setForecastTemperatures(List<Float> forecastTemperatures) {
    this.forecastTemperatures = forecastTemperatures;
  }
}
