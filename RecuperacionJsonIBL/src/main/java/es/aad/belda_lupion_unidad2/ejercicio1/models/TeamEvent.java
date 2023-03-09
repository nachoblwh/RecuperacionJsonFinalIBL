package es.aad.belda_lupion_unidad2.ejercicio1.models;

/**
 * Class TeamEvent
 * This class will save the information about the TeamEvent
 * @author Nacho
 */
public class TeamEvent
{
    /**
     * Attribute team
     * This is an attribute that save information about the HomeTeam
     */
    HomeTeam home_team;

    /**
     * Attribute away_team
     * This is an attribute that save information about the AwayTeam
     */
    AwayTeam away_team;

    /**
     * Attribute team_score
     * This is an attribute that save information about the team_score
     */
    int home_score;

    /**
     * Attribute away_score
     * This is an attribute that save information about the away_score
     */
     int away_score;

    /**
     * Empty constructor
     */
    public TeamEvent()
    {

    }

    /**
     * Beans
     */
    public HomeTeam getHome_team()
    {
        return home_team;
    }

    public void setHome_team(HomeTeam home_team)
    {
        this.home_team = home_team;
    }

    public AwayTeam getAway_team()
    {
        return away_team;
    }

    public void setAway_team(AwayTeam away_team)
    {
        this.away_team = away_team;
    }

    public int getHome_score()
    {
        return home_score;
    }

    public int setHome_score(int home_score)
    {
        this.home_score = home_score;
        return home_score;
    }

    public int getAway_score()
    {
        return away_score;
    }

    public int setAway_score(int away_score)
    {
        this.away_score = away_score;
        return away_score;
    }

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        return "TeamEvent{" +
                "team=" + home_team +
                ", away_team=" + away_team +
                ", team_score=" + home_score +
                ", away_score=" + away_score +
                '}';
    }
}
