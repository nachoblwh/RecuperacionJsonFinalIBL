package es.aad.belda_lupion_unidad2.ejercicio2.models;

/**
 * Losses Event
 * This class will save information about the losses event
 * @author Nacho
 */
public class LossesEvent
{
    /**
     * Player Attribute
     * Will save the information about the player
     */
    Player player;

    /**
     * Type attribute
     * Will save the information about the type
     */
    Type type;

    /**
     * Empty constructor
     */
    public LossesEvent()
    {

    }

    /**
     * Beans
     */
    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
    {
        this.type = type;
    }

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        return "EventoPerdida{" +
                "player=" + player +
                ", type=" + type +
                '}';
    }
}
