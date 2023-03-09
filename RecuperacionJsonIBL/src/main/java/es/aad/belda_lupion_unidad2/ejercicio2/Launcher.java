package es.aad.belda_lupion_unidad2.ejercicio2;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectWriter;
import es.aad.belda_lupion_unidad2.ejercicio2.exception.Constants;
import es.aad.belda_lupion_unidad2.ejercicio2.exception.EventsException;
import es.aad.belda_lupion_unidad2.ejercicio2.filters.Filters;
import es.aad.belda_lupion_unidad2.ejercicio2.json.Json;
import es.aad.belda_lupion_unidad2.ejercicio2.models.PlayerLosses;
import es.aad.belda_lupion_unidad2.ejercicio2.writer.Writer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Launcher Class
 * This will be the Launcher of our application
 * We will do the calls here of the methods that we have on the Filters class
 * We will print the result on the file ejercicio2.json
 * @author Nacho
 */
public class Launcher
{
    /**
     * Using Logger
     */
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) throws EventsException
    {

        try
        {
            /**
             * With this we will print the file with the wanted format
             */
            ObjectWriter writer = Json.mapper().writer(new DefaultPrettyPrinter());
            /**
             * Creating the lists to do teh references
             */
            List<PlayerLosses> player;

            /**
             * Instance of our class Filter
             */
            Filters filtros = new Filters();
            player = filtros.showPlayers();


            /**
             * For the last, we do an Instance of our writer class that have an constructor
             * with the lists of our filter results
             */
            Writer writing = new Writer(player);
            writer.writeValue(new File("ejercicio2.json"), writing);

        }
        /**
         * OWN EXCEPTION
         */
        catch (IOException exception)
        {
            LOGGER.error(Constants.E_PARSING_JSON_TO_OBJECT, exception);
            throw new EventsException(Constants.E_PARSING_OBJECT_TO_JSON, "Error parsing Object to Json",exception);
        }

    }
}