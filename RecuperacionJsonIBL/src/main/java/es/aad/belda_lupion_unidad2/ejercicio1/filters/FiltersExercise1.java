package es.aad.belda_lupion_unidad2.ejercicio1.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.aad.belda_lupion_unidad2.ejercicio1.models.TeamEvent;
import es.aad.belda_lupion_unidad2.ejercicio1.models.TeamScore;
import es.aad.belda_lupion_unidad2.ejercicio2.json.Json;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

/**
 * Filters Class
 * This class will do all the filters of the exercise
 * @author Nacho
 */
public class FiltersExercise1
{
    /**
     * Logger
     */
    private final Logger LOGGER = LogManager.getLogger();
    public List<TeamScore> showTeams() throws IOException
    {
        /**
         * Using mapper.
         * With DefaultPrettyPrinter we will print the json with the wished format.
         */
        ObjectMapper mapper = Json.mapper();

        /**
         * We create a list to read all the information of the json
         */
        List<TeamEvent> jsonList = mapper.readValue(Paths.get("43.json").toFile(), mapper.getTypeFactory().constructCollectionType(List.class, TeamEvent.class));

        /**
         * We create another list where we will save the information about all the matches of the json
         */
        List<TeamEvent> teamList = new ArrayList<TeamEvent>();

        /**
         * We will use this map to get all the teams and scores without repeating them on the result list.
         */
        Map<String, TeamScore> teamScore = new HashMap<>();

        for (int i=0;i<jsonList.size();i++)
        {

            /**
             * Here we will get the information about the team, is it's not null, we add it.
             */
            if (jsonList.get(i).getHome_team().getHome_team_name() != null)
            {

                this.LOGGER.info(jsonList.get(i).toString());

                /**
                 *  We add it to the created list where we´ll save the information of the scores and we sum the result
                 */
                teamList.add(jsonList.get(i));
            }
        }

        /**
         * This list will be the list that we will use to show the results
         */
        List<TeamScore> listTeamScore = new ArrayList<TeamScore>();


        /**
         * Adding home Teams
         */
        for (int i=0;i<teamList.size();i++)
        {
            /**
             * We almacenate in a variable the name of the home team
             */
            String homeTeam= teamList.get(i).getHome_team().getHome_team_name();

            /**
             * If the map has the name of the homeTeam:
             */
            if (teamScore.containsKey(homeTeam))
            {
                /**
                 * Takes the score of the home team
                 */
                int homeScore = teamList.get(i).getHome_score();
                /**
                 * We create a variable to almacenate the goals that a team has done
                 */
                int HomeScoreDone = teamScore.get(homeTeam).getGoals_done();

                /**
                 * This variable will take the score of the awayTeam
                 */
                int homeScoreReceived = teamList.get(i).getAway_score();
                /**
                 * We create a variable to almacenate the goals that a team has received
                 */
                int AwayScoreDone = teamScore.get(homeTeam).getGoals_received();

                /**
                 * Here we sum the score of the team and the score that the team has received
                 */
                int resultHomeScore = homeScore+HomeScoreDone;
                int resultHomeScoreReceived = homeScoreReceived + AwayScoreDone;

                teamScore.put(homeTeam, new TeamScore(homeTeam,resultHomeScore, resultHomeScoreReceived));
            }
            /**
             * If the team doest exist in the map, we add it, and we put a new instance with the values of the team in the first match
             */
            else
            {
                teamScore.put(homeTeam, new TeamScore(homeTeam, teamList.get(i).getHome_score(), teamList.get(i).getAway_score()));
            }

        }

        /**
         * Adding Away Teams
         */
        for (int i=0;i<teamList.size();i++)
        {
            /**
             * We almacenate in a variable the name of the away team
             */
            String awayTeam = teamList.get(i).getAway_team().getAway_team_name();

            /**
             * If the map has the name of the awayTeam:
             */
            if (teamScore.containsKey(awayTeam))
            {

                /**
                 * Takes the score of the away team
                 */
                int homeScore = teamList.get(i).getAway_score();
                /**
                 * We create a variable to almacenate the goals that a team has done
                 */
                int HomeScoreDone = teamScore.get(awayTeam).getGoals_done();

                /**
                 * This variable will take the score of the homeTeam
                 */
                int homeScoreReceived = teamList.get(i).getHome_score();
                /**
                 * We create a variable to almacenate the goals that a team has received
                 */
                int AwayScoreDone = teamScore.get(awayTeam).getGoals_received();

                /**
                 * Here we sum the score of the team and the score that the team has received
                 */
                int resultHomeScore = homeScore+HomeScoreDone;
                int resultHomeScoreReceived = homeScoreReceived + AwayScoreDone;

                /**
                 * We add it to the map.
                 * We create a new instance of TeamScore that have the parameteros of the name of the team, the score of the team and the score that
                 * has received
                 */
                teamScore.put(awayTeam, new TeamScore(awayTeam, resultHomeScore, resultHomeScoreReceived));
            }
            /**
             * If the team doest exist in the map, we add it, and we put a new instance with the values of the team in the first match
             */
            else
            {
                teamScore.put(awayTeam, new TeamScore(awayTeam, teamList.get(i).getAway_score(), teamList.get(i).getHome_score()));
            }
        }

        /**
         * Iterating the map and adding the results to the list.
         * getValue is an instance the teamScore that contains the results of the exercise.
         */
        for (Map.Entry<String,TeamScore> teamLossesMap:teamScore.entrySet())
        {
            listTeamScore.add(teamLossesMap.getValue());
        }

        /**
         * Sorting the list.
         * We have to call Collections and the list of TeamScore.
         * Then we compare two of them for the sorting
         */
        Collections.sort(listTeamScore, new Comparator<TeamScore>()
        {
            @Override
            public int compare(TeamScore teamScore1, TeamScore teamScore2)
            {
                /**
                 * Descending
                 */
                return teamScore2.getGoals_done() - teamScore1.getGoals_done();
            }
        });

        /**
         * return the result list
         */
        return listTeamScore;

    }
}


