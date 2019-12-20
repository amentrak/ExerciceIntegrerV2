package be.ac.umons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Algo1 implements ChoixAlgo {
    private ArrayList<Skill> ListSkills = new ArrayList<>();
    private ArrayList<Skill> SkillsTeam = new ArrayList<>();
    private ArrayList<Ressources> ListRessources = new ArrayList<>();
    private int durée;
    private Date deadline;
    private Date dd;
    private Date df;

    public boolean checkElementsinArray(ArrayList<Skill> fixedArray,ArrayList<Skill> inputArray)
    {

        if(fixedArray.size() <= inputArray.size())
        {
            for(var i = 0; i < fixedArray.size() ; i++)
            {
                if(!(inputArray.indexOf(fixedArray.get(i)) >= 0))
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;
    }

    public void Assignement(Tache tache, ArrayList<Team> teams){
        GregorianCalendar gc = new GregorianCalendar();
        Date deadline;
        ListSkills = tache.getListSkill();
        durée = tache.getDurée();
        deadline = tache.getDeadline();
        ListRessources = tache.getListRessources();

        for ( int i = 0; i < teams.size(); i++) {
            SkillsTeam = teams.get(i).getListSkill();
            if (checkElementsinArray(ListSkills, SkillsTeam)) {
                tache.setÉquipe(teams.get(i));
            }
        }
        if (tache.getÉquipe() == null){
            System.out.println("Aucune équipe n'est capable d'effectuer cette tâche");
        }
        else {
            for ( int i = 0; i < ListSkills.size();i++){
                for ( int j = 0; j < tache.getÉquipe().getListWorker().size(); j++){
                    for ( int k = 0; j < tache.getÉquipe().getListWorker().get(j).getListSkill().size(); k++) {
                        if (ListSkills.get(i) == tache.getÉquipe().getListWorker().get(j).getListSkill().get(k)) {
                            if (tache.getÉquipe().getListWorker().get(j).getListTache().size() != 0) {
                                dd = tache.getÉquipe().getListWorker().get(j).getListTache().get(tache.getÉquipe().getListWorker().get(j).getListTache().size() - 1).getDatefin();
                            }
                            else {
                                dd = gc.getTime() ;
                            }
                            tache.setDatedébut(dd);
                            gc.setTime(dd);
                            gc.add(GregorianCalendar.DATE, durée);

                            df = gc.getTime() ;

                            if (deadline.compareTo(df) >= 0) {
                                tache.setDatefin(df);
                                tache.addtravailleurs(tache.getÉquipe().getListWorker().get(j));
                                tache.getÉquipe().getListWorker().get(j).addTache(tache);
                                j = tache.getÉquipe().getListWorker().size();
                                break;
                            }
                        }
                    }
                }
            }
            if ( ListSkills. size() > tache.getÉquipe().getListWorker().size() ){
                System.out.println("La tâche ne peut pas être complétement effectuée pour cette date limite");
            }
            for ( int i = 0; i < ListRessources.size();i++){
                ListRessources.get(i).getListStock().size();
                for ( int j = 0; j <= ListRessources.size();j++){
                    ListRessources.get(i).getListStock().get(j).setQuantité(ListRessources.get(i).getListStock().get(j).getQuantité() - 1);
                }
            }

        }
    };
    public String toString(){
        return this.toString();
    }
}