package designpatterns.observer.impl;

import designpatterns.observer.api.State;

// Holds state values the Observers get when from the Subject when there's a state change
public class WeatherState implements State {
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherState(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
