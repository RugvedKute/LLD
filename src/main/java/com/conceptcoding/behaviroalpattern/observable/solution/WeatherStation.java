package com.conceptcoding.behaviroalpattern.observable.solution;

import java.util.ArrayList;

public class WeatherStation implements Subject{
    ArrayList<Observer> observerList = new ArrayList<>();
    String weather;

    @Override
    public  void  addObserver(Observer observer) {
        observerList.add(observer);
    }


    @Override
    public  void  removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }


}
