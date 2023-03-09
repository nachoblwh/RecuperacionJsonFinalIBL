package es.aad.belda_lupion_unidad2.ejercicio2.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.aad.belda_lupion_unidad2.ejercicio2.json.Json;
import es.aad.belda_lupion_unidad2.ejercicio2.models.LossesEvent;
import es.aad.belda_lupion_unidad2.ejercicio2.models.PlayerLosses;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;


/**
 * Filters Class
 * This class will do all the filters of the exercise
 */
public class Filters
{
    /**
     * Logger
     */
    private static final Logger LOGGER = LogManager.getLogger();
    public List<PlayerLosses> showPlayers() throws IOException
    {
        /**
         * Using mapper.
         * With DefaultPrettyPrinter we will print the json with the wished format.
         */
        ObjectMapper mapper = Json.mapper();

        /**
         * We create a list to read all the information of the json
         */
        List<LossesEvent> jsonList = mapper.readValue(Paths.get("3795220.json").toFile(), mapper.getTypeFactory().constructCollectionType(List.class, LossesEvent.class));

        /**
         * We create another list where we will save the information about all the losses of the json
         */
        List<LossesEvent> goalList = new ArrayList<LossesEvent>();

        Map<String, Integer> playersAndLosses = new HashMap<>();

        /**
         * We will create a variable to count the losses
         */
        int countlosses = 0;
        for (int i=0;i<jsonList.size();i++)
        {

            /**
             * Here we will get the information about the type
             */
            if (jsonList.get(i).getType()!=null)
            {

                /**
                 * Here we will get the information on the loss of the ball, since in the json when reading outcome, if it contains the id 38 it means that control of the ball has been lost.
                 */
                if (jsonList.get(i).getType().getId()==38||jsonList.get(i).getType().getId()==3)
                {
                    countlosses++;
                    LOGGER.info(jsonList.get(i).toString());

                    /**
                     *  We add it to the created list where we´ll save the information of the losses
                     */
                    goalList.add(jsonList.get(i));
                }
            }
        }

        /**
         * Instance of PlayerLosses
         */
        PlayerLosses losses;

        /**
         * Creating a list to get all the players with losses
         */
        List<PlayerLosses> listPlayerLosses = new ArrayList<PlayerLosses>();

        /**
         * Then we iterate the list with the players
         */
        for (int i=0;i<goalList.size();i++)
        {
            /**
             * If exists, the map will sum 1 to the initial value (1).
             */
            String nombreJugador= goalList.get(i).getPlayer().getName();
            if (playersAndLosses.containsKey(goalList.get(i).getPlayer().getName()))
            {
                playersAndLosses.put(nombreJugador, playersAndLosses.get(nombreJugador)+1);
            }
            /**
             * If the player don't exist, we add it to the map
             */
            else
            {
                playersAndLosses.put(nombreJugador, 1);
            }

        }

        /**
         * Iterating the map and adding the results to the list.
         */
        for (Map.Entry<String,Integer> jugadoresMapa:playersAndLosses.entrySet())
        {
            losses = new PlayerLosses(jugadoresMapa.getKey(),jugadoresMapa.getValue());
            listPlayerLosses.add(losses);
        }

        /**
         * Sorting the list.
         * We have to call Collections and the list of PlayerLosses.
         * Then we compare two of them for the sorting
         */
        Collections.sort(listPlayerLosses, new Comparator<PlayerLosses>()
        {
            @Override
            public int compare(PlayerLosses losses1, PlayerLosses losses2)
            {
                /**
                 * Descending
                 */
                return losses2.getLoses() - losses1.getLoses();
            }
        });

        /**
         * return the result
         */
        return listPlayerLosses;

    }
}
