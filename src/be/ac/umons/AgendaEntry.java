package be.ac.umons;

import java.time.chrono.Chronology;
import java.util.Date;

public class AgendaEntry  {
    private int id_agenda;
    private Date Datedébut;
    private Date Datefin;
    public AgendaEntry(int id_agenda){}

    public Date getDatedébut() {
        return Datedébut;
    }

    public Date getDatefin() {
        return Datefin;
    }

    public int getId_agenda() {
        return id_agenda;
    }
    public String toString(){
        return (String.valueOf(this.Datedébut)+Datefin);

    }

}
