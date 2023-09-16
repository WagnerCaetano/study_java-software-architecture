package BehavioralDesignPatterns.ObserverPattern;

public class BehavioralPatternObserver {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setPressure(100);

        weatherStation.setTemperature(20);

        weatherStation.setHumidity(30);


    }
}