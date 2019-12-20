package be.ac.umons;
import java.util.Observer;
public abstract class Personne implements Observer{
    private int id;
    private String name;
    private String password;
    public Personne(String name, int id,String password){
        this.name=name;
        this.id=id;
        this.password=password;
    }
    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }
    public String getPassword(){return password;}
    public String toString(){
        return this.toString();
    }
}
