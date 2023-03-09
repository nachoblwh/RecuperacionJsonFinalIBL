package es.aad.belda_lupion_unidad2.ejercicio2.writer;

import es.aad.belda_lupion_unidad2.ejercicio2.models.PlayerLosses;

import java.util.List;

/**
 * Clase Writer
 * Esta clase sera la encargada de ayudarnos a escribir el fichero con todos los datos ya recogidos.
 * @author Nacho
 */
public class Writer
{
    /**
     * Atributo lista jugadoresPerdidas
     * Guardara informacion sobre los los jugadores que han tenido perdidas de balon
     */
    List<PlayerLosses> playerLosses;

    /**
     * Constructor con todos los parametros
     */
    public Writer(List<PlayerLosses> playerLosses)
    {
        this.playerLosses = playerLosses;
    }

    /**
     * Beans
     */
    public List<PlayerLosses> getJugadoresPerdidas() {
        return playerLosses;
    }

    public void setJugadoresPerdidas(List<PlayerLosses> playerLosses) {
        this.playerLosses = playerLosses;
    }

    /**
     * toString
     */

    @Override
    public String toString() {
        return "Writer{" +
                "jugadoresPerdidas=" + playerLosses +
                '}';
    }
}
