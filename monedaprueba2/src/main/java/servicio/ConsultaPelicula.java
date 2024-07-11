package servicio;
import model.Pelicula;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class ConsultaPelicula {
    private static final String SWAPI_BASE_URL = "https://v6.exchangerate-api.com/v6/2b74f5647151abf17497a17f/latest/USD";

    private Gson gson = new Gson();

    public Pelicula buscaPelicula() throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(SWAPI_BASE_URL );

        try {
            String json = httpClient.execute(request, response -> {
                int status = response.getStatusLine().getStatusCode();
                if (status >= 200 && status < 300) {
                    return EntityUtils.toString(response.getEntity());
                } else {
                    throw new IOException("Error al consultar la película. Código de estado: " + status);
                }
            });
            // Parse the JSON response to extract the nested JSON object
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
            JsonObject resultObject = jsonObject.getAsJsonObject("conversion_rates");  // Adjust this key based on your actual JSON structure

            // Map the nested JSON object to the Pelicula class
            return gson.fromJson(resultObject, Pelicula.class);


        } catch (IOException e) {
            throw new IOException("Error al consultar la película: " + e.getMessage(), e);
        }
    }
}

