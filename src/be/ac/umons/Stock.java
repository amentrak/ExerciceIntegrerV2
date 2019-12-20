package be.ac.umons;
import javafx.beans.InvalidationListener;

import java.util.Observable;
public class Stock  implements RessourceComponent {
    private String name;
    private int quantité;
    public Stock(String name,int quantité){
        this.name =name;
        this.quantité=quantité;

    }
    public String getName() {
        return name;
    }
    public int getQuantité(){return quantité;}
    public void setName(String n) { }

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
}
