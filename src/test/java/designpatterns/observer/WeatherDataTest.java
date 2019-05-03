package designpatterns.observer;

import designpatterns.observer.api.Observer;
import designpatterns.observer.impl.WeatherData;
import designpatterns.observer.impl.WeatherState;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WeatherDataTest {

    @Test
    public void whenNewMeasurementObserverIsCalled() {
        WeatherData weatherData = new WeatherData();
        Observer observer = mock(Observer.class);

        weatherData.registerObserver(observer);

        weatherData.setMeasurements(30.0f, 20f, 40f);


        ArgumentCaptor<WeatherState> stateArgumentCaptor = ArgumentCaptor.forClass(WeatherState.class);
        verify(observer).update(stateArgumentCaptor.capture());
        assertEquals(30.0f, stateArgumentCaptor.getValue().getTemp(),0);
        assertEquals(20f, stateArgumentCaptor.getValue().getHumidity(),0);
        assertEquals(40f, stateArgumentCaptor.getValue().getPressure(),0);
    }
}
