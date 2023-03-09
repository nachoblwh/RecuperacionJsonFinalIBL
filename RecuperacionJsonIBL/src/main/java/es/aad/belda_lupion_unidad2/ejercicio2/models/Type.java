package es.aad.belda_lupion_unidad2.ejercicio2.models;

/**
 * Type Class
 * This class will save the information about the type
 * @author Nacho
 */
public class Type
{
    /**
     * Atribute id
     * Will save the information about the identifier
     */
    int id;

    /**
     * Atribute name
     *  Will save the information about the type
     */
    String name;

    /**
     * Empty Construcotor
     */
    public Type()
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
     * toString
     */
    @Override
    public String toString()
    {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


