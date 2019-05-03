package designpatterns.observer.impl;

import designpatterns.observer.api.Observer;
import designpatterns.observer.api.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

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
        observers.forEach(observer ->
                observer.update(new WeatherState(temperature, humidity, pressure)));
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // only for test purposes
    // this is called when the WeatherData object is notified of state change by an external service
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
