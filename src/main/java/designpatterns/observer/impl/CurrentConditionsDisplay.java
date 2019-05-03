package designpatterns.observer.impl;

import designpatterns.observer.api.DisplayElement;
import designpatterns.observer.api.Observer;
import designpatterns.observer.api.Subject;

public class CurrentConditionsDisplay implements Observer<WeatherState>, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherState weatherState) {
        this.temperature = weatherState.getTemp();
        this.humidity = weatherState.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
