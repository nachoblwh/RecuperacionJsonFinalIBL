package es.aad.belda_lupion_unidad2.ejercicio1.models;

/**
 * TeamScore class
 * This class will save information about the Teams and the Scores
 * This will be the result class.
 * @author Nacho
 */
public class TeamScore
{
    /**
     * Team attribute
     * This attribute will save the information about the team
     */
    String team;

    /**
     * goals_done attribute
     * this attribute will save the information about the goals_done
     */
    int goals_done;

    /**
     * goals_received attribute
     * This aatribute will save the information about the goals received
     */
    int goals_received;

    /**
     * Constructor with all the parameters
     * @param team
     * @param goals_done
     * @param goals_received
     */
    public TeamScore(String team, int goals_done, int goals_received)
    {
        this.team = team;
        this.goals_done = goals_done;
        this.goals_received = goals_received;
    }

    /**
     * Beans
     */
    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public int getGoals_done()
    {
        return goals_done;
    }

    public int setGoals_done(int goals_done)
    {
        this.goals_done = goals_done;
        return goals_done;
    }

    public int getGoals_received()
    {
        return goals_received;
    }

    public int setGoals_received(int goals_received)
    {
        this.goals_received = goals_received;
        return goals_received;
    }

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        return "TeamScore{" +
                "team='" + team + '\'' +
                ", goals_done=" + goals_done +
                ", goals_received=" + goals_received +
                '}';
    }
}
