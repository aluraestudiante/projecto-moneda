package util;



import model.Pelicula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void guardarJson(Pelicula pelicula) throws IOException {
        try (FileWriter escritura = new FileWriter("monedas1 "+ ".json")) {
            gson.toJson(pelicula, escritura);
        }
    }
}
