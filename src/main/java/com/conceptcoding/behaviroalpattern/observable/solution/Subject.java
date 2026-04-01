package com.conceptcoding.behaviroalpattern.observable.solution;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
