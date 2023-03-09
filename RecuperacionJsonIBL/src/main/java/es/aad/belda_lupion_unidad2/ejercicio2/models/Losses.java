package es.aad.belda_lupion_unidad2.ejercicio2.models;

/**
 * Losses class
 * this class wil save the information about the losses
 * @author Nacho
 */
public class Losses
{
    /**
     * losses attribute
     * Guardara informacion sobre los pases
     */
    int losses;

    /**
     * Constructor with all the parameters
     */
    public Losses(int losses)
    {
        this.losses = losses;
    }

    /**
     * Beans
     * @return
     */
    public int getLosses()
    {
        return losses;
    }

    public void setLosses(int losses)
    {
        this.losses = losses;
    }

    /**
     * toString
     */
    @Override
    public String toString()
    {
        return "Losses{" +
                "losses=" + losses +
                '}';
    }
}
