package BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int pressure;
    private int temperature;
    private int humidity;

    private List<Observer> observerList;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(pressure, temperature, humidity);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }
}
