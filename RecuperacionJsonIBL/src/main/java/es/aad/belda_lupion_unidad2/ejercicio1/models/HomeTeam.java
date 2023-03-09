package es.aad.belda_lupion_unidad2.ejercicio1.models;

/**
 * Team Class
 * This class will save the information about the Team
 * @author Nacho
 */
public class HomeTeam
{
    /**
     * Attribute id
     * Will save information about the identifier of the team
     */
    int home_team_id;

    /**
     * Attribute name
     * Will save the information about the name of the team
     */
    String home_team_name;

    /**
     * Empty constructor
     */
    public HomeTeam()
    {
    }

    /**
     * Beans
     */
    public int getId() {
        return home_team_id;
    }

    public void setId(int id) {
        this.home_team_id = id;
    }

    public String getHome_team_name() {
        return home_team_name;
    }

    public void setHome_team_name(String home_team_name) {
        this.home_team_name = home_team_name;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Team{" +
                "id=" + home_team_id +
                ", name='" + home_team_name + '\'' +
                '}';
    }
}
