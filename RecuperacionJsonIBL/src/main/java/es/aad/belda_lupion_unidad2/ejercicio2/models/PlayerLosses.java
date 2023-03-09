package es.aad.belda_lupion_unidad2.ejercicio2.models;

/**
 * PlayerLosses Class
 * This class will save information about a PlayerLosses
 * This will be the result class.
 * @author Nacho
 */
public class PlayerLosses
{
    /**
     * Atribute name
     * Will save the information about the name of the Player
     */
    String name;

    /**
     * Atribute losses
     * This attribute will save the information abaout the loses
     */
    int loses;

    /**
     * Constructor with all the parameters
     */
    public PlayerLosses(String name, int loses)
    {
        this.name = name;
        this.loses = loses;
    }

    /**
     * Beans
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    /**
     * ToString
     */
    @Override
    public String toString()
    {
        return "PLayerLosses{" +
                "nombre='" + name + '\'' +
                ", loses=" + loses +
                '}';
    }
}
