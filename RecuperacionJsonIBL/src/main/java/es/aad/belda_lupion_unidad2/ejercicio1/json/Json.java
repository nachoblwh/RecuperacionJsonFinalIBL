package es.aad.belda_lupion_unidad2.ejercicio1.json;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Class Json
 * This class will help us to print the results on the file
 * @author Nacho
 */
public class Json
{
    private static ObjectMapper mapper;
    public static ObjectMapper mapper()
    {
        if(Json.mapper==null)
        {
            Json.mapper = Json.createJson();
        }
        return Json.mapper;
    }
    private static ObjectMapper createJson()
    {
        final ObjectMapper mapper = new ObjectMapper();

        mapper.configure(JsonParser.Feature.IGNORE_UNDEFINED, true);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return mapper;
    }
}
