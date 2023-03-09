package es.aad.belda_lupion_unidad2.ejercicio2.models;

/**
 * Player Class
 * This class will save information about a Player
 */
public class Player
{
    /**
     * id Attribute
     * Will save information about the identifier
     */
    int id;

    /**
     * Name attribute
     * Will save the information about the name of the player
     */
    String name;

    /**
     * Empty Constructor
     */
    public Player()
    {

    }

    /**
     * Beans
     */
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
