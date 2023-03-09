package es.aad.belda_lupion_unidad2.ejercicio1.writer;

import es.aad.belda_lupion_unidad2.ejercicio1.models.TeamScore;
import es.aad.belda_lupion_unidad2.ejercicio2.models.PlayerLosses;

import java.util.List;

/**
 * Writer Class
 * This class will be the one that will help us to write the file with all the data
 * @author Nacho
 */
public class Writer1
{
    /**
     * Attribute teamScore
     * Will save the inforamtion about the teamScore
     */
    List<TeamScore> teamScore;

    /**
     * Constructor with all the parameters
     */
    public Writer1(List<TeamScore> teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * Beans
     */
    public List<TeamScore> getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(List<TeamScore> teamScore) {
        this.teamScore = teamScore;
    }

    /**
     * toString
     */
    @Override
    public String toString()
    {
        return "Writer1{" +
                "teamScore=" + teamScore +
                '}';
    }
}
