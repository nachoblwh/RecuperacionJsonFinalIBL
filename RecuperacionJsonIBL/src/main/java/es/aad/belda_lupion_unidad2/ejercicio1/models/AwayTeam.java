package es.aad.belda_lupion_unidad2.ejercicio1.models;

/**
 * Team Class
 * This class will save the information about the Team
 * @author Nacho
 */
public class AwayTeam
{
    /**
     * Attribute id
     * Will save information about the identifier of the team
     */
    int away_team_id;

    /**
     * attribute name
     * will save information about the name of the awayTeam
     */
    String away_team_name;

    /**
     * Empty constructor
     */
    public AwayTeam()
    {
    }

    /**
     * Beans
     */
    public int getAway_team_id() {
        return away_team_id;
    }

    public void setAway_team_id(int away_team_id) {
        this.away_team_id = away_team_id;
    }

    public String getAway_team_name() {
        return away_team_name;
    }

    public void setAway_team_name(String away_team_name) {
        this.away_team_name = away_team_name;
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        return "Team{" +
                "id=" + away_team_id +
                ", name='" + away_team_name + '\'' +
                '}';
    }
}
