package be.ac.umons;

import javafx.beans.Observable;

public interface RessourceComponent extends Observable {

    public abstract String getName();
    public abstract void setName(String n);
    public abstract  String toString();
}
