package tech.liax;

import java.util.*;

public class Model implements Subject {
    private List<Observer> observers;
    private WeatherData weatherData;

    public Model() {
        observers = new ArrayList<>();
        weatherData = new WeatherData();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    public void setMeasurements(String temperature, String humidity, String pressure) {
        weatherData.addComponent(new Temperature(temperature));
        weatherData.addComponent(new Humidity(humidity));
        weatherData.addComponent(new Pressure(pressure));
        notifyObservers();
    }
}
