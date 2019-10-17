import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T newTeam){
        if (teams.contains(newTeam)){
            System.out.println(newTeam.getName() + " is already in this league");
            return false;
        }

        teams.add(newTeam);
        return true;
    }

    public void printTeams(){
        Collections.sort(teams);

        for (int i = 0; i < teams.size(); i++){
            System.out.println(teams.get(i).getName() + ": " + teams.get(i).ranking());
        }
    }
}
