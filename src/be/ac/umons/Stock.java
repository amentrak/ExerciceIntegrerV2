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
    public void setName(String n) {
        this.name = name;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
}
