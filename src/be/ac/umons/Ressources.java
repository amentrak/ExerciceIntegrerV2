package be.ac.umons;
import javafx.beans.InvalidationListener;

import java.util.ArrayList;
import java.util.Observable;
public class Ressources implements RessourceComponent  {
    private String name;
    private ArrayList<Stock> listStock = new ArrayList<>();

    public Ressources(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {this.name=name; }
    public ArrayList<Stock> getListStock(){
        return listStock;
    }

    public void addStock(Stock i){listStock.add(i);}

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
    public String toString(){
        return name;
    }
}
